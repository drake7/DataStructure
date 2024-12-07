package leetcode75.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeDepth {
	
	public static void main(String[] args) {
	    BinaryTreeDepth tree = new BinaryTreeDepth();

	    // Example binary tree in level-order format:
	    //      1
	    //     / \
	    //    2   3
	    //   / \   \
	    //  4   5   6

	    Integer[] values = {1, 2, 3, 4, 5, null, 6};
	    TreeNode root = tree.buildTree(values);	
	}

	public TreeNode buildTree(Integer[] values) {
		if (values == null || values.length == 0) return null;

		TreeNode root = new TreeNode(values[0]);
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		int i = 1;
		while (i < values.length) {
			TreeNode current = queue.poll();

			// Add left child if it exists
			if (values[i] != null) {
				current.left = new TreeNode(values[i]);
				queue.add(current.left);
			}
			i++;

			// Add right child if it exists
			if (i < values.length && values[i] != null) {
				current.right = new TreeNode(values[i]);
				queue.add(current.right);
			}
			i++;
		}

		return root;
	}
    public int maxDepth(TreeNode root) {
        

        if(root == null)
        {
                return 0;
        }
        int leftMaxDepth = maxDepth(root.left);
        int rightMaxDepth =  maxDepth(root.right);
        
        
        return 1+ Math.max(leftMaxDepth, rightMaxDepth);
    }
}
