package com.example.Nxtseries;


import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class moviesentity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String genre;
    private String poster;
    private boolean ispopular;
    private LocalDate releasedate;
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
    public String getPoster() {
        return poster;
    }
    public void setPoster(String poster) {
        this.poster = poster;
    }
    public boolean isIspopular() {
        return ispopular;
    }
    public void setIspopular(boolean ispopular) {
        this.ispopular = ispopular;
    }
    public LocalDate getReleasedate() {
        return releasedate;
    }
    public void setReleasedate(LocalDate releasedate) {
        this.releasedate = releasedate;
    }
    public moviesentity(Long id, String title, String genre, String poster, boolean ispopular, LocalDate releasedate) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.poster = poster;
        this.ispopular = ispopular;
        this.releasedate = releasedate;
    }
    
}
