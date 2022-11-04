package queue;

import java.util.Scanner;

import deepakMid7444.Employee;

public class QueueUsingArray {
	
	int[] queue=new int[10];
	int firstIndex=0;
	int lastIndex=0;
	
	
	
	public static void main(String[] args) {
		QueueUsingArray q=new QueueUsingArray();
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		int n = 5;
		while (check) {
			System.out.println("Please choose one of the below given options");
			System.out.println("1:enqueue");
			System.out.println("2:dequeue");
			System.out.println("3:print queue");
			System.out.println("5:To Exit The system");
			n = sc.nextInt();
			sc.nextLine();
			switch (n) {
			case 1: {

				System.out.println("Please add number");
				int data=sc.nextInt();
				q.enqueue(data);
				break;
}
			case 2: {

			System.out.println("Removing array");	
			q.dequeue();
			break;
			}
			case 3: {
				q.printData();
				break;
			}
			case 5: {
				check = false;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + n);
			}
		

	}

	}
	
	
	
	public void enqueue(int data)
	{
		queue[lastIndex]=data;
		lastIndex++;
	}
	public void dequeue()
	{
		if (lastIndex >= queue.length) {
			System.out.println("Out of the limits of list");
		}
		for (int i = firstIndex; i < lastIndex; i++) {
			queue[i]=queue[i+1];
			
		}
		lastIndex--;
		
	}
	public void printData()
	{
		for (int i = 0; i < lastIndex; i++) {
		System.out.println(queue[i]);	
		}
	}

}
