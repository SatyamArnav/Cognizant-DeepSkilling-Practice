package com.utils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.Duration;

public class PerformanceTesterTest {

    @Test
    void testTaskCompletesOnTime() {
        PerformanceTester pt = new PerformanceTester();
        assertTimeout(Duration.ofMillis(200), () -> pt.performTask());
    }
}
