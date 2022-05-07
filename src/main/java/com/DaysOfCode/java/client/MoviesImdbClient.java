package com.DaysOfCode.java.client;

import com.DaysOfCode.java.api.response.Top250DataResponse;
import com.DaysOfCode.java.api.response.Top250MoviesTitleAndImageResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "${url.imdb}", name = "moviesImdb")
public interface MoviesImdbClient {

    @GetMapping("/API/Top250Movies/{apiKey}")
    Top250DataResponse getMovies(@PathVariable String apiKey);

    @GetMapping("/API/Top250Movies/{apiKey}")
    Top250MoviesTitleAndImageResponse getMoviesTitleAndImage(@PathVariable String apiKey);
}
