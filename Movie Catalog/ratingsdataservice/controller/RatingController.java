package com.ratingsdataservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ratingsdataservice.model.Rating;

@RestController
@RequestMapping("/rating")
public class RatingController {

@RequestMapping("/{userId}")
public Rating getRating(@PathVariable String userId) {
return new Rating(userId,"5");

}



}
