package multithreading;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println( "run" + getName());
		super.run();
	}
	
	public static void main(String[] args) {
		MyThread m1 = new MyThread();
		new MyThread().start();
		m1.start();
		
		
		System.out.println("main () "+ Thread.currentThread().getName());
		// if i try to start it again because it is already in execution state it will fail.
		//m1.start();
	}
}
