package org.huajistudio.cas.client;

import cc.huajistudio.aeb.EventBus;
import ro.fortsoft.pf4j.DefaultPluginManager;
import ro.fortsoft.pf4j.PluginManager;

import java.nio.file.Paths;

public class CellularAutomatonSimulator {
    private static final PluginManager PLUGIN_MANAGER = new DefaultPluginManager(Paths.get("plugins"));
    private static final EventBus EVENT_BUS = new EventBus();

    public static void main(String[] args) {
        Thread.currentThread().setName("Main Thread");
    }

    public static PluginManager getPluginManager() {
        return PLUGIN_MANAGER;
    }

    public static EventBus getEventBus() {
        return EVENT_BUS;
    }
}
