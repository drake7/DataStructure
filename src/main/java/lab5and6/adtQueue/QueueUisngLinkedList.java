package lab5and6.adtQueue;

public class QueueUisngLinkedList {

	static QueueUisngLinkedList queue=new QueueUisngLinkedList();
	static Node frontNode=null;
	static Node lastNode=null;
	class Node {

		Node frontNode;
		Node lastNode;
		int data;

		public Node(int data) {
			this.data = data;
			this.frontNode = null;
			this.lastNode = null;
		}

	}

	
	public static void main(String[] args) {
		queue.push(4);
	}
	
	
	public static void push(int data)
	{
		
	}
	
	public static void prnt()
	{
		Node traverseNode=frontNode;
		
		
		
	}
}
