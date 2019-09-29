package com.fuhrmannmaciej.mybookapp.repository;

import com.fuhrmannmaciej.mybookapp.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
