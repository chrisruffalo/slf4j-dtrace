package com.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrackLoggerFactory {

    public static TrackLogger getTraceLogger(final Class<?> forClass) {
        final Logger delegate = LoggerFactory.getLogger(forClass);
        return new TrackLoggerImpl(delegate);
    }

}
