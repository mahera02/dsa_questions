package org.mradhika.projects.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NumberOfIslands {

	public static void main(String[] args) {
		int [][] DIR = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
		System.out.println(Arrays.toString(DIR));
		int SPACE = Integer.MAX_VALUE;
		
		System.out.println(NumberOfIslands.numIslands(new char[][] { { '1', '1', '1', '1', '0' },
				{ '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '1' }, { '0', '0', '0', '0', '1' } }));
		System.out.println(NumberOfIslands.findPathCost(new int[][] { { 1, 1, 1, 1, 0 },
			{ 1,1, 0, 1, 0 }, { 1, 1, 0, 0, 1 }, { 0, 9, 0, 0, 1 } } , 4,5));
	}

	
	public static int findPathCost(int[][] area , int row,int col) {
		
		Queue<Integer> que = new LinkedList<>();
		que.add(area[0][0]);
		area[0][0] = 0;
		int cost = 0;
		for(int i=0;i<area.length;i++) {
			for(int j=0;j<area[0].length;j++) {
				while(!que.isEmpty()) {
					if(area[i][j] ==9)
						return cost;
					else {
						if(area[i][j] ==1) {
							cost = cost+1;
							area[i][j]=0;
							
						}
						else
							continue;
					}
				}
				
			}
		}
		return cost;
		
		
	}
	public static int numIslands(char[][] grid) {
		//List <int[]> list = new ArrayList<>();
		if (grid.length == 0 || grid[0].length == 0) {
			return 0;
		}
		//int [][] DIR = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
		int m = grid.length;
		int n = grid[0].length;
		int count = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == '1') {
					count++;
					dfs(grid, m, n, i, j);
				}

			}

		}
		return count;
	}

	private static void dfs(char[][] grid, int m, int n, int i, int j) {

		if (i >= 0 && i < m && j >= 0 && j < n && grid[i][j] == '1') {
			grid[i][j] = '0';
			dfs(grid, m, n, i, j + 1);
			dfs(grid, m, n, i + 1, j);
			dfs(grid, m, n, i - 1, j);
			dfs(grid, m, n, i, j - 1);

		}

	}
}
