package org.huajistudio.cas.common.concurrent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface SyncLogger {
    Logger MAIN_LOGGER = LoggerFactory.getLogger("Cellular Automaton Simulator");

    static Logger getLogger() {
        if (Thread.currentThread().getName().equals("Main Thread")) {
            return MAIN_LOGGER;
        } else {
            return LoggerFactory.getLogger(Thread.currentThread().getName()); // TODO Specify a custom name
        }
    }
}
