package com.example.actuatortest.controller;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final Counter myCounter;

    public MyController(MeterRegistry meterRegistry) {

        // Create the counter using the helper method on the builder
        myCounter = meterRegistry.counter("my.counter", "mytagname", "mytagvalue");

    }
}