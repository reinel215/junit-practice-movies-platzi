package com.reinel.javatest.movies.data;
import com.reinel.javatest.movies.model.Genre;
import com.reinel.javatest.movies.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.Collection;

public class MovieRepositoryJdbc implements MovieRepository {

    private JdbcTemplate jdbcTemplate;

    public MovieRepositoryJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Movie findById(long id) {
        Object[] args = {id};
        return jdbcTemplate.queryForObject("SELECT * FROM movies WHERE id = ?", args , movieMapper );
    }

    @Override
    public Collection<Movie> findAll() {
        return jdbcTemplate.query("select * from movies", movieMapper);
    }

    @Override
    public void saveOrUpdate(Movie movie) {
        Object[] args = { movie.getName(), movie.getMinutes(), movie.getGenre().toString() };
        jdbcTemplate.update("INSERT INTO movies(name,minutes,genre) VALUES (?,?,?)", args);
    }

    @Override
    public Collection<Movie> findByName(String movieName) {
        Object[] args = {"%" + movieName.toLowerCase() + "%"};
        return jdbcTemplate.query("SELECT * FROM movies WHERE LOWER(name) LIKE ?", args ,movieMapper);
    }


    private static RowMapper<Movie> movieMapper = (rs, rowNum) ->
            new Movie(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("minutes"),
                    Genre.valueOf(rs.getString("genre")),
                    rs.getString("director"));
}