package com.test.log4j2;

import org.apache.logging.log4j.Logger;

/**
 * Track api based on Logger API
 */
public interface TrackingLogger extends Logger {

    /**
     * Logs a message object with the TRACK level.
     *
     * @param message the message string to log.
     */
    void track(String context, String message);

    /**
     * Logs a message with parameters at the TRACK level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param params parameters to the message.
     */
    void track(String context, String message, Object... params);

    /**
     * Logs a message at the TRACK level including the stack trace of the {@link Throwable}
     * <code>t</code> passed as parameter.
     *
     * @param message the message object to log.
     * @param t the exception to log, including its stack trace.
     */
    void track(String context, String message, Throwable t);
    
}
