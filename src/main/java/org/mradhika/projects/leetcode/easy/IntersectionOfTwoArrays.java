package org.mradhika.projects.leetcode.easy;

import java.util.*;
import java.util.HashSet;

import javax.print.attribute.HashAttributeSet;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
	   int[] response=	IntersectionOfTwoArrays.intersection(new int[] {1,2,2,1}, new int[] {2,2});
	   System.out.println(response[0]);
	   System.out.println(response.length);
	}

	public static int[] intersection(int[] nums1, int[] nums2) {

		HashSet<Integer> set = new HashSet<>();

		for (int num : nums1) {
			set.add(num);
		}

		ArrayList<Integer> list = new ArrayList<>();
		for (int num : nums2) {
			if (set.remove(num)) {
				list.add(num);
			}
		}
		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}
	 public int[] intersectionBinarySearch(int[] nums1, int[] nums2) {
	        
	        Arrays.sort(nums2);
	        Set<Integer> set= new HashSet<>();
	        for(int n : nums1){
	           if(binarySearch(nums2,n)){
	               set.add(n);
	           }
	        }
	        int[] res = new int[set.size()];
	        int k = 0;
	        for(int i : set){
	            res[k] = i;
	            k++;
	            
	        }
	        return res;
	    }
	    
	    public boolean binarySearch(int[] nums, int target){
	        
	        int left = 0;
	        int right = nums.length-1;
	       
	        while(left<=right){
	            int mid = left +(right-left)/2;
	            
	            if(nums[mid]==target)
	                return true;
	            else if (nums[mid] > target){
	                right = mid-1;
	            }
	            else{
	                left = mid+1;
	            }
	        }
	        return false;
	        
	    }

}