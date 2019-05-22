package org.mradhika.projects.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;

public class MostCommonWord {

	public static void main(String[] args) {
		System.out.println(MostCommonWord.mostCommonWord1("Bob hit a ball, the hit BALL flew far after it was hit.",
				new String[] { "hit" }));
	}

	public static String mostCommonWord(String paragraph, String[] banned) {

		HashSet<String> set = new HashSet<>();
		for (String s : banned) {
			set.add(s);
		}
		String mcw = "";
		int max = 0;
		HashMap<String, Integer> map = new HashMap<>();
		paragraph = formatPara(paragraph);
		String[] words = paragraph.split(" ");
		for (String word : words) {
			word = word.toLowerCase();
			if (!word.isEmpty() && !set.contains(word)) {
				if (map.containsKey(word)) {
					map.put(word, map.get(word) + 1);
				} else {
					map.put(word, 1);
				}
				if (map.get(word) > max) {
					max = map.get(word);
					mcw = word;
				}
			}
		}

		return mcw;
	}

	private static String formatPara(String para) {
		StringBuffer sb = new StringBuffer();

		for (char c : para.toCharArray()) {

			if (Character.isLetter(c) || c == ' ') {
				sb.append(c);
			} else {
				sb.append(" ");
			}
		}
		return sb.toString();

	}

	// better aproach

	public static String mostCommonWord1(String paragraph, String[] banned) {
		paragraph = paragraph + ".";
		HashSet<String> set = new HashSet<>();
		for (String s : banned) {
			set.add(s);
		}
		String mcw = "";
		int max = 0;
		HashMap<String, Integer> map = new HashMap<>();

		StringBuffer sb = new StringBuffer();
		for (char c : paragraph.toCharArray()) {

			if (Character.isLetter(c)) {
				sb.append(Character.toLowerCase(c));
			} else if (sb.length() > 0) {
				String word = sb.toString();
				if (!set.contains(word)) {
					if (map.containsKey(word)) {
						map.put(word, map.get(word) + 1);
					} else {
						map.put(word, 1);
					}
					if (map.get(word) > max) {
						max = map.get(word);
						mcw = word;
					}
				}
				sb = new StringBuffer();
			}
		}

		return mcw;
	}
}