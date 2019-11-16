package com.movies.movie.domain;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;

@Entity
@Table(name = "rating")
public class Rating {

    public Rating() {
    }


    public Rating(Float rating, Integer audience, Float fees) {
        this.rating = rating;
        this.audience = audience;
        this.fees = fees;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private Float rating;

    private Integer audience;

    private Float fees;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public Integer getAudience() {
        return audience;
    }

    public void setAudience(Integer audience) {
        this.audience = audience;
    }

    public Float getFees() {
        return fees;
    }

    public void setFees(Float fees) {
        this.fees = fees;
    }


}
