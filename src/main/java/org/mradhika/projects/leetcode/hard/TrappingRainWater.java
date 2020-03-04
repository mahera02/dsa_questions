package org.mradhika.projects.leetcode.hard;

public class TrappingRainWater {
	public int trap(int[] height) {
        int left =0;
        int right = height.length-1;
        int maxL = 0;
        int maxR = 0;
        int countWater = 0;
        
        while(left<right){
            if(height[left] < height[right]){
               if(height[left]<maxL){
                   
                  countWater = countWater+ maxL-height[left]; 
               }
                else
                    maxL = height[left];
                
                left++;
            }
            else{
                if(height[right]<maxR){
                   
                  countWater = countWater+ maxR-height[right]; 
               }
                else
                    maxR = height[right];
                
                right--;
            }
        }
        
        return countWater;
    }
}
