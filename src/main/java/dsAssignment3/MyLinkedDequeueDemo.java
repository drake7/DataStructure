package dsAssignment3;

public class MyLinkedDequeueDemo {

	
	public static void main(String[] args) {
		
		
		MyLinkedDequeue<Integer> myList = new MyLinkedDequeue<Integer>();
		
		myList.addToBack(25);
		myList.addToBack(59);
		myList.addToBack(251);
		myList.addToBack(591);
		myList.addToBack(25212);
		myList.addToBack(59232);
		myList.addToBack(2125);
		myList.addToBack(512359);

		myList.clear();
		System.out.println("mylist is empty:");
		System.out.println(myList.isEmpty());
		
		
		myList.print();
		System.out.println("********************************");

		myList.removeBack();

		System.out.println("********************************");
		myList.print();

		System.out.println("********************************");
		System.out.println(myList.getFront());
		System.out.println("********************************");
		System.out.println(myList.getBack());
	}
}
