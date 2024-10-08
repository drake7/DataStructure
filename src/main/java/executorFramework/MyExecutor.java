package executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutor{
	public static void main(String[] args) {

		//Cached Thread
		ExecutorService es = Executors.newCachedThreadPool();
		
		
		//Fixed Thread
		int cpuCount = Runtime.getRuntime().availableProcessors();
		System.out.println("CPU count");
		ExecutorService es1 = Executors.newFixedThreadPool(cpuCount);
		
		//Single Thread
		ExecutorService es2 = Executors.newSingleThreadExecutor();

	
	}
	

}
