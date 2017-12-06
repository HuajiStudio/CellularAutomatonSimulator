package org.huajistudio.cas.common.cell.conway;

import org.huajistudio.cas.api.cell.Cell;
import org.huajistudio.cas.common.cell.CASCell;
import org.huajistudio.cas.common.cell.rule.SimpleConwayInferer;

public interface ConwayCells {
    Cell ALIVE = new CASCell(new SimpleConwayInferer()).setRegistryName("conway:alive");
}
