package com.wipro.entity.relationdemo.service;

import java.util.List;

import com.wipro.entity.relationdemo.entity.Movie;

public interface MovieService {
	Movie saveMovie(Movie movie, List<Long> genreIds);
    List<Movie> getAllMovies();
    Movie getMovieById(Long id);

}
