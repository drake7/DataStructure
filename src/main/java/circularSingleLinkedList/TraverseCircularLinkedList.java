package circularSingleLinkedList;

public class TraverseCircularLinkedList {
	public void traverse(Node head)
	{
		if(head==null)
			return;
		
		else
		{
			Node temp=head;
			do {
				System.out.println(temp.data);
				temp=temp.next;
			}
			while(head!=temp);
		}
		
		
		
	}

}
