package com.test.slf4j;

import org.slf4j.Logger;
import org.slf4j.MDC;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

import java.util.HashMap;
import java.util.Map;

class ContextLoggerImpl implements ContextLogger {

    private static final String CONTEXT = "context";

    final String context;
    final Logger delegate;

    final Map<String, String> metadata;

    ContextLoggerImpl(final Logger delegate, final String context) {
        this.context = context;
        this.delegate = delegate;
        this.metadata = new HashMap<String, String>();
    }

    public Logger withoutContext() {
        return this.delegate;
    }

    public ContextLogger addMetadata(String key, String value) {
        this.metadata.put(key, value);
        return this;
    }

    public ContextLogger removeMetadata(String key) {
        this.metadata.remove(key);
        return this;
    }

    public void clearMetadata() {
        this.metadata.clear();
    }

    private Marker getMarker() {
        return MarkerFactory.getMarker(this.context);
    }


    private void setMDC() {
        MDC.put(CONTEXT, this.context);
        MDC.setContextMap(this.metadata);
    }

    private void unsetMDC() {
        MDC.remove(CONTEXT);
        for (final String key : this.metadata.keySet()) {
            MDC.remove(key);
        }
    }

    public String getName() {
        return String.format("%s:%s", delegate.getName(), this.context);
    }

    public boolean isTraceEnabled() {
        return delegate.isTraceEnabled();
    }

    public void trace(String msg) {
        this.trace(this.getMarker(), msg);
    }

    public void trace(String format, Object arg) {
        this.trace(this.getMarker(), format, arg);
    }

    public void trace(String format, Object arg1, Object arg2) {
        this.trace(this.getMarker(), format, arg1, arg2);
    }

    public void trace(String format, Object... arguments) {
        this.trace(this.getMarker(), format, arguments);
    }

    public void trace(String msg, Throwable t) {
        this.trace(this.getMarker(), msg, t);
    }

    public boolean isTraceEnabled(Marker marker) {
        return delegate.isTraceEnabled(marker);
    }

    public void trace(Marker marker, String msg) {
        this.setMDC();
        delegate.trace(marker, msg);
        this.unsetMDC();
    }

    public void trace(Marker marker, String format, Object arg) {
        this.setMDC();
        delegate.trace(marker, format, arg);
        this.unsetMDC();
    }

    public void trace(Marker marker, String format, Object arg1, Object arg2) {
        this.setMDC();
        delegate.trace(marker, format, arg1, arg2);
        this.unsetMDC();
    }

    public void trace(Marker marker, String format, Object... argArray) {
        this.setMDC();
        delegate.trace(marker, format, argArray);
        this.unsetMDC();
    }

    public void trace(Marker marker, String msg, Throwable t) {
        this.setMDC();
        delegate.trace(marker, msg, t);
        this.unsetMDC();
    }

    public boolean isDebugEnabled() {
        return delegate.isDebugEnabled();
    }

    public void debug(String msg) {
        this.debug(this.getMarker(), msg);
    }

    public void debug(String format, Object arg) {
        this.debug(this.getMarker(), format, arg);
    }

    public void debug(String format, Object arg1, Object arg2) {
        this.debug(this.getMarker(), format, arg1, arg2);
    }

    public void debug(String format, Object... arguments) {
        this.debug(this.getMarker(), format, arguments);
    }

    public void debug(String msg, Throwable t) {
        this.debug(this.getMarker(), msg, t);
    }

    public boolean isDebugEnabled(Marker marker) {
        return delegate.isDebugEnabled(marker);
    }

    public void debug(Marker marker, String msg) {
        this.setMDC();
        delegate.debug(marker, msg);
        this.unsetMDC();
    }

    public void debug(Marker marker, String format, Object arg) {
        this.setMDC();
        delegate.debug(marker, format, arg);
        this.unsetMDC();
    }

    public void debug(Marker marker, String format, Object arg1, Object arg2) {
        this.setMDC();
        delegate.debug(marker, format, arg1, arg2);
        this.unsetMDC();
    }

    public void debug(Marker marker, String format, Object... arguments) {
        this.setMDC();
        delegate.debug(marker, format, arguments);
        this.unsetMDC();
    }

    public void debug(Marker marker, String msg, Throwable t) {
        this.setMDC();
        delegate.debug(marker, msg, t);
        this.unsetMDC();
    }

    public boolean isInfoEnabled() {
        return delegate.isInfoEnabled();
    }

    public void info(String msg) {
        this.info(this.getMarker(), msg);
    }

    public void info(String format, Object arg) {
        this.info(this.getMarker(), format, arg);
    }

    public void info(String format, Object arg1, Object arg2) {
        this.info(this.getMarker(), format, arg1, arg2);
    }

    public void info(String format, Object... arguments) {
        this.info(this.getMarker(), format, arguments);
    }

    public void info(String msg, Throwable t) {
        this.info(this.getMarker(), msg, t);
    }

    public boolean isInfoEnabled(Marker marker) {
        return delegate.isInfoEnabled(marker);
    }

    public void info(Marker marker, String msg) {
        this.setMDC();
        delegate.info(marker, msg);
        this.unsetMDC();
    }

    public void info(Marker marker, String format, Object arg) {
        this.setMDC();
        delegate.info(marker, format, arg);
        this.unsetMDC();
    }

    public void info(Marker marker, String format, Object arg1, Object arg2) {
        this.setMDC();
        delegate.info(marker, format, arg1, arg2);
        this.unsetMDC();
    }

    public void info(Marker marker, String format, Object... arguments) {
        this.setMDC();
        delegate.info(marker, format, arguments);
        this.unsetMDC();
    }

    public void info(Marker marker, String msg, Throwable t) {
        this.setMDC();
        delegate.info(marker, msg, t);
        this.unsetMDC();
    }

    public boolean isWarnEnabled() {
        return delegate.isWarnEnabled();
    }

    public void warn(String msg) {
        this.warn(this.getMarker(), msg);
    }

    public void warn(String format, Object arg) {
        this.warn(this.getMarker(), format, arg);
    }

    public void warn(String format, Object... arguments) {
        this.warn(this.getMarker(), format, arguments);
    }

    public void warn(String format, Object arg1, Object arg2) {
        this.warn(this.getMarker(), format, arg1, arg2);
    }

    public void warn(String msg, Throwable t) {
        this.warn(this.getMarker(), msg, t);
    }

    public boolean isWarnEnabled(Marker marker) {
        return delegate.isWarnEnabled(marker);
    }

    public void warn(Marker marker, String msg) {
        this.setMDC();
        delegate.warn(marker, msg);
        this.unsetMDC();
    }

    public void warn(Marker marker, String format, Object arg) {
        this.setMDC();
        delegate.warn(marker, format, arg);
        this.unsetMDC();
    }

    public void warn(Marker marker, String format, Object arg1, Object arg2) {
        this.setMDC();
        delegate.warn(marker, format, arg1, arg2);
        this.unsetMDC();
    }

    public void warn(Marker marker, String format, Object... arguments) {
        this.setMDC();
        delegate.warn(marker, format, arguments);
        this.unsetMDC();
    }

    public void warn(Marker marker, String msg, Throwable t) {
        this.setMDC();
        delegate.warn(marker, msg, t);
        this.unsetMDC();
    }

    public boolean isErrorEnabled() {
        return delegate.isErrorEnabled();
    }

    public void error(String msg) {
        this.error(this.getMarker(), msg);
    }

    public void error(String format, Object arg) {
        this.error(this.getMarker(), format, arg);
    }

    public void error(String format, Object arg1, Object arg2) {
        this.error(this.getMarker(), format, arg1, arg2);
    }

    public void error(String format, Object... arguments) {
        this.error(this.getMarker(), format, arguments);
    }

    public void error(String msg, Throwable t) {
        this.error(this.getMarker(), msg, t);
    }

    public boolean isErrorEnabled(Marker marker) {
        return delegate.isErrorEnabled(marker);
    }

    public void error(Marker marker, String msg) {
        this.setMDC();
        delegate.error(marker, msg);
        this.unsetMDC();
    }

    public void error(Marker marker, String format, Object arg) {
        this.setMDC();
        delegate.error(marker, format, arg);
        this.unsetMDC();
    }

    public void error(Marker marker, String format, Object arg1, Object arg2) {
        this.setMDC();
        delegate.error(marker, format, arg1, arg2);
        this.unsetMDC();
    }

    public void error(Marker marker, String format, Object... arguments) {
        this.setMDC();
        delegate.error(marker, format, arguments);
        this.unsetMDC();
    }

    public void error(Marker marker, String msg, Throwable t) {
        this.setMDC();
        delegate.error(marker, msg, t);
        this.unsetMDC();
    }
}
