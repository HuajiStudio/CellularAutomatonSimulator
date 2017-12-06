package org.huajistudio.cas.api;

import org.huajistudio.cas.api.cell.Cell;
import org.huajistudio.cas.api.registry.Registry;
import org.huajistudio.cas.api.registry.SimpleRegistry;
import org.huajistudio.cas.common.world.World;

public interface CASRegistries {
    Registry<Cell> CELLS = new SimpleRegistry<>(Cell.class);
    Registry<World> WORLDS = new SimpleRegistry<>(World.class);
}
