package org.huajistudio.cas.common.cell;

import org.huajistudio.cas.api.cell.Cell;
import org.huajistudio.cas.api.cell.rule.CellInferer;
import org.huajistudio.cas.api.registry.RegistryEntry;

public class CASCell extends RegistryEntry.Impl<Cell> implements Cell {
    private CellInferer inferer;

    public CASCell(CellInferer inferer) {
        this.inferer = inferer;
    }

    @Override
    public CellInferer getInferer() {
        return inferer;
    }

    public void setInferer(CellInferer inferer) {
        this.inferer = inferer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CASCell casCell = (CASCell) o;

        return inferer != null ? inferer.equals(casCell.inferer) : casCell.inferer == null;
    }

    @Override
    public int hashCode() {
        return inferer != null ? inferer.hashCode() : 0;
    }
}
