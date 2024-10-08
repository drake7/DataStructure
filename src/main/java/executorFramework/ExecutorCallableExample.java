package executorFramework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorCallableExample {

	public static void main(String[] args) {
		
	
	ExecutorService es = Executors.newSingleThreadExecutor();
	
	//i need some result
	// 
	Future<Integer> ft = es.submit(()-> 3+5);

	try {
		System.out.println("Answer is "+ft.get(500,TimeUnit.MILLISECONDS));
	} catch (InterruptedException | ExecutionException | TimeoutException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	es.shutdown();
	}
}
