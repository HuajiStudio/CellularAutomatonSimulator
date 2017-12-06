package org.huajistudio.cas.api.cell;

import javax.annotation.Nonnull;

public class CellState {
    private final int x;
    private final int y;

    @Nonnull
    private Cell type;

    public CellState(@Nonnull Cell type, int x, int y) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Nonnull
    public Cell getType() {
        return type;
    }

    public CellState setType(@Nonnull Cell type) {
        this.type = type;
        return this;
    }

    public void update(CellMatrix matrix) {
        type = type.getInferer().generate(matrix);
    }
}
