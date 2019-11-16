package com.movies.movie.repos;

import com.movies.movie.domain.Rating;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RatingRepo extends CrudRepository<Rating, Integer> {
}
