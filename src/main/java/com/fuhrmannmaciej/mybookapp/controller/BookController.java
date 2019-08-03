package com.fuhrmannmaciej.mybookapp.controller;

import com.fuhrmannmaciej.mybookapp.entity.Book;
import com.fuhrmannmaciej.mybookapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/list")
    public List<Book> getAllBooks() {

        return bookService.findAll();
    }

    @GetMapping("/{bookId}")
    public Book getBook(@PathVariable int bookId) {

        return bookService.findById(bookId);
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {

        bookService.save(book);

        return book;
    }

    @PutMapping("/{bookId}")
    public Book updateBook(@PathVariable String bookId, @RequestBody Book book) {

        bookService.update(book);

        return book;
    }

    @DeleteMapping("/{bookId}")
    public String deleteBook(@PathVariable int bookId) {

        bookService.deleteById(bookId);

        return "Deleted item id - " + bookId;
    }
}
