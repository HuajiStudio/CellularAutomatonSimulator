package org.huajistudio.cas.common.cell.rule;

import org.huajistudio.cas.api.cell.Cell;
import org.huajistudio.cas.api.cell.rule.ConwayInferer;
import org.huajistudio.cas.common.cell.BasicCells;
import org.huajistudio.cas.common.cell.conway.ConwayCells;

public class SimpleConwayInferer extends ConwayInferer {
    @Override
    public Cell generation(int count, Cell current) {
        return BasicCells.EMPTY;
    }
}
