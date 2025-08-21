package com.wipro.entity.relationdemo.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.entity.relationdemo.entity.Genre;
import com.wipro.entity.relationdemo.entity.Movie;
import com.wipro.entity.relationdemo.repo.GenreRepo;
import com.wipro.entity.relationdemo.repo.MovieRepo;
import com.wipro.entity.relationdemo.service.MovieService;
@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
    private MovieRepo movieRepo;

    @Autowired
    private GenreRepo genreRepo;

	@Override
	public Movie saveMovie(Movie movie, List<Long> genreIds) {
		Set<Genre> genres = new HashSet<>(genreRepo.findAllById(genreIds));
        movie.setGenres(genres);
        return movieRepo.save(movie);
	}

	@Override
	public List<Movie> getAllMovies() {
		
		return movieRepo.findAll();
	}

	@Override
	public Movie getMovieById(Long id) {
		return movieRepo.findById(id).orElse(null);
	}

}
