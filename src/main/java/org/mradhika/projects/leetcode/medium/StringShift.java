package org.mradhika.projects.leetcode.medium;

public class StringShift {
	/*
	 * You are given a string s containing lowercase English letters, and a matrix shift, where shift[i] = [direction, amount]:

direction can be 0 (for left shift) or 1 (for right shift). 
amount is the amount by which string s is to be shifted.
A left shift by 1 means remove the first character of s and append it to the end.
Similarly, a right shift by 1 means remove the last character of s and add it to the beginning.
Return the final string after all operations.

 

Example 1:

Input: s = "abc", shift = [[0,1],[1,2]]
Output: "cab"
Explanation: 
[0,1] means shift to left by 1. "abc" -> "bca"
[1,2] means shift to right by 2. "bca" -> "cab"
	 */

    public String stringShift(String s, int[][] shift) {
        
        int leftShiftCount=0;
        int len = s.length();
        String result = "";
        for(int i=0 ;i <shift.length;i++){
                if(shift[i][0]==0){
                    leftShiftCount=leftShiftCount+ shift[i][1];
                }
                else{
                    leftShiftCount=leftShiftCount-shift[i][1];
                }
        }
         String sub ="";
        leftShiftCount = leftShiftCount%(len);
        if(leftShiftCount<0){
            //dorightshift
            //System.out.println(leftShiftCount);
             sub = s.substring(len+leftShiftCount);
            //System.out.println(sub);
            result = sub+ s.substring(0,len+leftShiftCount);
            //System.out.println(result);
        }
        else{
            //doleftshift
             sub = s.substring(0,leftShiftCount);
            //System.out.println(sub);
            
            result = s.substring(leftShiftCount)+sub;
            //System.out.println(result);
        }
        
        return result;
        
    }
}
