package com.example.movieapi.service;

import com.example.movieapi.entity.Movie;
import com.example.movieapi.repository.MovieRepository;

import org.hibernate.type.descriptor.jdbc.TimestampUtcAsOffsetDateTimeJdbcType;
import org.springframework.stereotype.Service;
import java.time.LocalDate;

import java.sql.Date;
import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getPopularMovies() {
        return movieRepository.findByIsPopularTrue();
    }

    public List<Movie> getMoviesByGenre(String genre) {
        return movieRepository.findByGenre(genre);
    }
        public List<Movie> getUpcomingMovies() {
            LocalDate today = LocalDate.now(); // Get today's date
            return movieRepository.findByReleaseDateAfter(today); // Fetch movies with a release date after today
        }
    }
