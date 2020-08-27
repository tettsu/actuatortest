package com.example.actuatortest.config;

import com.example.actuatortest.indicator.StopFileHealthIndicator;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean
    @ConditionalOnProperty(prefix = "management.health.stopfile", name = "enabled",
            matchIfMissing = true)
    public HealthIndicator stopFileHealthIndicator() {
        return new StopFileHealthIndicator("./stop-file");
    }

}
