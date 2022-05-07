package com.DaysOfCode.java.api.response;

import lombok.Data;

import java.util.List;

@Data
public class Top250MoviesTitleAndImageResponse {
    private List<Top250MoviesTitleAndImageDetailResponse> items;
}
