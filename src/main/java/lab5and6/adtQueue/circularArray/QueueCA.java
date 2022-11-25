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
		//front is not first index and queue has reached to its last index then will start the entry from the zero index
		else if ((back == DEFAULT_CAPACITY - 1) && front != 0) {
			back=0;
			queueArray[back]=newEntry;
		} 
		else {
			back+=1;
			if(front <= back)
			{
				queueArray[back]= newEntry;
			}
			else
			{
				queueArray[front]=newEntry;
			}
		}
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getFront() throws Exception {
		// TODO Auto-generated method stub

		return (T) queueArray[front];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) throws Exception {
		QueueCA<String> newQueue = new QueueCA<>(5);
		newQueue.enqueue("Deepak kumar");
		System.out.println(newQueue.getFront());
	}

}
