package com.test.slf4j;

import org.slf4j.Logger;

interface TrackLogger extends Logger {

    void track(String context, String s);

    void track(String context, String s, Object o);

    void track(String context, String s, Object o, Object o1);

    void track(String context, String s, Object... objects);

}
