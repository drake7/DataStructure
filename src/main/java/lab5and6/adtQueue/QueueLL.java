package lab5and6.adtQueue;

public class QueueLL<T> implements QueueInterface<T>{

	//create nodes
	private Node firstNode;
	private Node lastNode;
	
	
	public QueueLL()
	{
		this.firstNode=this.lastNode=null;
	}
	
	private class Node{
		
		T data;
		Node next;
		public Node(T data)
		{
			
			this.data=data;
			this.next=null;
			
		}
		
	}
	@Override
	public void enqueue(T newEntry) {
		// TODO Auto-generated method stub
		//new element will be added to the last node of the queue
		Node newNode=new Node(newEntry);
		
		//we will check if we have anything at the end,if not then we know its empty so 
		if(this.lastNode == null)
		{
			//if one node only it means that node is first and last node
			this.firstNode = this.lastNode = newNode;
			return;
		}
		
		//else we point lastnode'address to the new node and we will say that new node is the lastnode
		this.lastNode.next=newNode;//nextElement is the newNode
		this.lastNode=newNode;//lastNode is entered at end
		
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getFront() throws Exception {
		// TODO Auto-generated method stub
		
		   if (isEmpty())
		   {
			   System.out.println("queue is empty");
			      throw new Exception();
		   }   else
			      return firstNode.data;

		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		
	}
	
	
	public static void main(String[] args) throws Exception {
	
		QueueLL<String> newQueue = new QueueLL<>();
		newQueue.enqueue("deepak");
		newQueue.enqueue("deepak1");
		newQueue.enqueue("deepak2");
		newQueue.enqueue("deepak3");
		System.out.println(newQueue.getFront());
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
