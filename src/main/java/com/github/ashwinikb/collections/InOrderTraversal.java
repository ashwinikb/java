/**
 * 
 */
package com.github.ashwinikb.collections;

import java.util.Stack;

import com.github.ashwinikb.collections.LevelOrderTree.TreeNode;

public class InOrderTraversal {

	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}

		public static void inOrderTraversal(TreeNode rootNode) {
			if (rootNode == null) {
				return;
			}
			Stack<TreeNode> s = new Stack<TreeNode>();
			TreeNode currentNode = rootNode;

			while (!s.empty() || currentNode != null) {
				if (currentNode != null) {
					s.push(currentNode);
					currentNode = currentNode.left;
				} else {
					TreeNode node = s.pop();
					System.out.println(node.data);
					currentNode = node.right;
				}
			}
		}

		public static void main(String[] args) {
			TreeNode rootNode = createBinaryTree();
			inOrderTraversal(rootNode);
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