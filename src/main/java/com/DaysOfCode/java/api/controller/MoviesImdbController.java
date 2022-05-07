package com.DaysOfCode.java.api.controller;

import com.DaysOfCode.java.api.response.Top250DataResponse;
import com.DaysOfCode.java.api.response.Top250MoviesTitleAndImageResponse;
import com.DaysOfCode.java.domain.MoviesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequiredArgsConstructor
@RequestMapping("/movies")
public class MoviesImdbController {

    private final MoviesService service;

    @GetMapping
    @Cacheable("movies")
    public ResponseEntity<Top250DataResponse> getMovies() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/titles/images")
    @Cacheable("title")
    public ResponseEntity<Top250MoviesTitleAndImageResponse> getMoviesTitleAndImage() {
        return ResponseEntity.ok(service.findTitleAndImage());
    }
}
