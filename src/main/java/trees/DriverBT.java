package trees;

import trees.*;
import java.util.Iterator;

public class DriverBT 
{
	public static void main(String[] args)

	{
	   BinaryTree<String> aTree = new BinaryTree<>();
		createTree1(aTree);
		showTreeStats(aTree, "A", 3, 7);
		System.out.println("Inorder traverse");
		inorderTraverse(aTree.getRootNode());

		aTree.clear();
		createTree2(aTree);
		showTreeStats(aTree, "A", 3, 6);
		System.out.println("preorder traverse");
		preorderTraverse(aTree.getRootNode());

		aTree.clear();
		createTree3(aTree);
		showTreeStats(aTree, "A", 4, 7);
		System.out.println("postorder traverse");
		postorderTraverse(aTree.getRootNode());
		
		aTree.clear();
		createTree4(aTree);
		showTreeStats(aTree, "A", 4, 8);
		System.out.println("postorder traverse");
		postorderTraverse(aTree.getRootNode());
		
		System.out.println("Done.");
	}  // end main

	

	/** Precondition: tree is empty but not null. */
	public static void createTree1(BinaryTree<String> tree)
	{
		// Leaves
		BinaryTree<String> dTree = new BinaryTree<>("D");
		BinaryTree<String> eTree = new BinaryTree<>("E");
		BinaryTree<String> fTree = new BinaryTree<>("F");
		BinaryTree<String> gTree = new BinaryTree<>("G");

		// Subtrees:
		BinaryTree<String> bTree = new BinaryTree<>("B", dTree, eTree);
		BinaryTree<String> cTree = new BinaryTree<>("C", fTree, gTree);

		tree.setTree("A", bTree, cTree);	
		
      System.out.println("\nTree 1:\n");
      System.out.println("     A      ");
      System.out.println("   /   \\   "); // '\\' is the escape character for backslash
      System.out.println("  B     C   ");
      System.out.println(" / \\   / \\");
      System.out.println("D   E  F  G ");
      System.out.println();
	} // end createTree1
	
	public static void createTree2(BinaryTree<String> tree) //  B has no left child
	{
		// Leaves
		BinaryTree<String> eTree = new BinaryTree<>("E");
		BinaryTree<String> fTree = new BinaryTree<>("F");
		BinaryTree<String> gTree = new BinaryTree<>("G");

		// Subtrees:
		BinaryTree<String> bTree = new BinaryTree<>("B", null, eTree);
		BinaryTree<String> cTree = new BinaryTree<>("C", fTree, gTree);

      tree.setTree("A", bTree, cTree);
		
      System.out.println("\nTree 2:\n");
      System.out.println("     A      ");
      System.out.println("   /   \\   ");
      System.out.println("  B     C   ");
      System.out.println("   \\   / \\");
      System.out.println("    E  F  G ");
      System.out.println();
	} // end createTree2

	public static void createTree3(BinaryTree<String> tree)
	{ 
		// Leaves
		BinaryTree<String> dTree = new BinaryTree<>("D");
		BinaryTree<String> eTree = new BinaryTree<>("E");
		BinaryTree<String> gTree = new BinaryTree<>("G");

		// Subtrees:
		BinaryTree<String> fTree = new BinaryTree<>("F", null, gTree);
		BinaryTree<String> bTree = new BinaryTree<>("B", dTree, eTree);
		BinaryTree<String> cTree = new BinaryTree<>("C", fTree, null);

		tree.setTree("A", bTree, cTree);
		
      System.out.println("\nTree 3:\n");
      System.out.println("     A      ");
      System.out.println("   /   \\  ");
      System.out.println("  B     C  ");
      System.out.println(" / \\   /  ");
      System.out.println("D   E  F   ");
      System.out.println("        \\ ");
      System.out.println("         G ");
      System.out.println();
	} // end createTree3

	public static void createTree4(BinaryTree<String> tree) //  D has H as right child
	{
		// Leaves
		BinaryTree<String> eTree = new BinaryTree<>("E");
		BinaryTree<String> fTree = new BinaryTree<>("F");
		BinaryTree<String> gTree = new BinaryTree<>("G");
		BinaryTree<String> hTree = new BinaryTree<>("H");

		// Subtrees:
		BinaryTree<String> dTree = new BinaryTree<>("D", null, hTree);
		BinaryTree<String> bTree = new BinaryTree<>("B", dTree, eTree);
		BinaryTree<String> cTree = new BinaryTree<>("C", fTree, gTree);

		tree.setTree("A", bTree, cTree);
		
      System.out.println("\nTree 4:\n");
      System.out.println("     A      ");
      System.out.println("   /   \\   ");
      System.out.println("  B     C   ");
      System.out.println(" / \\   / \\");
      System.out.println("D   E  F  G ");
      System.out.println(" \\         ");
      System.out.println("  H         ");
      System.out.println();
	} // end createTree4

	

	public static void showTreeStats(BinaryTree<String> tree, String root, int height, int numberOfNodes)
	{
		if (tree.isEmpty())
			System.out.println("The tree is empty");
		else
			System.out.println("The tree is not empty");
		
		System.out.println("Root of tree is " + tree.getRootData() + "; " + root);
		
		System.out.println("Height of tree is " + tree.getHeight() + "; " + height);

		System.out.println("# nodes in tree is " + tree.getNumberOfNodes() + "; " + numberOfNodes);
	} // end showTreeStats 

	//inorderTraverse method
	public static void inorderTraverse(BinaryNode node)
	{
	   if (node != null)
	   {
	      inorderTraverse(node.getLeftChild());
	      System.out.print(node.getData()+ "  ");
	      inorderTraverse(node.getRightChild());
	   } // end if
	} // 
	
	//preorderTraverse method
		public static void preorderTraverse(BinaryNode node)
		{
		   if (node != null)
		   {
		      System.out.print(node.getData()+ "  ");
		      preorderTraverse(node.getLeftChild());
		      preorderTraverse(node.getRightChild());
		   } // end if
		} // 
		
		//postorderTraverse method
				public static void postorderTraverse(BinaryNode node)
				{
				   if (node != null)
				   {
					   postorderTraverse(node.getLeftChild());
					   postorderTraverse(node.getRightChild());
				      System.out.print(node.getData()+ "  ");
				   } // end if
				} // 
	
}  // end DriverBT

