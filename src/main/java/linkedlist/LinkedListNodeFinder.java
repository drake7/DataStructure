package linkedlist;

public class LinkedListNodeFinder
{
static Node head;
class Node
{
Node next;
int data;
public Node(int data)
{
	this.data=data;
	this.next=null;
	
}


}

public void push(int new_data)
{
	 Node new_Node = new Node(new_data); 
	  
     /* 2. Make next of new Node as head */
     new_Node.next = head; 

     /* 3. Move the head to point to new Node */
     head = new_Node; 
}
public static int getNode(int index)
{
	Node current = head; 
	//variable to keep track of index
    int count = 0; /* index of Node we are 
                      currently looking at */
    while (current != null) 
    { 
        if (count == index) 
            return current.data; 
        count++; 
        current = current.next; 
    } 

	return 0;
}
public static void main(String...s)
{
    LinkedListNodeFinder llist = new LinkedListNodeFinder(); 

    llist.push(1); 
    llist.push(4); 
    llist.push(1); 
    llist.push(12); 
	
    System.out.println(getNode(2));

}
}
