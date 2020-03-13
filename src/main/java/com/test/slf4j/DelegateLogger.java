package com.test.slf4j;

import org.slf4j.Logger;
import org.slf4j.Marker;

class DelegateLogger implements Logger {

    private final Logger delegate;

    DelegateLogger(final Logger logger) {
        this.delegate = logger;
    }

    protected Logger delegate() {
        return this.delegate;
    }

    public String getName() {
        return delegate.getName();
    }

    public boolean isTraceEnabled() {
        return delegate.isTraceEnabled();
    }

    public void trace(String s) {
        delegate.trace(s);
    }

    public void trace(String s, Object o) {
        delegate.trace(s, o);
    }

    public void trace(String s, Object o, Object o1) {
        delegate.trace(s, o, o1);
    }

    public void trace(String s, Object... objects) {
        delegate.trace(s, objects);
    }

    public void trace(String s, Throwable throwable) {
        delegate.trace(s, throwable);
    }

    public boolean isTraceEnabled(Marker marker) {
        return delegate.isTraceEnabled(marker);
    }

    public void trace(Marker marker, String s) {
        delegate.trace(marker, s);
    }

    public void trace(Marker marker, String s, Object o) {
        delegate.trace(marker, s, o);
    }

    public void trace(Marker marker, String s, Object o, Object o1) {
        delegate.trace(marker, s, o, o1);
    }

    public void trace(Marker marker, String s, Object... objects) {
        delegate.trace(marker, s, objects);
    }

    public void trace(Marker marker, String s, Throwable throwable) {
        delegate.trace(marker, s, throwable);
    }

    public boolean isDebugEnabled() {
        return delegate.isDebugEnabled();
    }

    public void debug(String s) {
        delegate.debug(s);
    }

    public void debug(String s, Object o) {
        delegate.debug(s, o);
    }

    public void debug(String s, Object o, Object o1) {
        delegate.debug(s, o, o1);
    }

    public void debug(String s, Object... objects) {
        delegate.debug(s, objects);
    }

    public void debug(String s, Throwable throwable) {
        delegate.debug(s, throwable);
    }

    public boolean isDebugEnabled(Marker marker) {
        return delegate.isDebugEnabled(marker);
    }

    public void debug(Marker marker, String s) {
        delegate.debug(marker, s);
    }

    public void debug(Marker marker, String s, Object o) {
        delegate.debug(marker, s, o);
    }

    public void debug(Marker marker, String s, Object o, Object o1) {
        delegate.debug(marker, s, o, o1);
    }

    public void debug(Marker marker, String s, Object... objects) {
        delegate.debug(marker, s, objects);
    }

    public void debug(Marker marker, String s, Throwable throwable) {
        delegate.debug(marker, s, throwable);
    }

    public boolean isInfoEnabled() {
        return delegate.isInfoEnabled();
    }

    public void info(String s) {
        delegate.info(s);
    }

    public void info(String s, Object o) {
        delegate.info(s, o);
    }

    public void info(String s, Object o, Object o1) {
        delegate.info(s, o, o1);
    }

    public void info(String s, Object... objects) {
        delegate.info(s, objects);
    }

    public void info(String s, Throwable throwable) {
        delegate.info(s, throwable);
    }

    public boolean isInfoEnabled(Marker marker) {
        return delegate.isInfoEnabled(marker);
    }

    public void info(Marker marker, String s) {
        delegate.info(marker, s);
    }

    public void info(Marker marker, String s, Object o) {
        delegate.info(marker, s, o);
    }

    public void info(Marker marker, String s, Object o, Object o1) {
        delegate.info(marker, s, o, o1);
    }

    public void info(Marker marker, String s, Object... objects) {
        delegate.info(marker, s, objects);
    }

    public void info(Marker marker, String s, Throwable throwable) {
        delegate.info(marker, s, throwable);
    }

    public boolean isWarnEnabled() {
        return delegate.isWarnEnabled();
    }

    public void warn(String s) {
        delegate.warn(s);
    }

    public void warn(String s, Object o) {
        delegate.warn(s, o);
    }

    public void warn(String s, Object... objects) {
        delegate.warn(s, objects);
    }

    public void warn(String s, Object o, Object o1) {
        delegate.warn(s, o, o1);
    }

    public void warn(String s, Throwable throwable) {
        delegate.warn(s, throwable);
    }

    public boolean isWarnEnabled(Marker marker) {
        return delegate.isWarnEnabled(marker);
    }

    public void warn(Marker marker, String s) {
        delegate.warn(marker, s);
    }

    public void warn(Marker marker, String s, Object o) {
        delegate.warn(marker, s, o);
    }

    public void warn(Marker marker, String s, Object o, Object o1) {
        delegate.warn(marker, s, o, o1);
    }

    public void warn(Marker marker, String s, Object... objects) {
        delegate.warn(marker, s, objects);
    }

    public void warn(Marker marker, String s, Throwable throwable) {
        delegate.warn(marker, s, throwable);
    }

    public boolean isErrorEnabled() {
        return delegate.isErrorEnabled();
    }

    public void error(String s) {
        delegate.error(s);
    }

    public void error(String s, Object o) {
        delegate.error(s, o);
    }

    public void error(String s, Object o, Object o1) {
        delegate.error(s, o, o1);
    }

    public void error(String s, Object... objects) {
        delegate.error(s, objects);
    }

    public void error(String s, Throwable throwable) {
        delegate.error(s, throwable);
    }

    public boolean isErrorEnabled(Marker marker) {
        return delegate.isErrorEnabled(marker);
    }

    public void error(Marker marker, String s) {
        delegate.error(marker, s);
    }

    public void error(Marker marker, String s, Object o) {
        delegate.error(marker, s, o);
    }

    public void error(Marker marker, String s, Object o, Object o1) {
        delegate.error(marker, s, o, o1);
    }

    public void error(Marker marker, String s, Object... objects) {
        delegate.error(marker, s, objects);
    }

    public void error(Marker marker, String s, Throwable throwable) {
        delegate.error(marker, s, throwable);
    }

}
