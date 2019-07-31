package com.fuhrmannmaciej.mybookapp.controller;

import com.fuhrmannmaciej.mybookapp.entity.Movie;
import com.fuhrmannmaciej.mybookapp.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/{movieId}")
    public Movie getMovie(@PathVariable int movieId) {

        return movieService.findById(movieId);
    }

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) {

        movieService.save(movie);

        return movie;
    }

    @PutMapping("/{movieId}")
    public Movie updateMovie(@PathVariable String movieId, @RequestBody Movie movie) {

        movieService.update(movie);

        return movie;
    }

    @DeleteMapping("/{movieId}")
    public String deleteMovie(@PathVariable int movieId) {

        movieService.deleteById(movieId);

        return "Deleted item id - " + movieId;
    }
}
