package com.fuhrmannmaciej.mybookapp.service;

import com.fuhrmannmaciej.mybookapp.entity.Book;
import org.springframework.batch.item.ItemProcessor;

public class BookItemProcessor implements ItemProcessor<Book, Book> {

    @Override
    public Book process(Book book) throws Exception {
        return book;
    }
}
