package org.huajistudio.cas.common.world;

import org.huajistudio.cas.api.cell.CellState;
import org.huajistudio.cas.api.registry.RegistryEntry;
import org.huajistudio.cas.api.world.TickProcessor;
import org.huajistudio.cas.api.world.Tickable;
import org.huajistudio.cas.common.concurrent.SyncLogger;

import java.util.HashSet;
import java.util.Set;

public class World extends RegistryEntry.Impl<World> implements TickProcessor {
    private CellState[][] map;
    private Set<Tickable> tickables;

    public World(int width, int height) {
        map = new CellState[width][height];
        tickables = new HashSet<>(width * height);
    }

    public CellState getCell(int x, int y) {
        if (map.length > y && map[y].length > x)
            return map[x][y];
        return null;
    }

    private boolean isOutOfBound(int x, int y) {
        return !(map.length > y && map[y].length > x);
    }

    public void setCell(int x, int y, CellState state) {
        if (isOutOfBound(x, y))
            SyncLogger.getLogger().warn("Someone is trying to set illegal position {},{} in the map!", x, y);
        else
            map[x][y] = state;
    }

    public CellState[][] getMap() {
        return map;
    }

    @Override
    public void cycle() {
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
            }
        }
    }
}
