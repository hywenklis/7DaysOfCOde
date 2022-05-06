package com.DaysOfCode.java.api.controller;

import com.DaysOfCode.java.api.response.Top250DataResponse;
import com.DaysOfCode.java.domain.MoviesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MoviesImdbController {

    private final MoviesService service;

    @GetMapping("/movies")
    public ResponseEntity<Top250DataResponse> getMovies() {
        return ResponseEntity.ok(service.findAll());
    }
}
