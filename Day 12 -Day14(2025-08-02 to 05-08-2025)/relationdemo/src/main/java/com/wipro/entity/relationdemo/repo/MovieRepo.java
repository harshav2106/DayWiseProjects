package com.wipro.entity.relationdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.entity.relationdemo.entity.Movie;

public interface MovieRepo extends JpaRepository<Movie, Long> {
	

}
