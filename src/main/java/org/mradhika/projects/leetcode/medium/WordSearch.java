package org.mradhika.projects.leetcode.medium;

public class WordSearch {
	/*
	 * board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]

Given word = "ABCCED", return true.
Given word = "SEE", return true.
Given word = "ABCB", return false.*/
	public boolean exist(char[][] board, String word) {
		// little bit similar to no of Island Question
		char[] ch = word.toCharArray();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {

				if (dfsWordSearch(board, i, j, ch, 0)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean dfsWordSearch(char[][] board, int i, int j, char[] ch, int index) {

		if (index == ch.length)
			return true;

		if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != ch[index]
				|| board[i][j] == '#')
			return false;

		char c = board[i][j];
		board[i][j] = '#';
		boolean search = dfsWordSearch(board, i + 1, j, ch, index + 1) || dfsWordSearch(board, i - 1, j, ch, index + 1)
				|| dfsWordSearch(board, i, j + 1, ch, index + 1) || dfsWordSearch(board, i, j - 1, ch, index + 1);

		board[i][j] = c;
		return search;

	}
}
