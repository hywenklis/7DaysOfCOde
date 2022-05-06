package com.DaysOfCode.java.api.response;

import lombok.Data;

@Data
public class Top250DataDetailResponse {
    private String id;
    private String rank;
    private String fullTitle;
    private String year;
    private String image;
    private String crew;
    private String imDbRating;
    private String imDbRatingCount;
}
