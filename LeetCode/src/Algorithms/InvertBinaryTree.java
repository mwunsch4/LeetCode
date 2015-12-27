package Algorithms;

//Solution to LeetCode problem 226
public class InvertBinaryTree {
	
	//The following method inverts a binary tree
	public static TreeNode invertTree(TreeNode root) {
	    TreeNode temp = null;
	    if (root == null) {
	        return null;
	    }
	    temp = invertTree(root.right);
	    root.right = invertTree(root.left);
	    root.left = temp;
	    return root;
	}
}
