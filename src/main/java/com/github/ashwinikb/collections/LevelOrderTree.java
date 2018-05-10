/**
 * 
 */
package com.github.ashwinikb.collections;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ashwini
 *
 */
public class LevelOrderTree {
	
	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int data) {
			this.data = data;
		}
		
		public static void levelOrderTraversal(TreeNode startNode) {
			Queue<TreeNode> queue = new LinkedList<TreeNode>();	
			queue.add(startNode);
			while(!queue.isEmpty()) {
				TreeNode tempNode = queue.poll();
				System.out.println(tempNode.data);
				if(tempNode.left != null) 
					queue.add(tempNode.left);
				if(tempNode.right != null)
					queue.add(tempNode.right);
			}
		}
		
		public static void main(String[] args) {
			TreeNode rootNode = createBinaryTree();
			System.out.println("Level Order Traversalof Binary Tree will be :");
			levelOrderTraversal(rootNode);
		}

		
		private static TreeNode createBinaryTree() {
			
			TreeNode rootNode = new TreeNode(40);
			TreeNode node1 = new TreeNode(10);
			TreeNode node2 = new TreeNode(20);
			TreeNode node3 = new TreeNode(30);
			TreeNode node4 = new TreeNode(60);
			TreeNode node5 = new TreeNode(70);
			TreeNode node6 = new TreeNode(80);
			
			rootNode.left = node1;
			rootNode.right = node4;
			
			node1.left = node2;
			node1.right = node3;
			
			node4.left = node5;
			node4.right = node6;

			return rootNode;
		}
	}

}
