package com.example.v2.model.request;

import java.time.Instant;

public record TimeCutpoint(Instant from, Instant to) {
}
