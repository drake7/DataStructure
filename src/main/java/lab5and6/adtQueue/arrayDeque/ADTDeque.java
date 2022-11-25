package lab5and6.adtQueue.arrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ADTDeque {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<Integer>(10);
		deque.add(1);
		deque.add(2);
		deque.add(3);
		deque.add(4);
		deque.add(5);

		for (Integer i : deque) {
			System.out.print(i);
			System.out.print(" ");
		}
		deque.clear();
		deque.addFirst(1);
		deque.addLast(2);
		System.out.println("");
		for (Integer i : deque) {
			System.out.print(i);
			System.out.print(" ");
		}

		for (Iterator itr = deque.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}

		System.out.println("\nHead element : " + deque.peek());

		System.out.println("Head element poll : " + deque.poll());

		deque.push(265);
		deque.push(984);
		deque.push(2365);

		System.out.println("Head element remove : " + deque.remove());
		System.out.println("The final array is: " + deque);
	}

}
