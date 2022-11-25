package lab5and6.adtQueue.circularArray;

public class QueueCA<T> implements QueueInterface<T> {

	private int DEFAULT_CAPACITY;
	private int front;
	private int back;
	Object[] queueArray;

	// we will provide the default capacity in the constructor
	public QueueCA(int size) {
		this.DEFAULT_CAPACITY = size;
		this.front = this.back = -1;
		this.queueArray = new Object[DEFAULT_CAPACITY];
	}

	@Override
	public void enqueue(T newEntry) {
		// if front=0 index and back is last index->Queue is full
		if ((front == 0 && (back == DEFAULT_CAPACITY - 1))
				// eg back 2,front 3 no space in between then 3-1=2,5-1=4 which means 2%4=2
				// which is back index so no space
				|| (back == ((front - 1) % (DEFAULT_CAPACITY - 1)))) {
			System.out.println("Queue is full");
		}
		// queue is empty right now
		else if (front == -1) {
			front = 0;
			back = 0;
			queueArray[front] = newEntry;
		}
		// front is not first index and queue has reached to its last index then will
		// start the entry from the zero index
		else if ((back == DEFAULT_CAPACITY - 1) && front != 0) {
			back = 0;
			queueArray[back] = newEntry;
		} else {
			back += 1;
			// means normal conditions are in order
			if (front <= back) {
				queueArray[back] = newEntry;
			}
			// else update old value
			else {
				queueArray[back] = newEntry;
			}
		}
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub

		if (front == -1) {
			System.out.println("Queue is empty");
		}

		Object data = queueArray[front];
		// if front == back which means only one element
		if (front == back) {
			front = back = -1;
		}
		else if (front == DEFAULT_CAPACITY-1)
		{
			front=0;
		}
		else {
			front =front+1;
		}
		return (T) data;
	}

	@Override
	public T getFront() throws Exception {
		// TODO Auto-generated method stub
		if(front == -1)
			{System.out.println("Queue is empty");
			return null;
			}
		
		return (T) queueArray[front];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(front == -1 && back==-1)
		{
			return true;
		}
		return false;
	}

	@Override
	public void clear() {
		front=-1;
		back=-1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		  // Condition for empty queue.
	    if(front == -1)
	    {
	        System.out.print("Queue is Empty");
	        return;
	    }
	  
	    // If rear has not crossed the max size
	    // or queue rear is still greater then
	    // front.
	    System.out.print("Elements in the " +
	                     "circular queue are: ");
	  
	    if(back >= front)
	    {
	      
	        // Loop to print elements from
	        // front to rear.
	        for(int i = front; i <= back; i++)
	        {
	            System.out.print(queueArray[i]);
	            System.out.print(" ");
	        }
	        System.out.println();
	    }
	  
	    // If rear crossed the max index and
	    // indexing has started in loop
	    else
	    {
	          
	        // Loop for printing elements from
	        // front to max size or last index
	        for(int i = front; i < DEFAULT_CAPACITY; i++)
	        {
	            System.out.print(queueArray[i]);
	            System.out.print(" ");
	        }
	  
	        // Loop for printing elements from
	        // 0th index till rear position
	        for(int i = 0; i <= back; i++)
	        {
	            System.out.print(queueArray[i]);
	            System.out.print(" ");
	        }
	        System.out.println();
	    }

	}

	public static void main(String[] args) throws Exception {
		QueueCA<String> newQueue = new QueueCA<>(5);
		System.out.println("QueueEmpty:"+newQueue.isEmpty());
		newQueue.enqueue("Deepak kumar");
		newQueue.enqueue("Deepak kumar1");
		newQueue.enqueue("Deepak kumar2");
		newQueue.enqueue("Deepak kumar3");
		newQueue.enqueue("Deepak kumar4");
		newQueue.print();
		newQueue.dequeue();
		newQueue.dequeue();
		newQueue.print();
		System.out.println("QueueEmpty:"+newQueue.isEmpty());
		newQueue.enqueue("Deepak kumar5");
		newQueue.enqueue("Deepak kumar6");
		newQueue.print();
		newQueue.clear();

		System.out.println("QueueEmpty:"+newQueue.isEmpty());
		System.out.println(newQueue.getFront());
	}

}
