package org.huajistudio.cas.api.cell.rule;

import org.huajistudio.cas.api.cell.Cell;
import org.huajistudio.cas.api.cell.CellMatrix;
import org.huajistudio.cas.common.cell.conway.ConwayCells;

public abstract class ConwayInferer implements CellInferer {
    abstract Cell generation(int count, Cell current);

    @Override
    public Cell generate(CellMatrix matrix) {
        int count1 = 0;
        for (Cell cell : matrix)
            if (cell.equals(ConwayCells.ALIVE))
                ++count1;
        return generation(count1, matrix.getMiddle());
    }
}
