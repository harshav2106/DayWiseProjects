package com.wipro.entity.relationdemo.service;

import java.util.List;

import com.wipro.entity.relationdemo.entity.Genre;

public interface GenreService {
	Genre saveGenre(Genre genre);
    List<Genre> getAllGenres();

}
