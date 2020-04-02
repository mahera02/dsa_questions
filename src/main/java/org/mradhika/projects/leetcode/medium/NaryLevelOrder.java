package org.mradhika.projects.leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.mradhika.projects.leetcode.easy.Node;

public class NaryLevelOrder {
	
	
	//Recursive
	 public List<List<Integer>> levelOrderRecursive(Node root) {
         List<List<Integer>> list = new ArrayList<>();
         levelOrderCall(list,root,0);  
        return list;
    }
    public void levelOrderCall(List<List<Integer>> list,Node root,int level){
        
        if(root==null)
            return;
        if(list.size()<=level)
            list.add(new ArrayList<>());
        list.get(level).add(root.val);
        for(Node child : root.children)
            levelOrderCall(list,child,level+1);
        
    }
    
    //Iterative
	 public List<List<Integer>> levelOrder(Node root) {
         List<List<Integer>> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        int level = 0;
        if(root==null)
            return list;
         list.add(new ArrayList<>());
        while(!queue.isEmpty()){
            Node node = queue.poll();
            if(node!=null){
                list.get(level).add(node.val);
                for(Node child : node.children){
                    queue.add(child);
                }
                
            }
            else{
                if(!queue.isEmpty()){
                    list.add(new ArrayList<>());
                    queue.add(null);
                }
                  level++;
            }
        }
        return list;
    }
}
