package heaps;

public class MinHeap<T extends Comparable<T>> {
	T[] heap;
	int length;
	int maxSize;

	// Time O(1) Space O(1)
	@SuppressWarnings("unchecked")
	public MinHeap(int capacity) {
		maxSize = capacity;
		heap = (T[]) new Comparable[capacity];
		length = 0; // means queue is empty
	}

	// Insert a new value, Time O(h), Space O(1), n is number of items in heap
	// h is height of heap (complete binary tree) h = log(n)
	public void insert(T value) {
		if (length == maxSize) {
			System.out.println("heap is full, cannot insert " + value);
			return;
		}
		heap[length] = value;
		heapUp(length++);
	}

	// Time O(h), Space O(1)
	private void heapUp(int pos) {
		int parentPos = (pos - 1) / 2;
		T value = heap[pos];
		while (pos > 0 && (value.compareTo(heap[parentPos]) < 0)) {
			heap[pos] = heap[parentPos];
			pos = parentPos;
			parentPos = (parentPos - 1) / 2;
		}
		heap[pos] = value;
	}

	// Remove from min (first one), Time O(h), Space O(1)
	public T remove() {
		if (length == 0) {
			System.out.println("heap is empty");
			return null;
		}
		T min = heap[0];
		heap[0] = heap[length - 1]; // last put first
		length--;
		heapDown(0);
		return min;
	}

	// Time O(h), space O(1)
	private void heapDown(int pos) {
	T item = heap[pos];
	int index;
	while (pos < length/2) {
	int left = 2*pos + 1;
	int right = 2*pos + 2;
	if (right < length && heap[left].compareTo(heap[right]) > 0)
	index = right;
	else
	index = left;
	if (item.compareTo(heap[index]) <= 0)
	break;
	heap[pos] = heap[index];
	pos = index;				
	}
	heap[pos] = item;
	}
	
	public void print()
	{
		/*for (T t : heap) {
			System.out.println(t);
		}*/
		

	    for(int i=0;i<length;i++){
	        for(int j=0;j<Math.pow(2,i)&&j+Math.pow(2,i)<10;j++){
	            System.out.print(heap[j+(int)Math.pow(2,i)-1]+" ");

	        }
	        System.out.println();
	    }

	}

	public static void main(String[] args) {
		MinHeap obj=new MinHeap(25);
		
		obj.insert(1);
		obj.insert(5);
		obj.insert(112);
		obj.insert(12);
		obj.insert(11);
		obj.insert(1321);
		obj.print();
		
		
		
	}
}
