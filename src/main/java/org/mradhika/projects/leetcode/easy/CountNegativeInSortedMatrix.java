package org.mradhika.projects.leetcode.easy;

public class CountNegativeInSortedMatrix {

	// O(m+n) solution // Timeout happens 
	  public static  int countNegatives(int[][] grid) {
	        int m = grid.length;
	        int n = grid[0].length;
	        int i = 0;
	        int j = n-1;
	        int count = 0;
	        
	        while(i<m  && j>=0){
	            if(grid[i][j] < 0){
	                j--;
	                count= count+ m-i;
	            }
	            else{
	                i++;
	            }
	        }
	        return count;
	        
	    }
	  
	  // Binary Search
	  public int countNegativesBetterApproach(int[][] grid) {
	        int m = grid.length;
	        int n = grid[0].length;
	        int count = 0;
	        
	        for(int[] row : grid){
	            count = count+ binarySearch(row);
	        }
	        return count;
	        
	    }
	    
	    public int binarySearch(int[] row){
	        int left = 0;
	        int right = row.length;
	        while(left<right){
	            int mid = left+ (right-left)/2;
	            if(row[mid]<0){
	                right = mid;
	            }
	            else{
	                left = mid+1;
	            }
	        }
	        return row.length-left;
	        
	    }
	  public static void main(String[] args) {
		
		  int[][] grid = new int[][] {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		  System.out.println(countNegatives(grid));
		  
	}
}
