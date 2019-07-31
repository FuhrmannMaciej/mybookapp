package com.fuhrmannmaciej.mybookapp.dao;

import com.fuhrmannmaciej.mybookapp.entity.Movie;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Qualifier("movies")
@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
