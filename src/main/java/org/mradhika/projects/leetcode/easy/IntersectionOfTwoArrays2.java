package org.mradhika.projects.leetcode.easy;

import java.util.*;
import java.util.HashSet;

import javax.print.attribute.HashAttributeSet;

public class IntersectionOfTwoArrays2 {

	public static void main(String[] args) {
		int[] response = IntersectionOfTwoArrays2.intersect(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 });
		System.out.println(response[0]);
		System.out.println(response.length);
	}

	public static int[] intersect(int[] nums1, int[] nums2) {

		HashMap<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < nums1.length; i++) {
			int count = map.getOrDefault(nums1[i], 0);
			map.put(nums1[i], count + 1);
		}
		for (int i = 0; i < nums2.length; i++) {
			if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
				list.add(nums2[i]);
				map.put(nums2[i], map.get(nums2[i]) - 1);
			}
		}
		int[] res = new int[list.size()];
		for (int j = 0; j < list.size(); j++) {
			res[j] = list.get(j);
		}
		return res;
	}

}