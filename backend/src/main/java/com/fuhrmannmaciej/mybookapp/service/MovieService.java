package com.fuhrmannmaciej.mybookapp.service;

import com.fuhrmannmaciej.mybookapp.entity.Movie;
import com.fuhrmannmaciej.mybookapp.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class MovieService {

    private MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
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

        Movie dbMovie = findById(movie.getId());

        dbMovie.setTitle(movie.getTitle());

        save(dbMovie);

    }

    @Transactional
    public void deleteById(int id) {

        movieRepository.deleteById(id);
    }
}
