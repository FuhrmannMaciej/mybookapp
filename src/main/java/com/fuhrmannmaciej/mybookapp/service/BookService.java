package com.fuhrmannmaciej.mybookapp.service;

import com.fuhrmannmaciej.mybookapp.dao.BookRepository;
import com.fuhrmannmaciej.mybookapp.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(@Qualifier("books") BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Transactional
    public List<Book> findAll() {

        return bookRepository.findAll();
    }


    @Transactional
    public Book findById(int id) {

        return bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book id not found - " + id));
    }

    @Transactional
    public void save(Book book) {

        bookRepository.save(book);
    }

    @Transactional
    public void update(Book book) {

        Book dbBook = findById(book.getId());

        dbBook.setAuthor(book.getAuthor());
        dbBook.setTitle(book.getTitle());
        dbBook.setYearOfRelease(book.getYearOfRelease());
        dbBook.setRating(book.getRating());

        save(dbBook);

    }

    @Transactional
    public void deleteById(int id) {

        bookRepository.deleteById(id);
    }
}
