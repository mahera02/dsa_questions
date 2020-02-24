package org.mradhika.projects.leetcode.medium;

import java.util.Stack;

public class DailyTemperatures {

	//use stack to put index i
  public int[] dailyTemperatures(int[] T) {
    int[]  result = new int[T.length];
    Stack<Integer> stack = new Stack<>();
    for(int i = 0;i<T.length;i++){
        while(!stack.isEmpty() && T[i] > T[stack.peek()]){
            int index = stack.pop();
            result[index] = i-index;
        }
        stack.push(i);
    }
    return result;
    
}
}