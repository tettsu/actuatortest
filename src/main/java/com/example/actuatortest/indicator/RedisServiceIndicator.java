package com.example.actuatortest.indicator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class RedisServiceIndicator implements HealthIndicator {

    private final String message_key = "RedisService";

    @Override
    public Health health() {
        if (!isRedisService()) {
            return Health.down().withDetail(message_key, "Not Available").build();
        }
        return Health.up().withDetail(message_key, "Available").build();
    }

    private Boolean isRedisService() {
        Boolean isRunning = true;
        // Logic Skipped
        return isRunning;
    }

}
