package deque;

public class DequeArrayMain<T> {

	public static void main(String[] args) {
		DequeArrays mld = new DequeArrays(5);

		mld.addToFront(1);
		mld.addToFront(2);
		mld.addToFront(3);
		mld.addToBack(4);

		System.out.println(mld.getFront());
		System.out.println(mld.getBack());
		
	}

}
