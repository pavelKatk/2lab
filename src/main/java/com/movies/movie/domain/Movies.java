package com.movies.movie.domain;

import javax.persistence.*;

@Entity
@Table(name = "movies")
public class Movies {

    public  Movies() {
    }
    public Movies(Integer year, String name, String country, String genre, Integer duration) {
        this.year = year;
        this.name = name;
        this.country = country;
        this.genre = genre;
        this.duration = duration;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "year")
    private Integer year;

    @Column(name = "name")
    private String name;

    @Column(name = "country")
    private String country;

    @Column(name = "genre")
    private String genre;

    @Column(name = "duration")
    private Integer duration;

    @OneToOne(mappedBy = "movies", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Rating rate;


    public Rating getRate() {
        return rate;
    }

    public void setRate(Rating rate) {
        this.rate = rate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
