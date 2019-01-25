package org.mradhika.projects.leetcode.easy;

public class NeedleInHaystack {

	public static int strStr(String haystack, String needle) {

		if (needle == null || needle.isEmpty()) {
			return 0;
		}
		char[] hay = haystack.toCharArray();
		if (haystack.contains(needle)) {
			for (int i = 0; i < hay.length; i++) {
				String str = haystack.substring(i, i + needle.length());
				if (str.equalsIgnoreCase(needle))
					return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int result = NeedleInHaystack.strStr("mississippi", "issip");
		System.out.println(result);

	}

}
