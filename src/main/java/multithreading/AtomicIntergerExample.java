package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntergerExample {
	private static AtomicInteger count = new AtomicInteger(0);

	public static void main(String[] args) 
	{
	//	ExecutorService es = Executors.newSingleThreadExecutor(); // in order, because sequential
		ExecutorService es = Executors.newFixedThreadPool(5); //not in order,because not sure which Thread will access it first
		for(int i = 1;i<=10;i++)
		{
			es.submit(()->System.out.print(count.incrementAndGet()+","));
		}
		es.shutdown();
	}
	private static void addToCounter() {
		// TODO Auto-generated method stub

	}

}
