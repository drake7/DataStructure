package dsAssignment1;
//LinkedList Class
public class LinkedList<T> implements ListInterface<T> {

	// starting node
	Node<T> head;
	

	/**
	 * Method to add the Node in the List.
	 * 
	 * @param data
	 * 
	 */
	@Override
	public void add(T data) {

		// 6

		Node<T> temp = new Node<T>(data);
		// list is empty
		if (this.head == null) {
			head = temp;
		} 
		else
		{
			// temp node for traversing the array

			Node<T> travelNode = head;

			//
			while (travelNode.next != null) {
				travelNode = travelNode.next;

			}
			travelNode.next = temp;
		}

	}
	

	/**
	 * Method to add the Node in the List at specific position.
	 * 
	 * @param position,@param data 
	 * 
	 */

	@Override
	public void add(int position, T data) {

		// created temp node
		Node<T> temp = new Node<>(data);

		// list is empty
		if (this.head == null) {
			head = temp;
		} else {
			// temp node for traversing the array
			Node<T> travelNode = head;

			int count = 1;

			while (travelNode.next != null && count != position) {
				travelNode = travelNode.next;
				count++;

			}
			// position where we want to insert
			Node<T> saviour = travelNode.next;

			// temp node is a new node;
			travelNode.next = temp;
			temp.next = saviour;
		}
	}
	
	

	/**
	 * Method to remove the Node from the List.
	 * 
	 * @param position
	 * 
	 */
	@Override
	public void remove(int position) {
		// temp node for traversing the array
		Node<T> travelNode = head;

		int length = getLength();
		if (position > length) {
			System.out.println("Position is greater than length,Please enter valid input.");
			return;
		}
		int count = 1;
		if (position == 0) {

			head = head.next;
			return;
		}

		if (position == getLength()) {
			while (travelNode.next.next != null) {
				System.out.println("inside while");
				travelNode = travelNode.next;
			}
			travelNode.next = null;
		} else {
			while (travelNode.next != null & count != position) {
				travelNode = travelNode.next;
				count += 1;
			}
			travelNode.next = travelNode.next.next;
		}
	}


	/**
	 * Method to clear the List.
	 * 
	 * 
	 * 
	 */
	@Override
	public void clear() {
		/// setting head will make head reference to null and GC will handle the
		/// remaining
		head = null;
	}
	
	

	/**
	 * Method to replace the Node from the List at a given position.
	 * 
	 * @param position, @param data
	 * 
	 */
	@Override
	public void replace(int position, T data) {
		Node<T> travelNode = head;

		if (head == null) {
			System.out.println("List is empty:");
			return;
		}
		if (position > getLength() || position < 0) {
			System.out.println("Position is invalid:");
		}
		int count = 0;

		while (travelNode.next != null) {
			if (count == position) {
				travelNode.data = data;
			}
			travelNode = travelNode.next;

			count++;

		}

	}


	/**
	 * Method to get the specific entry from the List based on the postion.
	 * 
	 * @param position
	 * @return void
	 */
	@Override
	public T getEntry(int position) {

		if (head == null) {
			System.out.println("List is empty:");
			return null;
		}
		int counter = 0;
		Node<T> traverseNode = head;
		while (counter != position && traverseNode.next != null) {
			counter = counter + 1;
			traverseNode = traverseNode.next;
		}

		return traverseNode.data;

	}


	/**
	 * Method to convert the list to the array.
	 * 
	 * 
	 * @return Node[]
	 */
	@Override
	public Node[] toArray() {

		int length=getLength();
		Node[]  newArr=new Node[length+1];
		
		Node<T>travelNode=head;
		int counter=0;
		
		while (travelNode != null) {
			newArr[counter]=travelNode;
			travelNode=travelNode.next;
			counter+=1;
			}
		return newArr;
	}


	/**
	 * Method to check if list contains the entry.
	 * 
	 * @param entry
	 * @return boolean
	 */
	@Override
	public boolean contains(T entry) {

		if (head == null) {
			System.out.println("List is empty:");
			return false;
		}
		Node<T> traversalNode = head;

		int counter = 0;
		while (traversalNode != null) {
			if (traversalNode.data.equals(entry)) {
				System.out.println("Entry Exist at index:" + counter);
				return true;
			}
			counter += 1;
			traversalNode = traversalNode.next;

		}

		return false;

	}


	/**
	 * Method to get the length of the List.
	 * 
	 * 
	 * @return int
	 */
	@Override
	public int getLength() {
		if (head == null) {
			System.out.println("List is empty:");
			return 0;
		}

		int counter = 0;
		Node<T> traversalNode = head;
		while (traversalNode.next != null) {
			counter++;
			traversalNode = traversalNode.next;

		}

		return counter;
	}


	/**
	 * Method to check if the List is empty.
	 * 
	 * 
	 * @return boolean
	 */
	@Override
	public boolean isEmpty() {

		if (head == null) {
			return true;
		}
		return false;
	}


	/**
	 * Method to display the list content.
	 * 
	 * 
	 * 
	 */
	@Override
	public void printList() {

		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node<T> traversalNode = head;
		while (traversalNode != null) {
			System.out.println(traversalNode.data);
			traversalNode = traversalNode.next;
		}

	}

}
