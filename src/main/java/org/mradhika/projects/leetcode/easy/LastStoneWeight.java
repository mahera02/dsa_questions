package org.mradhika.projects.leetcode.easy;

import java.util.*;

public class LastStoneWeight {
	public int lastStoneWeight(int[] stones) {

		PriorityQueue<Integer> que = new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return b - a;
			}
		});

		for (int a : stones) {
			que.add(a);
		}

		while (!que.isEmpty() && que.size() > 1) {
			int y = que.poll();
			int x = que.poll();
			if (x != y) {
				y = y - x;
				que.add(y);
			}

		}
		if (que.isEmpty())
			return 0;
		return que.peek();

	}

}
