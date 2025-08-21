package com.wipro.entity.relationdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.entity.relationdemo.entity.Genre;

public interface GenreRepo extends JpaRepository<Genre, Long> {

}
