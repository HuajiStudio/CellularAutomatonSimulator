package org.huajistudio.cas.api.cell.rule;

import org.huajistudio.cas.api.cell.Cell;
import org.huajistudio.cas.api.cell.CellMatrix;

public interface CellInferer {
    Cell generate(CellMatrix matrix);
}
