package Algorithms;

//Solution to LeetCode problem 110
public class BalancedBinaryTree {
	
	//returns true if tree is height balanced which means that the
	//depth of the two subtrees of every node never differ by more than 1
	public boolean isBalanced(TreeNode root) {
		int leftHeight, rightHeight;
        if (root == null) {
            return true;
        } else {
            leftHeight = getHeight(root.left);
            rightHeight = getHeight(root.right);
            if (Math.abs(leftHeight - rightHeight) >= 2) {
                return false;
            } else {
                return isBalanced(root.right) && isBalanced(root.left);
            }
        }
    }
    
	//Helper function to calculate height of given node
    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(getHeight(root.left), getHeight(root.right));
        }
    }

}
