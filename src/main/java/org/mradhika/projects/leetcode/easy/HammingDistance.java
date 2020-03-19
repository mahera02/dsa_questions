package org.mradhika.projects.leetcode.easy;

public class HammingDistance {
	 public static int hammingDistance(int x, int y) {
	        int z= x ^ y;
	        int countOfSetBits=0;
	        while (z != 0) {
	            countOfSetBits += z & 1;
	            //right shift
	            z = z >> 1;
	        }
	     return countOfSetBits;
	   }
	 
	 public static void main(String[] args) {
		
		 HammingDistance.hammingDistance(1,4);
		 
	}
}
