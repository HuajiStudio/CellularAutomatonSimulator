package org.huajistudio.cas.rule;

public abstract class ConwayRule extends CARule {
	abstract int generation(int count1, int cur);

	@Override
	int generation(int nw, int n, int ne, int w, int mid, int e, int sw, int s, int se) {
		int[] statesAround = new int[]{nw, n, ne, w, e, sw, s, se};
		int count1 = 0;
		for (int state : statesAround)
				if (state == 1)
					++count1;
		return generation(count1, mid);
	}
}
