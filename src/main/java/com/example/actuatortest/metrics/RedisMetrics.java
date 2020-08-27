package com.example.actuatortest.metrics;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tags;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class RedisMetrics {


    private final List<String> words = new CopyOnWriteArrayList<>();

    RedisMetrics(MeterRegistry registry) {
        registry.gaugeCollectionSize("redis.sampleMetrics", Tags.empty(), this.words);
    }

}