package com.reinel.javatest.movies.service;

import com.reinel.javatest.movies.data.MovieRepository;
import com.reinel.javatest.movies.model.Genre;
import com.reinel.javatest.movies.model.Movie;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MovieServiceShould {

    private MovieService movieService;

    @Before
    public void setUp() throws Exception {

        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);

        Mockito.when(movieRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1, "Dark Knight", 152, Genre.ACTION, "Director 1"),
                        new Movie(2, "Memento", 113, Genre.THRILLER, "Director 1"),
                        new Movie(3, "There's Something About Mary", 119, Genre.COMEDY, "Director 1"),
                        new Movie(4, "Super 8", 112, Genre.THRILLER, "Director 1"),
                        new Movie(5, "Scream", 111, Genre.HORROR, "Director 1"),
                        new Movie(6, "Home Alone", 103, Genre.COMEDY, "Director 1"),
                        new Movie(7, "Matrix", 136, Genre.ACTION, "Director 1")
                )
        );

        movieService = new MovieService(movieRepository);
    }

    @Test
    public void return_movies_by_genre() {
        Collection<Movie> movies = movieService.findMoviesByGenre(Genre.COMEDY);
        Assert.assertEquals(Arrays.asList(3,6),getMovieIds(movies));
    }


    @Test
    public void return_movies_by_length() {
        Collection<Movie> movies = movieService.findMoviesByLength(115);
        Assert.assertEquals(Arrays.asList(2,4,5,6),getMovieIds(movies));
    }

    private List<Integer> getMovieIds(Collection<Movie> movies) {
        return movies.stream().map(Movie::getId).collect(Collectors.toList());
    }
}