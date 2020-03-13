package com.test.slf4j;

import org.slf4j.Logger;
import org.slf4j.MDC;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

class TrackLoggerImpl extends DelegateLogger implements TrackLogger {

    private static final String CONTEXT = "context";

    TrackLoggerImpl(final Logger logger) {
        super(logger);
    }

    public void track(String context, String s) {
        this.setContext(context);
        this.delegate().info(this.getMarker(context), s);
        this.removeContext();
    }

    public void track(String context, String s, Object o) {
        this.setContext(context);
        this.delegate().info(this.getMarker(context), s, o);
        this.removeContext();
    }

    public void track(String context, String s, Object o, Object o1) {
        this.setContext(context);
        this.delegate().info(this.getMarker(context), s, o, o1);
        this.removeContext();
   }

    public void track(String context, String s, Object... objects) {
        this.setContext(context);
        this.delegate().info(this.getMarker(context), s, objects);
        this.removeContext();
    }

    private Marker getMarker(final String context) {
        return MarkerFactory.getMarker(context);
    }

    private void setContext(final String context) {
        MDC.put(CONTEXT, context);
    }

    private void removeContext() {
        MDC.remove(CONTEXT);
    }
}
