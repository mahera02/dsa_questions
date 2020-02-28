package org.mradhika.projects.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupOfAnagrams {
    
	/*
	Given an array of strings, group anagrams together.

	Example:

	Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
	Output:
	[
	  ["ate","eat","tea"],
	  ["nat","tan"],
	  ["bat"]
	]
	Note:

	All inputs will be in lowercase.
	The order of your output does not matter
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static List<List<String>> groupAnagrams(String[] strs) {

		HashMap<String, List<String>> map = new HashMap<>();
		for (String s : strs) {
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			String st = new String(ch);
			if (map.containsKey(st)) {
				map.get(st).add(s);
			} else {
				List<String> sNew = new ArrayList<>();
				sNew.add(s);
				map.put(st, sNew);
			}
		}

		List<List<String>> result = new ArrayList<>();

		for (List<String> l : map.values()) {

			result.add(l);
		}
		return result;

		// return new ArrayList<List<String>>(map.values());

	}

}
