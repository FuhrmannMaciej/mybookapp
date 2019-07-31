package com.fuhrmannmaciej.mybookapp.service;

import com.fuhrmannmaciej.mybookapp.dao.MovieRepository;
import com.fuhrmannmaciej.mybookapp.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class MovieService {

    private MovieRepository movieRepository;

    @Autowired
    public MovieService(@Qualifier("movies") MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Transactional
    public Movie findById(int id) {

        return movieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Movie id not found - " + id));
    }

    @Transactional
    public void save(Movie movie) {

        movieRepository.save(movie);
    }

    @Transactional
    public void update(Movie movie) {

        //logic to add
        Movie dbMovie = findById(movie.getId());

        dbMovie.setTitle(movie.getTitle());
        dbMovie.setGenre(movie.getGenre());

        save(dbMovie);

    }

    @Transactional
    public void deleteById(int id) {

        movieRepository.deleteById(id);
    }
}
