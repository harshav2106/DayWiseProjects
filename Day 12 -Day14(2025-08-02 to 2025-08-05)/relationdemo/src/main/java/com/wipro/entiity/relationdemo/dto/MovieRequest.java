package com.wipro.entiity.relationdemo.dto;

import java.util.List;

public class MovieRequest {
    private String title;
    private List<Long> genreIds;

    
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public List<Long> getGenreIds() { return genreIds; }
    public void setGenreIds(List<Long> genreIds) { this.genreIds = genreIds; }
}