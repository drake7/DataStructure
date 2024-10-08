package multithreading;

public class MyThreadWithRunnable implements Runnable{

	// Runnable is a functional interface
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run "+ Thread.currentThread().getName());
	}


	public static void main(String[] args) {
		new Thread(new MyThreadWithRunnable()).start();
		System.out.println("main thread "+ Thread.currentThread().getName());
	}

}
