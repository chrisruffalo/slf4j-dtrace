package com.test.log4j2;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TrackingLoggerFactory {

    public static TrackingLogger getLogger(final Class<?> forClass) {
        return getLogger(LogManager.getLogger(forClass));
    }

    private static TrackingLogger getLogger(final Logger logger) {
        return new TrackingLoggerImpl(logger);
    }

}
