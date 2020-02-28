package org.mradhika.projects.leetcode.easy;

public class Anagram {
	 public boolean isAnagram(String s, String t) {
	        
	        int[] charMap = new int[26];
	        
	        char[] sChar = s.toCharArray();
	        char[] tChar = t.toCharArray();
	        
	        if(tChar.length < sChar.length)
	            return false;
	        
	        for( char ch : sChar){
	            charMap[ch-'a']++;
	        }
	        
	        for(char ch : tChar){
	            charMap[ch-'a']--;
	            if(charMap[ch-'a']<0)
	                return false;
	            
	        }
	        return true;
	        
	    }
}
