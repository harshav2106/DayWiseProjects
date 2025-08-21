package com.wipro.entity.relationdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.entity.relationdemo.entity.Genre;
import com.wipro.entity.relationdemo.repo.GenreRepo;
import com.wipro.entity.relationdemo.service.GenreService;
@Service
public class GenreServiceImpl implements GenreService {
	@Autowired
    private GenreRepo genreRepo;

	@Override
	public Genre saveGenre(Genre genre) {
		return genreRepo.save(genre);
	}

	public List<Genre> getAllGenres() {
		return genreRepo.findAll();
	}

}
