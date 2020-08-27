package com.example.actuatortest.indicator;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;

import java.io.File;

public class StopFileHealthIndicator extends AbstractHealthIndicator {

    private final File stopFile;

    public StopFileHealthIndicator(String filePath) {
        this.stopFile = new File(filePath);
    }

    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        if (stopFile.exists()) {
            builder.down().withDetail("stop-file-found", stopFile.getAbsolutePath());
        } else {
            builder.up().withDetail("stop-file-not-found", stopFile.getAbsolutePath());
        }

    }
}