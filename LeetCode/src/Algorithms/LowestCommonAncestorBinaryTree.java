package Algorithms;

public class LowestCommonAncestorBinaryTree {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root.val == p.val || root.val == q.val) {
            return root;
        } else {
            if (root.right == null && root.left == null) {
                return null;
            } else {
                TreeNode right = lowestCommonAncestor(root.right, p, q);
                TreeNode left = lowestCommonAncestor(root.left, p, q);
                if (right != null ^ left != null) {
                    if (right != null) {
                        return right;
                    } else if (left != null) {
                        return left;
                    }
                } else {
                    if (left != null && right != null) {
                        return root;
                    } else {
                        return null;
                    }
                }
            }
        } 
        return null;
    }
}
