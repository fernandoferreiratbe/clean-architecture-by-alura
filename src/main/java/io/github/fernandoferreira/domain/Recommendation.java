package io.github.fernandoferreira.domain;

import java.time.LocalDateTime;

public class Recommendation {

    private final Student indicated;
    private final Student indicator;
    private final LocalDateTime recommendationDateTime;

    public Recommendation(Student indicated, Student indicator) {
        this.indicated = indicated;
        this.indicator = indicator;
        this.recommendationDateTime = LocalDateTime.now();
    }

    public Student getIndicated() {
        return this.indicated;
    }

    public Student getIndicator() {
        return this.indicator;
    }

    public LocalDateTime getRecommendationDateTime() {
        return this.recommendationDateTime;
    }
}
