package org.huajistudio.cas.api.cell;

import com.google.common.collect.Iterators;

import javax.annotation.Nonnull;
import java.util.Arrays;
import java.util.Iterator;

public class CellMatrix implements Iterable<Cell> {
    private Cell[] cells = new Cell[9];

    public CellMatrix(Cell... cells) {
        if (cells.length > 9)
            this.cells = Arrays.copyOfRange(cells, 0, 8);
        else
            this.cells = cells;
    }

    public Cell[] getCells() {
        return cells;
    }

    public void setCells(Cell... cells) {
        if (cells.length < 8)
            this.cells = Arrays.copyOf(cells, 9);
        else
            this.cells = cells;
    }

    public Cell getNorthWest() {
        return cells[0];
    }

    public CellMatrix setNorthWest(Cell cell) {
        cells[0] = cell;
        return this;
    }

    public Cell getNorth() {
        return cells[1];
    }

    public CellMatrix setNorth(Cell cell) {
        cells[1] = cell;
        return this;
    }

    public Cell getNorthEast() {
        return cells[2];
    }

    public CellMatrix setNorthEast(Cell cell) {
        cells[2] = cell;
        return this;
    }

    public Cell getEast() {
        return cells[3];
    }

    public CellMatrix setEast(Cell cell) {
        cells[3] = cell;
        return this;
    }

    public Cell getSouthEast() {
        return cells[4];
    }

    public CellMatrix setSouthEast(Cell cell) {
        cells[4] = cell;
        return this;
    }

    public Cell getSouth() {
        return cells[5];
    }

    public CellMatrix setSouth(Cell cell) {
        cells[5] = cell;
        return this;
    }

    public Cell getSouthWest() {
        return cells[6];
    }

    public CellMatrix setSouthWest(Cell cell) {
        cells[6] = cell;
        return this;
    }

    public Cell getWest() {
        return cells[7];
    }

    public CellMatrix setWest(Cell cell) {
        cells[7] = cell;
        return this;
    }

    public Cell getMiddle() {
        return cells[8];
    }

    public CellMatrix setMiddle(Cell cell) {
        cells[8] = cell;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CellMatrix that = (CellMatrix) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(cells, that.cells);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(cells);
    }

    @Nonnull
    @Override
    public Iterator<Cell> iterator() {
        return Iterators.cycle(cells);
    }
}
