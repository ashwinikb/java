package com.ashwinikb.binarytree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PreOrder {
	 public List<Integer> preorderTraversal(TreeNode root) {
	        
	        List<Integer> list = new LinkedList<Integer>();
			if(root==null) return list;
			Stack<TreeNode> s = new Stack<TreeNode>();
			s.push(root);
			while(!s.empty()) {
				TreeNode current = s.pop();
				list.add(current.data);
				if(current.right!=null) s.push(current.right);
				if(current.left!=null) s.push(current.left);
			}
			return list;
		}

}
