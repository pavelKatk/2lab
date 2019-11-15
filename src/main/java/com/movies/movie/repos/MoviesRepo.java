package com.movies.movie.repos;

import com.movies.movie.domain.Movies;
import org.springframework.data.repository.CrudRepository;

public interface MoviesRepo extends CrudRepository<Movies, Integer> {
}
