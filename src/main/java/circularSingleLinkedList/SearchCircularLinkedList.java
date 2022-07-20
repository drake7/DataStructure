package circularSingleLinkedList;

public class SearchCircularLinkedList {

	public void search(Node head,int data)
	{
		if(head==null)
			return;
		
		else
		{
			Node temp=head;
			int counter=0;
			do {
				if(temp.data==data)
				{
					System.out.println(temp.toString() +" node on index "+counter+"  has the data.");
				return;
				}
				
				temp=temp.next;
				counter+=1;
			}
			while(head!=temp);
			
			System.out.println("Node with value " +data+"does not exist.");
				
			
		}
		
		
		
		
		
	}
}
