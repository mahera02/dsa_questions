package org.mradhika.projects.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	 public static  List<List<Integer>> permute(int[] nums) {
	        
         List<List<Integer>> list = new ArrayList<>();
         backtracking(list,new ArrayList<>(),nums);
        return list;
    }
    
    private static void backtracking( List<List<Integer>> list,List<Integer> templist,int[] nums){
        
        if(templist.size()==nums.length)
            list.add(new ArrayList<>(templist));
        else{
        for(int i = 0;i<nums.length;i++){
            if(templist.contains(nums[i]))
                continue;
            templist.add(nums[i]);
            backtracking(list,templist,nums);
            templist.remove(templist.size()-1);
        }
        }
        
    }
	public static void main(String[] args) {
		Permutations.permute(new int[] {1,2,3});
	}

}
