package org.mradhika.projects.leetcode.easy;

public class ReverseWordsInString {

	 public static  String reverseWords(String s) {
	        
	      /* String[] words = s.split(" ");
	        
	       StringBuilder res = new StringBuilder();
	       
	       for(String word: words){
	           res.append(reverseString(word) + " ");
	       } 
	        return res.toString().trim();*/
	         StringBuilder res = new StringBuilder();
	        for(int i = 0; i<s.length();i++){
	            int end = i;
	            while(end<s.length() && s.charAt(end)!= ' '){
	                end++;
	            }
	            res.append(reverseString(s.substring(i,end)) + " ");
	            i = end;
	        }
	        
	         return res.toString().trim();
	    }
	    
	    public  static String reverseString(String s){
	        
	        int right = s.length()-1;
	        int left = 0;
	        char[] ch = s.toCharArray();
	        while(left<=right){
	            char c= ch[right];
	            ch[right] = ch[left];
	            ch[left] = c;
	            left++;
	            right--;
	            
	        }
	        return new String(ch);
	    }
	public static void main(String[] args) {
        String s = new String("Let's take LeetCode contest");
        System.out.println(ReverseWordsInString.reverseWords(s));
	}

}
