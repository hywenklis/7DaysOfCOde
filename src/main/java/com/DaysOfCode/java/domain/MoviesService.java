package com.DaysOfCode.java.domain;

import com.DaysOfCode.java.api.response.Top250DataResponse;
import com.DaysOfCode.java.client.MoviesImdbClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MoviesService {

    private final MoviesImdbClient client;
    private static final String apiKey = "ADICIONE SUA API KEY AQUI";

    public Top250DataResponse findAll() {
        return client.getMovies(apiKey);
    }
}
