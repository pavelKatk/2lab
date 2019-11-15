package com.movies.movie;

import com.movies.movie.domain.Movies;
import com.movies.movie.domain.Rating;
import com.movies.movie.repos.MoviesRepo;
import com.movies.movie.repos.RatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import  java.util.Map;

@Controller
public class GreetingController {
    @Autowired
    private MoviesRepo moviesRepo;

    @Autowired
    private RatingRepo ratingRepo;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }
@GetMapping
    public String main(Map< String, Object> model) {
        Iterable<Movies> movies =  moviesRepo.findAll();
        Iterable<Rating> ratings = ratingRepo.findAll();

        model.put("movies", movies);
        model.put("ratings", ratings);
        return "main";
}

@PostMapping("/main")
    public String add(@RequestParam String name, @RequestParam String genre, @RequestParam String country,
                      @RequestParam Integer year, @RequestParam Integer duration, @RequestParam Integer audience,
                      @RequestParam Float rating, @RequestParam Float fees,  Map<String, Object> model) {

        Movies movie = new Movies(year, name, country, genre, duration);

        moviesRepo.save(movie);
        //ratingRepo.save(rate);

        Iterable<Movies> movies =  moviesRepo.findAll();
        //Iterable<Rating> ratings = ratingRepo.findAll();

        model.put("movies", movies);
        //model.put("ratings", ratings);
        Rating rate = new Rating(rating, audience, fees);
        rate.setMovies(movie);
        ratingRepo.save(rate);


        return "main";
}

}