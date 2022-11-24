package deque;

public class DequeArrayMain<T> {

	public static void main(String[] args) {
		DequeArrays mld = new DequeArrays(5);

		mld.addToFront(1);
		mld.addToFront(2);
		mld.addToFront(3);
		mld.addToBack(4);

		mld.removeFront();
		mld.removeBack();
		System.out.println(mld.getFront());
		System.out.println(mld.getBack());
		
		
		
		//mld.print();
		/*
		 * mld.addToFront(2); mld.addToFront(3); mld.addToFront(4);
		 * 
		 * System.out.println("*********************************");
		 * System.out.println("After add some values to the front");
		 * mld.printFromFront(); mld.printFromBack();
		 * System.out.println("Currently there is " + mld.getCount() +
		 * " elements in the Deque");
		 * System.out.println("*********************************");
		 * 
		 * mld.addToBack("Douglas"); mld.addToBack("College"); mld.addToBack("student");
		 * 
		 * System.out.println("After add some values to the back");
		 * mld.printFromFront(); mld.printFromBack();
		 * System.out.println("Currently there is " + mld.getCount() +
		 * " elements in the Deque");
		 * System.out.println("*********************************");
		 * 
		 * mld.removeFront(); mld.removeFront();
		 * 
		 * System.out.println("After remove some values from the front");
		 * mld.printFromFront(); mld.printFromBack();
		 * System.out.println("Currently there is " + mld.getCount() +
		 * " elements in the Deque");
		 * System.out.println("*********************************");
		 * 
		 * mld.removeBack(); mld.removeBack();
		 * 
		 * System.out.println("After remove some values from the back");
		 * mld.printFromFront(); mld.printFromBack();
		 * System.out.println("Currently there is " + mld.getCount() +
		 * " elements in the Deque");
		 * System.out.println("*********************************");
		 * 
		 * System.out.println("Front: " + mld.getFront()); System.out.println("Front: "
		 * + mld.getBack()); System.out.println("Currently there is " + mld.getCount() +
		 * " elements in the Deque");
		 * 
		 * mld.clear();
		 * 
		 * System.out.println("*********************************");
		 * System.out.println("After clear method"); mld.printFromFront();
		 * mld.printFromBack(); System.out.println("Currently there is " +
		 * mld.getCount() + " elements in the Deque");
		 * System.out.println("*********************************");
		 * 
		 * System.out.println("If the Deque empty? " + mld.isEmpty());
		 * 
		 * 
		 */
	}

}
