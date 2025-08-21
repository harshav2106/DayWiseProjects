package com.wipro.entiity.relationdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.entiity.relationdemo.dto.GenreRequest;
import com.wipro.entity.relationdemo.entity.Genre;
import com.wipro.entity.relationdemo.service.GenreService;

@RestController
@RequestMapping("/genres")
public class GenreController {

    @Autowired
    private GenreService genreService;

    @PostMapping
    public Genre createGenre(@RequestBody GenreRequest request) {
        Genre genre = new Genre(request.getDescription());
        return genreService.saveGenre(genre);
    }

    @GetMapping
    public List<Genre> getAllGenres() {
        return genreService.getAllGenres();
    }
}
