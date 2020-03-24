package com.test.slf4j;

import org.slf4j.Logger;

public interface ContextLogger extends Logger {

    Logger withoutContext();

    ContextLogger addMetadata(final String key, final String value);

    ContextLogger removeMetadata(final String key);

    void clearMetadata();

}
