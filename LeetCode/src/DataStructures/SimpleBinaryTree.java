package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
	int value;
	TreeNode left, right;
	
	TreeNode(int valIn){
		value = valIn;
	}
}
public class SimpleBinaryTree {
	TreeNode head;
	public SimpleBinaryTree(int headValue) {
		head = new TreeNode(headValue);
	}
	public SimpleBinaryTree(int[] tree) {
		populate(tree, 0);
	}
	
	public void printTree() {
		printTreeFromRoot(head);
		System.out.print("\n" + head.value + ",");
		printChildren(head);
	}
	
	public void printTreeFromRoot(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>() ;
	    if (root == null)
	        return;
	    queue.clear();
	    queue.add(root);
	    while(!queue.isEmpty()){
	        TreeNode node = queue.remove();
	        System.out.print(node.value + " ");
	        if(node.left != null) queue.add(node.left);
	        if(node.right != null) queue.add(node.right);
	    }

	}
	private void printChildren(TreeNode node) {
		if (node == null) {
			System.out.print("*" + ",");
			return;
		}
		if (node.left != null) {
			System.out.print(node.left.value + ",");
		} else {
			//System.out.print("*" + ",");
		}
		if (node.right != null) {
			System.out.print(node.right.value + ",");
		} else {
			//System.out.print("*" + ",");
		}
		printChildren(node.left);
		printChildren(node.right);
	}
	
	//This method is not currently working
	public TreeNode populate(int[] tree, int idx) {
		TreeNode newNode;
		if (idx >= tree.length) {
			return null;
		} else {
			if (tree[idx] == -1) {
				return null;
			}
			if (head == null) {
				head = new TreeNode(tree[idx]); 
				head.left = populate(tree, idx+1);
				head.right = populate(tree, idx+2);
			} else {
				newNode = new TreeNode(tree[idx]);
				newNode.left = populate(tree, idx+1);
				newNode.right = populate(tree, idx+2);
				return newNode;
			}
		}
		return head;
	}
	
	//returns height of given node
	public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(getHeight(root.left), getHeight(root.right));
        }
    }
	
	//returns true if this tree is height balanced
	public boolean isHeightBalanced() {
		return isBalancedAtNode(head);
	}
	
	//recursive function used by isHeightBalanced()
	public boolean isBalancedAtNode(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);
            if (Math.abs(leftHeight - rightHeight) >= 2) {
                return false;
            } else {
                return isBalancedAtNode(root.right) && isBalancedAtNode(root.left);
            }
        }
    }
	
	public static void main(String[] args) {
		int[] tree = {3,1,4,-1,2};
		SimpleBinaryTree bt = new SimpleBinaryTree(tree);
		bt.printTree();
	}

}
