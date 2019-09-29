package com.fuhrmannmaciej.mybookapp.repository;

import com.fuhrmannmaciej.mybookapp.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
