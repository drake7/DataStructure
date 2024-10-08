package binaryTree;

import binaryTree.BinaryTree.Node;

public class FindHeightOfBinaryTree {

	private static int Maxheight = 0;
	public static void main(String[] args) {


		BinaryTree bt = new BinaryTree();
		bt.add(10);
		bt.add(20);
		bt.add(30);
		bt.add(5);

		bt.traverseInOrder(bt.root);
		System.out.println();
		bt.traversePreOrder(bt.root);
		System.out.println();

		System.out.println("Height is :"+findHeight(bt.root));
	}

	static int findHeight(Node root) {
		// TODO Auto-generated method stub

		if (root == null)
			return 0;


		int ldepth = findHeight(root.left);
		int rdepth = findHeight(root.right);

		return Math.max(ldepth, rdepth) + 1;
	}
}
