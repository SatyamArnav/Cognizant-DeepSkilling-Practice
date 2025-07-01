package com.slf4j.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(AppenderLoggingExample.class);

    public static void main(String[] args) {
        logger.info("Logging to both console and file");
        logger.debug("Debug details are here");
        logger.warn("This is a warning");
    }
}
