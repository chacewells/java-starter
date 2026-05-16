package com.example.v2.model.response;

import java.util.List;

public record OrderAggregationResponse(
    List<OrderAggregationBucket> buckets,
    Integer size) {
}
