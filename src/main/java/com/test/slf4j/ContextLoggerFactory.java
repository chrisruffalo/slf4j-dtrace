package com.test.slf4j;

import org.slf4j.LoggerFactory;

public class ContextLoggerFactory {

    public static ContextLogger getLogger(final Class<?> logClass, final String context) {
        return new ContextLoggerImpl(LoggerFactory.getLogger(logClass), context);
    }

    public static ContextLogger getLogger(final String logName, final String context) {
        return new ContextLoggerImpl(LoggerFactory.getLogger(logName), context);
    }

}
