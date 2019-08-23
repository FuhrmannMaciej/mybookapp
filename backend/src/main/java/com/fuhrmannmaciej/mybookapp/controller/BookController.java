package com.fuhrmannmaciej.mybookapp.controller;

import com.fuhrmannmaciej.mybookapp.entity.Book;
import com.fuhrmannmaciej.mybookapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
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
    public Book updateBook(@PathVariable int bookId, @RequestBody Book book) {

        bookService.update(book);

        return book;
    }

    @DeleteMapping("/{bookId}")
    public String deleteBook(@PathVariable int bookId) {

        bookService.deleteById(bookId);

        return "Deleted item id - " + bookId;
    }
}
