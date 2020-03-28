package org.mradhika.projects.leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
	
	//DP 
	 public static boolean wordBreakDP(String s, List<String> wordDict) {
		 
		 if (s == null || s.length() == 0) return false;
		  
		  int n = s.length();
		  
		  // dp[i] represents whether s[0...i] can be formed by dict
		  boolean[] dp = new boolean[n+1];
		  dp[0] = true;
		  for (int i = 0; i <= n; i++) {
		    for (int j = 0; j < i; j++) {
		      String sub = s.substring(j, i );
		      
		      if (wordDict.contains(sub) && dp[j]) {
		        dp[i] = true;
		        break;
		      }
		    }
		  }
		  
		  return dp[n];
		 
	 }
	    static Set<String> map = new HashSet();
	    public static boolean wordBreakSet(String s, List<String> wordDict) {
	        if(wordDict.contains(s)) return true;
	        if(map.contains(s)) return false;
	        for(String word : wordDict){
	            if(s.startsWith(word)){
	                if(wordBreakSet(s.substring(word.length()), wordDict)) return true;
	            }
	        }
	        map.add(s);
	        return false;
	    
	    }
	
	 //fails when all chars are same as below
	//"aaaaaaa"
	//["aaaa","aaa"]
	 public static boolean wordBreak(String s, List<String> wordDict) {
	        
	        char[] ch = s.toCharArray();
	        int left = 0;
	        boolean canSegemented = false;
	        StringBuffer sb  = new StringBuffer();
	        while(left<ch.length){
	            sb.append(ch[left]);
	            if(wordDict.contains(sb.toString())){
	                canSegemented = true;
	                sb = new StringBuffer();
	            }
	            else{
	                canSegemented = false;
	            }
	            left++;
	        }
	        return canSegemented;
	    }
	 
	 public static void main(String[] args) {
		String s =  "cat";
		List<String> wordDict = new ArrayList<>() ;
		wordDict.add("ca");
		wordDict.add("cat");
		WordBreak.wordBreakDP(s,wordDict);
		
		}

}
