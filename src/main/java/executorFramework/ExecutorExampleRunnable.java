package executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExampleRunnable {
	public static void main(String[] args) {
		ExecutorService es = Executors.newSingleThreadExecutor();
		es.execute(()-> System.out.println("Runnable example"));
		es.shutdown();
	
	}

}
