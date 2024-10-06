package com.example.movieapi.entity;
import java.time.LocalDate;

//import javax.persistence.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isPopular() {
        return isPopular;
    }

    public void setPopular(boolean isPopular) {
        this.isPopular = isPopular;
    }
    

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
    


    public String getposter_url() {
        return poster_url;
    }

    public void setposter_url(String poster_url) {
        this.poster_url = poster_url;
    }



    private String title;
    private String genre;
    private boolean isPopular;
    private LocalDate releaseDate;
    private String poster_url;

    // Constructors
    public Movie() {
    }

    public Movie(String title, String genre, boolean isPopular,LocalDate releaseDate,String poster_url) {
        this.title = title;
        this.genre = genre;
        this.isPopular = isPopular;
        this.releaseDate = releaseDate;
        this.poster_url=poster_url;
        
    }

    // Getters and Setters
    // (Generate getters and setters for all fields)
}