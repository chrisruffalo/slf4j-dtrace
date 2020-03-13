package com.test.log4j2;

import org.junit.Test;

public class TrackingLoggerTest {

    @Test
    public void testBasicLogging() {
        final TrackingLogger logger = TrackingLoggerFactory.getLogger(this.getClass());
        logger.track("102010490194", "A new tracking log message");
        logger.info("A non-tracking message");
    }


}
