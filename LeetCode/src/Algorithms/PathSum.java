package Algorithms;

//Solution to LeetCode problem 112
public class PathSum {
	
	//Given a binary tree and a sum, determine if the tree has a root-to-leaf 
	//path such that adding up all the values along the path equals the given sum.
	public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
           if (sum == root.val) {
                return true;
            } else {
                return false;
            } 
        }
        return hasPathSum(root.right, sum - root.val) || hasPathSum(root.left, sum - root.val);
    }
	public static void main(String[] args) {
		// TODO Auto-generated binary tree for testing

	}

}
