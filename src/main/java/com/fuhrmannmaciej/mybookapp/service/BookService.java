package com.fuhrmannmaciej.mybookapp.service;

import com.fuhrmannmaciej.mybookapp.dao.BookRepository;
import com.fuhrmannmaciej.mybookapp.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
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

        //logic to add
        Book dbBook = findById(book.getId());

        dbBook.setTitle(book.getTitle());
        dbBook.setGenre(book.getGenre());

        save(dbBook);

    }

    @Transactional
    public void deleteById(int id) {

        bookRepository.deleteById(id);
    }
}
