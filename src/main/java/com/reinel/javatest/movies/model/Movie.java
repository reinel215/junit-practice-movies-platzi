package com.reinel.javatest.movies.model;

import java.util.Objects;

public class Movie {

    private Integer id;
    private String name;
    private int minutes;
    private Genre genre;
    private String director;

    public Movie(String name, int minutes, Genre genre, String director) {
        this.id = null;
        this.name = name;
        this.minutes = minutes;
        this.genre = genre;
        this.director = director;
    }


    public Movie(Integer id, String name, int minutes, Genre genre, String director) {
        this.id = id;
        this.name = name;
        this.minutes = minutes;
        this.genre = genre;
        this.director = director;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return this.id == movie.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, minutes, genre);
    }
}
