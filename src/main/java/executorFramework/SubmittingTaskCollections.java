package executorFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SubmittingTaskCollections {

	//private static ExecutorService es = Executors.newSingleThreadExecutor();
	private static ExecutorService es = Executors.newFixedThreadPool(4);
	private static List<Callable<String>> callables = new ArrayList<>();
	
	public static void main(String[] args) {
		
		
		callables.add(()->"A");
		callables.add(()->"B");
		callables.add(()->"C");
		callables.add(()->"D");
		
		invokeAll();
	
		
	}

	private static void invokeAll() {
		// TODO Auto-generated method stub
		
		try {
			List<Future<String>> list = es.invokeAll(callables);
			for(Future<String> future:list)
			{
				System.out.println(future.get());
			}
		
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			es.shutdown();
		}
		
	}

	private static void invokeAny() {
		// TODO Auto-generated method stub
		//submitting a collection of tasks
		//executres synchronously and returns when on of the task has complleted all other tasks are cancelled
		// Single Thread executor will always execute the first task submitted.
		
		try {
			String result = es.invokeAny(callables);
			System.out.println(result);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
		es.shutdown();
		}
	}
}
