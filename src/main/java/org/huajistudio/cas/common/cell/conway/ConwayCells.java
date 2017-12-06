package org.huajistudio.cas.common.cell.conway;

import org.huajistudio.cas.api.cell.Cell;
import org.huajistudio.cas.common.cell.CASCell;

public interface ConwayCells {
    Cell ALIVE = new CASCell().setRegistryName("conway:alive");
}
