package com.DaysOfCode.java.api.response;

import lombok.Data;

import java.util.List;

@Data
public class Top250DataResponse {
    private List<Top250DataDetailResponse> items;
}
