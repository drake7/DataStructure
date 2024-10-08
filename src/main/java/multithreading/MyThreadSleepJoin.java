package multithreading;

public class MyThreadSleepJoin implements Runnable{
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());

		Thread timer = new Thread(new MyThreadSleepJoin());
		timer.start();

		try {
			timer.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Boom");
	}
	@Override
	public void run() {
		for (int i = 9; i > 0; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("" + i);
		}
	}
}
