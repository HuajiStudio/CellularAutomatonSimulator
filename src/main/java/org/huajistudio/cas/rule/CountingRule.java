package org.huajistudio.cas.rule;

import java.util.HashMap;
import java.util.Map;

public abstract class CountingRule extends CARule {
	abstract int generation(Map<Integer, Integer> countMap, int cur);

	@Override
	int generation(int nw, int n, int ne, int w, int mid, int e, int sw, int s, int se) {
		Map<Integer, Integer> countMap = new HashMap<>();
		int[] statesAround = new int[]{nw, n, ne, w, e, sw, s, se};
		for (int state : statesAround)
			if (countMap.containsKey(state)) {
				int count = countMap.get(state);
				countMap.replace(state, count + 1);
			} else
				countMap.put(state, 1);
		return generation(countMap, mid);
	}
}
