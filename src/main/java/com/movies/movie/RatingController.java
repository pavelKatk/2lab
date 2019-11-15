/*package com.movies.movie;

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
public class RatingController {

    @Autowired
    private RatingRepo ratingRepo;

@GetMapping
    public String main(Map< String, Object> model) {
        Iterable<Rating> rating =  ratingRepo.findAll();
        model.put("rating", rating);
        return "main";
    }


  @PostMapping("/main")
    public String add(@RequestParam Float rate, @RequestParam Integer audience, @RequestParam Float fees,
             Map<String, Object> model) {

        Rating rating = new Rating(rate, audience, fees);

        ratingRepo.save(rating);

        Iterable<Rating> ratings =  ratingRepo.findAll();
        model.put("rating", rating);
        return "main";
    }

}*/