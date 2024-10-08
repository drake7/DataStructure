package multithreading;

public class MyThreadWithLambda {

	
	public static void main(String[] args) {
		
		Thread t = new Thread(
				() -> System.out.println(
						"my thread "+ Thread.currentThread().getName()));
				t.run();
				System.out.println("Main Thread : "+ Thread.currentThread().getName());
		
	}
}
