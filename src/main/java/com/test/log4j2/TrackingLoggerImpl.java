package com.test.log4j2;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.spi.StandardLevel;

class TrackingLoggerImpl extends DelegateLogger implements TrackingLogger {

    private static final String TRACK_NAME = "TRACK";
    private static final int TRACK_LEVEL = 399;

    private static final Level TRACK = Level.forName(TRACK_NAME, TRACK_LEVEL);

    TrackingLoggerImpl(Logger logger) {
        super(logger);
    }

    public void track(String context, String message) {
        this.log(TRACK, MarkerManager.getMarker(context), message);
    }

    public void track(String context, String message, Object... params) {
        this.log(TRACK, MarkerManager.getMarker(context), message, params);
    }

    public void track(String context, String message, Throwable t) {
        this.log(TRACK, MarkerManager.getMarker(context), message, t);
    }
}
