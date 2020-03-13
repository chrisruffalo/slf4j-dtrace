package com.test.slf4j;

import com.test.slf4j.TrackLogger;
import com.test.slf4j.TrackLoggerFactory;
import org.junit.Test;

public class TraceLoggerTest {

    @Test
    public void testBasicLogging() {
        final TrackLogger logger = TrackLoggerFactory.getTraceLogger(this.getClass());
        logger.track("102010490194", "A new tracking log message");
        logger.info("A non-tracking message");
    }

}
