package binaryTree;

public class BinaryTree {

	static Node root;
	
	
	class Node{
		int data;
		Node left;
		Node right;
		Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	private Node addRecursive(Node current,int value)
	{
		if(current==null)
		{
			return new Node(value);
		}
		
		if(value<current.data)
		{
			 current.left = addRecursive(current.left, value);
		}
		else if(value>current.data)
		{
			current.right = addRecursive(current.right, value);
		}
		else
		{
			return current;
		}
		return current;
	}
	
	public void add(int value) {
	    root = addRecursive(root, value);
	}
	
	
	public void traverseInOrder(Node node) {
	    if (node != null) {
	        traverseInOrder(node.left);
	        System.out.print(" " + node.data);
	        traverseInOrder(node.right);
	    }
	}
	
	private boolean containsNodeRecursive(Node current, int value) {
	    if (current == null) {
	        return false;
	    } 
	    if (value == current.data) {
	        return true;
	    } 
	    return value < current.data
	      ? containsNodeRecursive(current.left, value)
	      : containsNodeRecursive(current.right, value);
	}
	
	
	private Node deleteRecursive(Node current, int value) {
	    if (current == null) {
	        return null;
	    }

	    if (value == current.data) {
	    	//if empty
	    	if (current.left == null && current.right == null) {
	    	    return null;
	    	}
	    	//if right child is not there
	    	if (current.right == null) {
	    	    return current.left;
	    	}

	    	//if left child is not there
	    	if (current.left == null) {
	    	    return current.right;
	    	}
	    	
	    	
	    } 
	    if (value < current.data) {
	        current.left = deleteRecursive(current.left, value);
	        return current;
	    }
	    current.data= findSmallestValue(current.right);
	    current.right = deleteRecursive(current.right, value);
	    return current;
	}
	
	private int findSmallestValue(Node root) {
	    return root.left == null ? root.data : findSmallestValue(root.left);
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("");
		
		BinaryTree bt=new BinaryTree();
		bt.add(5);
		bt.add(6);
		bt.add(61231);bt.add(3126);
		bt.add(7);
		bt.add(121);
		bt.add(3);
		
		System.out.println(bt.containsNodeRecursive(root,7));
		bt.traverseInOrder(root);
	}
	
}
