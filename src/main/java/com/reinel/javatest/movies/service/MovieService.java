package com.reinel.javatest.movies.service;

import com.reinel.javatest.movies.data.MovieRepository;
import com.reinel.javatest.movies.model.Genre;
import com.reinel.javatest.movies.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieService {

    private MovieRepository movieRepository;




    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getGenre() == genre).collect(Collectors.toList());
    }


    public Collection<Movie> findMoviesByLength(int minutes) {
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getMinutes() <= minutes).collect(Collectors.toList());
    }
}