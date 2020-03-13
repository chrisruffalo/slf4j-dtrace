package com.test.log4j2;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogBuilder;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.message.EntryMessage;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.util.MessageSupplier;
import org.apache.logging.log4j.util.Supplier;

class DelegateLogger implements Logger {

    final Logger delegate;

    protected DelegateLogger(final Logger logger) {
        this.delegate = logger;
    }

    public void catching(Level level, Throwable t) {
        delegate.catching(level, t);
    }

    public void catching(Throwable t) {
        delegate.catching(t);
    }

    public void debug(Marker marker, Message msg) {
        delegate.debug(marker, msg);
    }

    public void debug(Marker marker, Message msg, Throwable t) {
        delegate.debug(marker, msg, t);
    }

    public void debug(Marker marker, MessageSupplier msgSupplier) {
        delegate.debug(marker, msgSupplier);
    }

    public void debug(Marker marker, MessageSupplier msgSupplier, Throwable t) {
        delegate.debug(marker, msgSupplier, t);
    }

    public void debug(Marker marker, CharSequence message) {
        delegate.debug(marker, message);
    }

    public void debug(Marker marker, CharSequence message, Throwable t) {
        delegate.debug(marker, message, t);
    }

    public void debug(Marker marker, Object message) {
        delegate.debug(marker, message);
    }

    public void debug(Marker marker, Object message, Throwable t) {
        delegate.debug(marker, message, t);
    }

    public void debug(Marker marker, String message) {
        delegate.debug(marker, message);
    }

    public void debug(Marker marker, String message, Object... params) {
        delegate.debug(marker, message, params);
    }

    public void debug(Marker marker, String message, Supplier<?>... paramSuppliers) {
        delegate.debug(marker, message, paramSuppliers);
    }

    public void debug(Marker marker, String message, Throwable t) {
        delegate.debug(marker, message, t);
    }

    public void debug(Marker marker, Supplier<?> msgSupplier) {
        delegate.debug(marker, msgSupplier);
    }

    public void debug(Marker marker, Supplier<?> msgSupplier, Throwable t) {
        delegate.debug(marker, msgSupplier, t);
    }

    public void debug(Message msg) {
        delegate.debug(msg);
    }

    public void debug(Message msg, Throwable t) {
        delegate.debug(msg, t);
    }

    public void debug(MessageSupplier msgSupplier) {
        delegate.debug(msgSupplier);
    }

    public void debug(MessageSupplier msgSupplier, Throwable t) {
        delegate.debug(msgSupplier, t);
    }

    public void debug(CharSequence message) {
        delegate.debug(message);
    }

    public void debug(CharSequence message, Throwable t) {
        delegate.debug(message, t);
    }

    public void debug(Object message) {
        delegate.debug(message);
    }

    public void debug(Object message, Throwable t) {
        delegate.debug(message, t);
    }

    public void debug(String message) {
        delegate.debug(message);
    }

    public void debug(String message, Object... params) {
        delegate.debug(message, params);
    }

    public void debug(String message, Supplier<?>... paramSuppliers) {
        delegate.debug(message, paramSuppliers);
    }

    public void debug(String message, Throwable t) {
        delegate.debug(message, t);
    }

    public void debug(Supplier<?> msgSupplier) {
        delegate.debug(msgSupplier);
    }

    public void debug(Supplier<?> msgSupplier, Throwable t) {
        delegate.debug(msgSupplier, t);
    }

    public void debug(Marker marker, String message, Object p0) {
        delegate.debug(marker, message, p0);
    }

    public void debug(Marker marker, String message, Object p0, Object p1) {
        delegate.debug(marker, message, p0, p1);
    }

    public void debug(Marker marker, String message, Object p0, Object p1, Object p2) {
        delegate.debug(marker, message, p0, p1, p2);
    }

    public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
        delegate.debug(marker, message, p0, p1, p2, p3);
    }

    public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        delegate.debug(marker, message, p0, p1, p2, p3, p4);
    }

    public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        delegate.debug(marker, message, p0, p1, p2, p3, p4, p5);
    }

    public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        delegate.debug(marker, message, p0, p1, p2, p3, p4, p5, p6);
    }

    public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        delegate.debug(marker, message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        delegate.debug(marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        delegate.debug(marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public void debug(String message, Object p0) {
        delegate.debug(message, p0);
    }

    public void debug(String message, Object p0, Object p1) {
        delegate.debug(message, p0, p1);
    }

    public void debug(String message, Object p0, Object p1, Object p2) {
        delegate.debug(message, p0, p1, p2);
    }

    public void debug(String message, Object p0, Object p1, Object p2, Object p3) {
        delegate.debug(message, p0, p1, p2, p3);
    }

    public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        delegate.debug(message, p0, p1, p2, p3, p4);
    }

    public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        delegate.debug(message, p0, p1, p2, p3, p4, p5);
    }

    public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        delegate.debug(message, p0, p1, p2, p3, p4, p5, p6);
    }

    public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        delegate.debug(message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        delegate.debug(message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        delegate.debug(message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    @Deprecated
    public void entry() {
        delegate.entry();
    }

    @Deprecated
    public void entry(Object... params) {
        delegate.entry(params);
    }

    public void error(Marker marker, Message msg) {
        delegate.error(marker, msg);
    }

    public void error(Marker marker, Message msg, Throwable t) {
        delegate.error(marker, msg, t);
    }

    public void error(Marker marker, MessageSupplier msgSupplier) {
        delegate.error(marker, msgSupplier);
    }

    public void error(Marker marker, MessageSupplier msgSupplier, Throwable t) {
        delegate.error(marker, msgSupplier, t);
    }

    public void error(Marker marker, CharSequence message) {
        delegate.error(marker, message);
    }

    public void error(Marker marker, CharSequence message, Throwable t) {
        delegate.error(marker, message, t);
    }

    public void error(Marker marker, Object message) {
        delegate.error(marker, message);
    }

    public void error(Marker marker, Object message, Throwable t) {
        delegate.error(marker, message, t);
    }

    public void error(Marker marker, String message) {
        delegate.error(marker, message);
    }

    public void error(Marker marker, String message, Object... params) {
        delegate.error(marker, message, params);
    }

    public void error(Marker marker, String message, Supplier<?>... paramSuppliers) {
        delegate.error(marker, message, paramSuppliers);
    }

    public void error(Marker marker, String message, Throwable t) {
        delegate.error(marker, message, t);
    }

    public void error(Marker marker, Supplier<?> msgSupplier) {
        delegate.error(marker, msgSupplier);
    }

    public void error(Marker marker, Supplier<?> msgSupplier, Throwable t) {
        delegate.error(marker, msgSupplier, t);
    }

    public void error(Message msg) {
        delegate.error(msg);
    }

    public void error(Message msg, Throwable t) {
        delegate.error(msg, t);
    }

    public void error(MessageSupplier msgSupplier) {
        delegate.error(msgSupplier);
    }

    public void error(MessageSupplier msgSupplier, Throwable t) {
        delegate.error(msgSupplier, t);
    }

    public void error(CharSequence message) {
        delegate.error(message);
    }

    public void error(CharSequence message, Throwable t) {
        delegate.error(message, t);
    }

    public void error(Object message) {
        delegate.error(message);
    }

    public void error(Object message, Throwable t) {
        delegate.error(message, t);
    }

    public void error(String message) {
        delegate.error(message);
    }

    public void error(String message, Object... params) {
        delegate.error(message, params);
    }

    public void error(String message, Supplier<?>... paramSuppliers) {
        delegate.error(message, paramSuppliers);
    }

    public void error(String message, Throwable t) {
        delegate.error(message, t);
    }

    public void error(Supplier<?> msgSupplier) {
        delegate.error(msgSupplier);
    }

    public void error(Supplier<?> msgSupplier, Throwable t) {
        delegate.error(msgSupplier, t);
    }

    public void error(Marker marker, String message, Object p0) {
        delegate.error(marker, message, p0);
    }

    public void error(Marker marker, String message, Object p0, Object p1) {
        delegate.error(marker, message, p0, p1);
    }

    public void error(Marker marker, String message, Object p0, Object p1, Object p2) {
        delegate.error(marker, message, p0, p1, p2);
    }

    public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
        delegate.error(marker, message, p0, p1, p2, p3);
    }

    public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        delegate.error(marker, message, p0, p1, p2, p3, p4);
    }

    public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        delegate.error(marker, message, p0, p1, p2, p3, p4, p5);
    }

    public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        delegate.error(marker, message, p0, p1, p2, p3, p4, p5, p6);
    }

    public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        delegate.error(marker, message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        delegate.error(marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        delegate.error(marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public void error(String message, Object p0) {
        delegate.error(message, p0);
    }

    public void error(String message, Object p0, Object p1) {
        delegate.error(message, p0, p1);
    }

    public void error(String message, Object p0, Object p1, Object p2) {
        delegate.error(message, p0, p1, p2);
    }

    public void error(String message, Object p0, Object p1, Object p2, Object p3) {
        delegate.error(message, p0, p1, p2, p3);
    }

    public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        delegate.error(message, p0, p1, p2, p3, p4);
    }

    public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        delegate.error(message, p0, p1, p2, p3, p4, p5);
    }

    public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        delegate.error(message, p0, p1, p2, p3, p4, p5, p6);
    }

    public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        delegate.error(message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        delegate.error(message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        delegate.error(message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    @Deprecated
    public void exit() {
        delegate.exit();
    }

    @Deprecated
    public <R> R exit(R result) {
        return delegate.exit(result);
    }

    public void fatal(Marker marker, Message msg) {
        delegate.fatal(marker, msg);
    }

    public void fatal(Marker marker, Message msg, Throwable t) {
        delegate.fatal(marker, msg, t);
    }

    public void fatal(Marker marker, MessageSupplier msgSupplier) {
        delegate.fatal(marker, msgSupplier);
    }

    public void fatal(Marker marker, MessageSupplier msgSupplier, Throwable t) {
        delegate.fatal(marker, msgSupplier, t);
    }

    public void fatal(Marker marker, CharSequence message) {
        delegate.fatal(marker, message);
    }

    public void fatal(Marker marker, CharSequence message, Throwable t) {
        delegate.fatal(marker, message, t);
    }

    public void fatal(Marker marker, Object message) {
        delegate.fatal(marker, message);
    }

    public void fatal(Marker marker, Object message, Throwable t) {
        delegate.fatal(marker, message, t);
    }

    public void fatal(Marker marker, String message) {
        delegate.fatal(marker, message);
    }

    public void fatal(Marker marker, String message, Object... params) {
        delegate.fatal(marker, message, params);
    }

    public void fatal(Marker marker, String message, Supplier<?>... paramSuppliers) {
        delegate.fatal(marker, message, paramSuppliers);
    }

    public void fatal(Marker marker, String message, Throwable t) {
        delegate.fatal(marker, message, t);
    }

    public void fatal(Marker marker, Supplier<?> msgSupplier) {
        delegate.fatal(marker, msgSupplier);
    }

    public void fatal(Marker marker, Supplier<?> msgSupplier, Throwable t) {
        delegate.fatal(marker, msgSupplier, t);
    }

    public void fatal(Message msg) {
        delegate.fatal(msg);
    }

    public void fatal(Message msg, Throwable t) {
        delegate.fatal(msg, t);
    }

    public void fatal(MessageSupplier msgSupplier) {
        delegate.fatal(msgSupplier);
    }

    public void fatal(MessageSupplier msgSupplier, Throwable t) {
        delegate.fatal(msgSupplier, t);
    }

    public void fatal(CharSequence message) {
        delegate.fatal(message);
    }

    public void fatal(CharSequence message, Throwable t) {
        delegate.fatal(message, t);
    }

    public void fatal(Object message) {
        delegate.fatal(message);
    }

    public void fatal(Object message, Throwable t) {
        delegate.fatal(message, t);
    }

    public void fatal(String message) {
        delegate.fatal(message);
    }

    public void fatal(String message, Object... params) {
        delegate.fatal(message, params);
    }

    public void fatal(String message, Supplier<?>... paramSuppliers) {
        delegate.fatal(message, paramSuppliers);
    }

    public void fatal(String message, Throwable t) {
        delegate.fatal(message, t);
    }

    public void fatal(Supplier<?> msgSupplier) {
        delegate.fatal(msgSupplier);
    }

    public void fatal(Supplier<?> msgSupplier, Throwable t) {
        delegate.fatal(msgSupplier, t);
    }

    public void fatal(Marker marker, String message, Object p0) {
        delegate.fatal(marker, message, p0);
    }

    public void fatal(Marker marker, String message, Object p0, Object p1) {
        delegate.fatal(marker, message, p0, p1);
    }

    public void fatal(Marker marker, String message, Object p0, Object p1, Object p2) {
        delegate.fatal(marker, message, p0, p1, p2);
    }

    public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
        delegate.fatal(marker, message, p0, p1, p2, p3);
    }

    public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        delegate.fatal(marker, message, p0, p1, p2, p3, p4);
    }

    public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        delegate.fatal(marker, message, p0, p1, p2, p3, p4, p5);
    }

    public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        delegate.fatal(marker, message, p0, p1, p2, p3, p4, p5, p6);
    }

    public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        delegate.fatal(marker, message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        delegate.fatal(marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        delegate.fatal(marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public void fatal(String message, Object p0) {
        delegate.fatal(message, p0);
    }

    public void fatal(String message, Object p0, Object p1) {
        delegate.fatal(message, p0, p1);
    }

    public void fatal(String message, Object p0, Object p1, Object p2) {
        delegate.fatal(message, p0, p1, p2);
    }

    public void fatal(String message, Object p0, Object p1, Object p2, Object p3) {
        delegate.fatal(message, p0, p1, p2, p3);
    }

    public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        delegate.fatal(message, p0, p1, p2, p3, p4);
    }

    public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        delegate.fatal(message, p0, p1, p2, p3, p4, p5);
    }

    public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        delegate.fatal(message, p0, p1, p2, p3, p4, p5, p6);
    }

    public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        delegate.fatal(message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        delegate.fatal(message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        delegate.fatal(message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public Level getLevel() {
        return delegate.getLevel();
    }

    public <MF extends MessageFactory> MF getMessageFactory() {
        return delegate.getMessageFactory();
    }

    public String getName() {
        return delegate.getName();
    }

    public void info(Marker marker, Message msg) {
        delegate.info(marker, msg);
    }

    public void info(Marker marker, Message msg, Throwable t) {
        delegate.info(marker, msg, t);
    }

    public void info(Marker marker, MessageSupplier msgSupplier) {
        delegate.info(marker, msgSupplier);
    }

    public void info(Marker marker, MessageSupplier msgSupplier, Throwable t) {
        delegate.info(marker, msgSupplier, t);
    }

    public void info(Marker marker, CharSequence message) {
        delegate.info(marker, message);
    }

    public void info(Marker marker, CharSequence message, Throwable t) {
        delegate.info(marker, message, t);
    }

    public void info(Marker marker, Object message) {
        delegate.info(marker, message);
    }

    public void info(Marker marker, Object message, Throwable t) {
        delegate.info(marker, message, t);
    }

    public void info(Marker marker, String message) {
        delegate.info(marker, message);
    }

    public void info(Marker marker, String message, Object... params) {
        delegate.info(marker, message, params);
    }

    public void info(Marker marker, String message, Supplier<?>... paramSuppliers) {
        delegate.info(marker, message, paramSuppliers);
    }

    public void info(Marker marker, String message, Throwable t) {
        delegate.info(marker, message, t);
    }

    public void info(Marker marker, Supplier<?> msgSupplier) {
        delegate.info(marker, msgSupplier);
    }

    public void info(Marker marker, Supplier<?> msgSupplier, Throwable t) {
        delegate.info(marker, msgSupplier, t);
    }

    public void info(Message msg) {
        delegate.info(msg);
    }

    public void info(Message msg, Throwable t) {
        delegate.info(msg, t);
    }

    public void info(MessageSupplier msgSupplier) {
        delegate.info(msgSupplier);
    }

    public void info(MessageSupplier msgSupplier, Throwable t) {
        delegate.info(msgSupplier, t);
    }

    public void info(CharSequence message) {
        delegate.info(message);
    }

    public void info(CharSequence message, Throwable t) {
        delegate.info(message, t);
    }

    public void info(Object message) {
        delegate.info(message);
    }

    public void info(Object message, Throwable t) {
        delegate.info(message, t);
    }

    public void info(String message) {
        delegate.info(message);
    }

    public void info(String message, Object... params) {
        delegate.info(message, params);
    }

    public void info(String message, Supplier<?>... paramSuppliers) {
        delegate.info(message, paramSuppliers);
    }

    public void info(String message, Throwable t) {
        delegate.info(message, t);
    }

    public void info(Supplier<?> msgSupplier) {
        delegate.info(msgSupplier);
    }

    public void info(Supplier<?> msgSupplier, Throwable t) {
        delegate.info(msgSupplier, t);
    }

    public void info(Marker marker, String message, Object p0) {
        delegate.info(marker, message, p0);
    }

    public void info(Marker marker, String message, Object p0, Object p1) {
        delegate.info(marker, message, p0, p1);
    }

    public void info(Marker marker, String message, Object p0, Object p1, Object p2) {
        delegate.info(marker, message, p0, p1, p2);
    }

    public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
        delegate.info(marker, message, p0, p1, p2, p3);
    }

    public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        delegate.info(marker, message, p0, p1, p2, p3, p4);
    }

    public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        delegate.info(marker, message, p0, p1, p2, p3, p4, p5);
    }

    public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        delegate.info(marker, message, p0, p1, p2, p3, p4, p5, p6);
    }

    public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        delegate.info(marker, message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        delegate.info(marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        delegate.info(marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public void info(String message, Object p0) {
        delegate.info(message, p0);
    }

    public void info(String message, Object p0, Object p1) {
        delegate.info(message, p0, p1);
    }

    public void info(String message, Object p0, Object p1, Object p2) {
        delegate.info(message, p0, p1, p2);
    }

    public void info(String message, Object p0, Object p1, Object p2, Object p3) {
        delegate.info(message, p0, p1, p2, p3);
    }

    public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        delegate.info(message, p0, p1, p2, p3, p4);
    }

    public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        delegate.info(message, p0, p1, p2, p3, p4, p5);
    }

    public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        delegate.info(message, p0, p1, p2, p3, p4, p5, p6);
    }

    public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        delegate.info(message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        delegate.info(message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        delegate.info(message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public boolean isDebugEnabled() {
        return delegate.isDebugEnabled();
    }

    public boolean isDebugEnabled(Marker marker) {
        return delegate.isDebugEnabled(marker);
    }

    public boolean isEnabled(Level level) {
        return delegate.isEnabled(level);
    }

    public boolean isEnabled(Level level, Marker marker) {
        return delegate.isEnabled(level, marker);
    }

    public boolean isErrorEnabled() {
        return delegate.isErrorEnabled();
    }

    public boolean isErrorEnabled(Marker marker) {
        return delegate.isErrorEnabled(marker);
    }

    public boolean isFatalEnabled() {
        return delegate.isFatalEnabled();
    }

    public boolean isFatalEnabled(Marker marker) {
        return delegate.isFatalEnabled(marker);
    }

    public boolean isInfoEnabled() {
        return delegate.isInfoEnabled();
    }

    public boolean isInfoEnabled(Marker marker) {
        return delegate.isInfoEnabled(marker);
    }

    public boolean isTraceEnabled() {
        return delegate.isTraceEnabled();
    }

    public boolean isTraceEnabled(Marker marker) {
        return delegate.isTraceEnabled(marker);
    }

    public boolean isWarnEnabled() {
        return delegate.isWarnEnabled();
    }

    public boolean isWarnEnabled(Marker marker) {
        return delegate.isWarnEnabled(marker);
    }

    public void log(Level level, Marker marker, Message msg) {
        delegate.log(level, marker, msg);
    }

    public void log(Level level, Marker marker, Message msg, Throwable t) {
        delegate.log(level, marker, msg, t);
    }

    public void log(Level level, Marker marker, MessageSupplier msgSupplier) {
        delegate.log(level, marker, msgSupplier);
    }

    public void log(Level level, Marker marker, MessageSupplier msgSupplier, Throwable t) {
        delegate.log(level, marker, msgSupplier, t);
    }

    public void log(Level level, Marker marker, CharSequence message) {
        delegate.log(level, marker, message);
    }

    public void log(Level level, Marker marker, CharSequence message, Throwable t) {
        delegate.log(level, marker, message, t);
    }

    public void log(Level level, Marker marker, Object message) {
        delegate.log(level, marker, message);
    }

    public void log(Level level, Marker marker, Object message, Throwable t) {
        delegate.log(level, marker, message, t);
    }

    public void log(Level level, Marker marker, String message) {
        delegate.log(level, marker, message);
    }

    public void log(Level level, Marker marker, String message, Object... params) {
        delegate.log(level, marker, message, params);
    }

    public void log(Level level, Marker marker, String message, Supplier<?>... paramSuppliers) {
        delegate.log(level, marker, message, paramSuppliers);
    }

    public void log(Level level, Marker marker, String message, Throwable t) {
        delegate.log(level, marker, message, t);
    }

    public void log(Level level, Marker marker, Supplier<?> msgSupplier) {
        delegate.log(level, marker, msgSupplier);
    }

    public void log(Level level, Marker marker, Supplier<?> msgSupplier, Throwable t) {
        delegate.log(level, marker, msgSupplier, t);
    }

    public void log(Level level, Message msg) {
        delegate.log(level, msg);
    }

    public void log(Level level, Message msg, Throwable t) {
        delegate.log(level, msg, t);
    }

    public void log(Level level, MessageSupplier msgSupplier) {
        delegate.log(level, msgSupplier);
    }

    public void log(Level level, MessageSupplier msgSupplier, Throwable t) {
        delegate.log(level, msgSupplier, t);
    }

    public void log(Level level, CharSequence message) {
        delegate.log(level, message);
    }

    public void log(Level level, CharSequence message, Throwable t) {
        delegate.log(level, message, t);
    }

    public void log(Level level, Object message) {
        delegate.log(level, message);
    }

    public void log(Level level, Object message, Throwable t) {
        delegate.log(level, message, t);
    }

    public void log(Level level, String message) {
        delegate.log(level, message);
    }

    public void log(Level level, String message, Object... params) {
        delegate.log(level, message, params);
    }

    public void log(Level level, String message, Supplier<?>... paramSuppliers) {
        delegate.log(level, message, paramSuppliers);
    }

    public void log(Level level, String message, Throwable t) {
        delegate.log(level, message, t);
    }

    public void log(Level level, Supplier<?> msgSupplier) {
        delegate.log(level, msgSupplier);
    }

    public void log(Level level, Supplier<?> msgSupplier, Throwable t) {
        delegate.log(level, msgSupplier, t);
    }

    public void log(Level level, Marker marker, String message, Object p0) {
        delegate.log(level, marker, message, p0);
    }

    public void log(Level level, Marker marker, String message, Object p0, Object p1) {
        delegate.log(level, marker, message, p0, p1);
    }

    public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2) {
        delegate.log(level, marker, message, p0, p1, p2);
    }

    public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
        delegate.log(level, marker, message, p0, p1, p2, p3);
    }

    public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        delegate.log(level, marker, message, p0, p1, p2, p3, p4);
    }

    public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        delegate.log(level, marker, message, p0, p1, p2, p3, p4, p5);
    }

    public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        delegate.log(level, marker, message, p0, p1, p2, p3, p4, p5, p6);
    }

    public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        delegate.log(level, marker, message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        delegate.log(level, marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        delegate.log(level, marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public void log(Level level, String message, Object p0) {
        delegate.log(level, message, p0);
    }

    public void log(Level level, String message, Object p0, Object p1) {
        delegate.log(level, message, p0, p1);
    }

    public void log(Level level, String message, Object p0, Object p1, Object p2) {
        delegate.log(level, message, p0, p1, p2);
    }

    public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3) {
        delegate.log(level, message, p0, p1, p2, p3);
    }

    public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        delegate.log(level, message, p0, p1, p2, p3, p4);
    }

    public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        delegate.log(level, message, p0, p1, p2, p3, p4, p5);
    }

    public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        delegate.log(level, message, p0, p1, p2, p3, p4, p5, p6);
    }

    public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        delegate.log(level, message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        delegate.log(level, message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        delegate.log(level, message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public void printf(Level level, Marker marker, String format, Object... params) {
        delegate.printf(level, marker, format, params);
    }

    public void printf(Level level, String format, Object... params) {
        delegate.printf(level, format, params);
    }

    public <T extends Throwable> T throwing(Level level, T t) {
        return delegate.throwing(level, t);
    }

    public <T extends Throwable> T throwing(T t) {
        return delegate.throwing(t);
    }

    public void trace(Marker marker, Message msg) {
        delegate.trace(marker, msg);
    }

    public void trace(Marker marker, Message msg, Throwable t) {
        delegate.trace(marker, msg, t);
    }

    public void trace(Marker marker, MessageSupplier msgSupplier) {
        delegate.trace(marker, msgSupplier);
    }

    public void trace(Marker marker, MessageSupplier msgSupplier, Throwable t) {
        delegate.trace(marker, msgSupplier, t);
    }

    public void trace(Marker marker, CharSequence message) {
        delegate.trace(marker, message);
    }

    public void trace(Marker marker, CharSequence message, Throwable t) {
        delegate.trace(marker, message, t);
    }

    public void trace(Marker marker, Object message) {
        delegate.trace(marker, message);
    }

    public void trace(Marker marker, Object message, Throwable t) {
        delegate.trace(marker, message, t);
    }

    public void trace(Marker marker, String message) {
        delegate.trace(marker, message);
    }

    public void trace(Marker marker, String message, Object... params) {
        delegate.trace(marker, message, params);
    }

    public void trace(Marker marker, String message, Supplier<?>... paramSuppliers) {
        delegate.trace(marker, message, paramSuppliers);
    }

    public void trace(Marker marker, String message, Throwable t) {
        delegate.trace(marker, message, t);
    }

    public void trace(Marker marker, Supplier<?> msgSupplier) {
        delegate.trace(marker, msgSupplier);
    }

    public void trace(Marker marker, Supplier<?> msgSupplier, Throwable t) {
        delegate.trace(marker, msgSupplier, t);
    }

    public void trace(Message msg) {
        delegate.trace(msg);
    }

    public void trace(Message msg, Throwable t) {
        delegate.trace(msg, t);
    }

    public void trace(MessageSupplier msgSupplier) {
        delegate.trace(msgSupplier);
    }

    public void trace(MessageSupplier msgSupplier, Throwable t) {
        delegate.trace(msgSupplier, t);
    }

    public void trace(CharSequence message) {
        delegate.trace(message);
    }

    public void trace(CharSequence message, Throwable t) {
        delegate.trace(message, t);
    }

    public void trace(Object message) {
        delegate.trace(message);
    }

    public void trace(Object message, Throwable t) {
        delegate.trace(message, t);
    }

    public void trace(String message) {
        delegate.trace(message);
    }

    public void trace(String message, Object... params) {
        delegate.trace(message, params);
    }

    public void trace(String message, Supplier<?>... paramSuppliers) {
        delegate.trace(message, paramSuppliers);
    }

    public void trace(String message, Throwable t) {
        delegate.trace(message, t);
    }

    public void trace(Supplier<?> msgSupplier) {
        delegate.trace(msgSupplier);
    }

    public void trace(Supplier<?> msgSupplier, Throwable t) {
        delegate.trace(msgSupplier, t);
    }

    public void trace(Marker marker, String message, Object p0) {
        delegate.trace(marker, message, p0);
    }

    public void trace(Marker marker, String message, Object p0, Object p1) {
        delegate.trace(marker, message, p0, p1);
    }

    public void trace(Marker marker, String message, Object p0, Object p1, Object p2) {
        delegate.trace(marker, message, p0, p1, p2);
    }

    public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
        delegate.trace(marker, message, p0, p1, p2, p3);
    }

    public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        delegate.trace(marker, message, p0, p1, p2, p3, p4);
    }

    public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        delegate.trace(marker, message, p0, p1, p2, p3, p4, p5);
    }

    public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        delegate.trace(marker, message, p0, p1, p2, p3, p4, p5, p6);
    }

    public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        delegate.trace(marker, message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        delegate.trace(marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        delegate.trace(marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public void trace(String message, Object p0) {
        delegate.trace(message, p0);
    }

    public void trace(String message, Object p0, Object p1) {
        delegate.trace(message, p0, p1);
    }

    public void trace(String message, Object p0, Object p1, Object p2) {
        delegate.trace(message, p0, p1, p2);
    }

    public void trace(String message, Object p0, Object p1, Object p2, Object p3) {
        delegate.trace(message, p0, p1, p2, p3);
    }

    public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        delegate.trace(message, p0, p1, p2, p3, p4);
    }

    public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        delegate.trace(message, p0, p1, p2, p3, p4, p5);
    }

    public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        delegate.trace(message, p0, p1, p2, p3, p4, p5, p6);
    }

    public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        delegate.trace(message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        delegate.trace(message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        delegate.trace(message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public EntryMessage traceEntry() {
        return delegate.traceEntry();
    }

    public EntryMessage traceEntry(String format, Object... params) {
        return delegate.traceEntry(format, params);
    }

    public EntryMessage traceEntry(Supplier<?>... paramSuppliers) {
        return delegate.traceEntry(paramSuppliers);
    }

    public EntryMessage traceEntry(String format, Supplier<?>... paramSuppliers) {
        return delegate.traceEntry(format, paramSuppliers);
    }

    public EntryMessage traceEntry(Message message) {
        return delegate.traceEntry(message);
    }

    public void traceExit() {
        delegate.traceExit();
    }

    public <R> R traceExit(R result) {
        return delegate.traceExit(result);
    }

    public <R> R traceExit(String format, R result) {
        return delegate.traceExit(format, result);
    }

    public void traceExit(EntryMessage message) {
        delegate.traceExit(message);
    }

    public <R> R traceExit(EntryMessage message, R result) {
        return delegate.traceExit(message, result);
    }

    public <R> R traceExit(Message message, R result) {
        return delegate.traceExit(message, result);
    }

    public void warn(Marker marker, Message msg) {
        delegate.warn(marker, msg);
    }

    public void warn(Marker marker, Message msg, Throwable t) {
        delegate.warn(marker, msg, t);
    }

    public void warn(Marker marker, MessageSupplier msgSupplier) {
        delegate.warn(marker, msgSupplier);
    }

    public void warn(Marker marker, MessageSupplier msgSupplier, Throwable t) {
        delegate.warn(marker, msgSupplier, t);
    }

    public void warn(Marker marker, CharSequence message) {
        delegate.warn(marker, message);
    }

    public void warn(Marker marker, CharSequence message, Throwable t) {
        delegate.warn(marker, message, t);
    }

    public void warn(Marker marker, Object message) {
        delegate.warn(marker, message);
    }

    public void warn(Marker marker, Object message, Throwable t) {
        delegate.warn(marker, message, t);
    }

    public void warn(Marker marker, String message) {
        delegate.warn(marker, message);
    }

    public void warn(Marker marker, String message, Object... params) {
        delegate.warn(marker, message, params);
    }

    public void warn(Marker marker, String message, Supplier<?>... paramSuppliers) {
        delegate.warn(marker, message, paramSuppliers);
    }

    public void warn(Marker marker, String message, Throwable t) {
        delegate.warn(marker, message, t);
    }

    public void warn(Marker marker, Supplier<?> msgSupplier) {
        delegate.warn(marker, msgSupplier);
    }

    public void warn(Marker marker, Supplier<?> msgSupplier, Throwable t) {
        delegate.warn(marker, msgSupplier, t);
    }

    public void warn(Message msg) {
        delegate.warn(msg);
    }

    public void warn(Message msg, Throwable t) {
        delegate.warn(msg, t);
    }

    public void warn(MessageSupplier msgSupplier) {
        delegate.warn(msgSupplier);
    }

    public void warn(MessageSupplier msgSupplier, Throwable t) {
        delegate.warn(msgSupplier, t);
    }

    public void warn(CharSequence message) {
        delegate.warn(message);
    }

    public void warn(CharSequence message, Throwable t) {
        delegate.warn(message, t);
    }

    public void warn(Object message) {
        delegate.warn(message);
    }

    public void warn(Object message, Throwable t) {
        delegate.warn(message, t);
    }

    public void warn(String message) {
        delegate.warn(message);
    }

    public void warn(String message, Object... params) {
        delegate.warn(message, params);
    }

    public void warn(String message, Supplier<?>... paramSuppliers) {
        delegate.warn(message, paramSuppliers);
    }

    public void warn(String message, Throwable t) {
        delegate.warn(message, t);
    }

    public void warn(Supplier<?> msgSupplier) {
        delegate.warn(msgSupplier);
    }

    public void warn(Supplier<?> msgSupplier, Throwable t) {
        delegate.warn(msgSupplier, t);
    }

    public void warn(Marker marker, String message, Object p0) {
        delegate.warn(marker, message, p0);
    }

    public void warn(Marker marker, String message, Object p0, Object p1) {
        delegate.warn(marker, message, p0, p1);
    }

    public void warn(Marker marker, String message, Object p0, Object p1, Object p2) {
        delegate.warn(marker, message, p0, p1, p2);
    }

    public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
        delegate.warn(marker, message, p0, p1, p2, p3);
    }

    public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        delegate.warn(marker, message, p0, p1, p2, p3, p4);
    }

    public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        delegate.warn(marker, message, p0, p1, p2, p3, p4, p5);
    }

    public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        delegate.warn(marker, message, p0, p1, p2, p3, p4, p5, p6);
    }

    public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        delegate.warn(marker, message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        delegate.warn(marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        delegate.warn(marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public void warn(String message, Object p0) {
        delegate.warn(message, p0);
    }

    public void warn(String message, Object p0, Object p1) {
        delegate.warn(message, p0, p1);
    }

    public void warn(String message, Object p0, Object p1, Object p2) {
        delegate.warn(message, p0, p1, p2);
    }

    public void warn(String message, Object p0, Object p1, Object p2, Object p3) {
        delegate.warn(message, p0, p1, p2, p3);
    }

    public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        delegate.warn(message, p0, p1, p2, p3, p4);
    }

    public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        delegate.warn(message, p0, p1, p2, p3, p4, p5);
    }

    public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        delegate.warn(message, p0, p1, p2, p3, p4, p5, p6);
    }

    public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        delegate.warn(message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        delegate.warn(message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        delegate.warn(message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public void logMessage(Level level, Marker marker, String fqcn, StackTraceElement location, Message message, Throwable throwable) {
        delegate.logMessage(level, marker, fqcn, location, message, throwable);
    }

    public LogBuilder atTrace() {
        return delegate.atTrace();
    }

    public LogBuilder atDebug() {
        return delegate.atDebug();
    }

    public LogBuilder atInfo() {
        return delegate.atInfo();
    }

    public LogBuilder atWarn() {
        return delegate.atWarn();
    }

    public LogBuilder atError() {
        return delegate.atError();
    }

    public LogBuilder atFatal() {
        return delegate.atFatal();
    }

    public LogBuilder always() {
        return delegate.always();
    }

    public LogBuilder atLevel(Level level) {
        return delegate.atLevel(level);
    }
}
