package org.huajistudio.cas.api.cell.rule;

import org.huajistudio.cas.api.cell.Cell;
import org.huajistudio.cas.api.cell.CellMatrix;

import java.util.HashMap;
import java.util.Map;

public abstract class CountingInferer implements CellInferer {
    abstract Cell generation(Map<Integer, Integer> countMap, Cell current);

    @Override
    public Cell generate(CellMatrix matrix) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (Cell cell : matrix)
//			TODO
//			if (countMap.containsKey(cell)) {
//				int count = countMap.get(cell);
//				countMap.replace(cell, count + 1);
//			} else
//				countMap.put(cell, 1);
            ;
        return generation(countMap, matrix.getMiddle());
    }
}
