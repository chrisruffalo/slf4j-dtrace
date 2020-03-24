package com.test.slf4j;

import org.junit.Test;
import org.slf4j.Logger;

public class ContextLoggerTest {

    @Test
    public void simpleTest() {
        Logger logger = ContextLoggerFactory.getLogger(this.getClass(), "ALPHA-01-BETA");
        logger.info("Info!");

        logger = ContextLoggerFactory.getLogger(this.getClass(), "ALPHA-02-DELTA");
        logger.info("Info!");

        logger = ((ContextLogger)logger).withoutContext();
        logger.info("Info!");
    }

    @Test
    public void metadataTest() {
        final ContextLogger logger = ContextLoggerFactory.getLogger(this.getClass(), "BETA-03-BETA");
        logger.addMetadata("newkey", "data");
        logger.info("Info!");
    }

}
