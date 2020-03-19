package org.mradhika.projects.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsPhoneNum {
	 
    String[] str = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        
        List<String> result = new ArrayList<>();
        if(digits==null || digits.length()==0)
            return result;
        backtracking(result, new StringBuffer(),digits,0);
        return result;
        
    }
    public void backtracking(List<String> result , StringBuffer sb , String digits , int start){
        
        if(sb.length() == digits.length())
            result.add(sb.toString());
        else{
                int index = digits.charAt(start)-'0'; 
                String s = str[index];
            for(char c : s.toCharArray()){
               sb.append(c); 
               backtracking(result, sb , digits , start+1);
               sb.setLength(sb.length()-1); 
            }
         }
              
          
            
       }
}
