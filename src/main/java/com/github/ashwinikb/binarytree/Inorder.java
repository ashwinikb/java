package com.ashwinikb.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Inorder {
	
	public static List<Integer> inorderTrav(TreeNode root){
		
		List<Integer> list = new ArrayList<>();
		Stack<TreeNode> s = new Stack<>();
		TreeNode current = root;
		
		while((current != null)&& (!s.isEmpty())) {
			while((current != null)) {
				s.push(current);
				current = current.left;
			}
			
			current = s.pop();
			list.add(current.data);
			current = current.right;
		}
		
		return list;
		
	}
	
}
