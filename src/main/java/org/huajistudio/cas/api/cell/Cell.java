package org.huajistudio.cas.api.cell;

import org.huajistudio.cas.api.cell.rule.CellInferer;
import org.huajistudio.cas.api.registry.RegistryEntry;

public interface Cell extends RegistryEntry<Cell> {
    CellInferer getInferer();

    @Override
    boolean equals(Object obj);

    @Override
    int hashCode();

    default CellState createState(int x, int y) {
        return new CellState(this, x, y);
    }
}
