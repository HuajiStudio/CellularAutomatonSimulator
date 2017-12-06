package org.huajistudio.cas.common.cell;

import org.huajistudio.cas.api.cell.Cell;

public interface BasicCells {
    Cell EMPTY = new CASCell().setRegistryName("cas:empty");
}
