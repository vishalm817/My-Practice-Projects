package com.moviecatalogservice.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.moviecatalogservice.model.CatalogItem;
import com.moviecatalogservice.model.Movie;
import com.moviecatalogservice.model.Rating;



@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {
	 

    // get all ratd mvie id's
    // for each movie id, get info-> moviename, movie description
    // put them all together 
 
 

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable String  userId) {
        RestTemplate restTemplate = new RestTemplate();
 

                List<Rating>  ratingList = Arrays.asList(new Rating("123",4),new Rating("5678", 3));
        //        return ratingList.stream().map(rating ->{
        //        restTemplate.getForObject("http://localhost:9001/movies/3", Movie.class)
        //            new CatalogItem("spiderman","aliens description",4)
        //        })
        //        .collect(Collectors.toList());
 
        return ratingList.stream()
                .map(rating -> {
                    Movie movie = restTemplate.getForObject("http://localhost:9091/movie/3", Movie.class);
//                    return new CatalogItem(movie.getName(), "", rating.getRating());
                    return new CatalogItem(movie.getName(),"aliens description",4);
                })
                .collect(Collectors.toList());
 
        //        return Collections.singletonList(new CatalogItem("spiderman","test",4));
    }
 
}