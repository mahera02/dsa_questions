package org.mradhika.projects.leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int[][] merge(int[][] intervals) {
	        
	        
	        Arrays.sort(intervals, new Comparator<int[]>(){
	            public int compare(int[] a , int[] b){
	                return a[0] -b[0];
	            }
	        });
	        int[][] result = new int[intervals.length][2];
	        int left = 0;
	        int right = 1;
	        while(right<intervals.length){
	            if(intervals[left][1] >= intervals[right][0] ){
	                intervals[left][1] = intervals[left][1] <= intervals[right][1] ? intervals[right][1] : intervals[left][1] ;
	                intervals[right] = new int[]{-1,-1};
	            }
	            else
	                left=right;
	        right++;     
	           
	        }
	        
	        int k = 0;
	        for(int i = 0; i<intervals.length;i++){
	            if(intervals[i][0]!=-1 && intervals[i][1]!=-1){
	                result[k] = intervals[i];
	                k++;
	            }
	        }
	        
	        return Arrays.copyOf(result,k);
	        
	        
	    }

}
