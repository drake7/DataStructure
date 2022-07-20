package circularSingleLinkedList;

public class CircularLinkedList {

	private static Node head=null;
	private static Node tail=null;
	
	public static void main(String...s)
	{
		CircularLinkedList cl=new CircularLinkedList();
		TraverseCircularLinkedList tcll=new TraverseCircularLinkedList();
		SearchCircularLinkedList scll=new SearchCircularLinkedList();
		cl.addNode(19);
		cl.addNode(21);
		cl.addNode(29);
		//print the cl list using its head
		//printCSLL(cl.head);
		//traversing the circular linkedlist
		tcll.traverse(cl.head);
		//searching the circular linked list has the node
		scll.search(cl.head, 29);
		
	
	}
	public static void printCSLL(Node head){

		Node temp=head;
		//check if head is empty
		if(head!=null) {
			//if not then print the head
			do {
				System.out.print(temp.data +" ");
				temp=temp.next;
				
			}
			while(temp!=head);
			}
	}
	
	
	public static void addNode(int value)
	{
		
		
		Node  newNode=new Node(value);
		
		
		//check if list is empty,head was null so inserted element at the start
		if(head==null)
		{
			head=newNode;
		}
		else
		{
		//else insert element in the last 
			tail.next=newNode;
			
		}
		//tail is our new node
		tail=newNode;
		
		//new node is pointing to the head now
		newNode.next=head;
		
	}
}
