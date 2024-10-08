package multithreading;

public class FixRaceWithSynchronized {

	private static int count = 0;
	private static Object lock = new Object();

	public static void main(String[] args) {
		FixRaceWithSynchronized instance = new FixRaceWithSynchronized();
		for(int i = 1;i<=10;i++)
		{
			//		new Thread (()-> addToCounter()).start();
			new Thread(()->instance.addToCounter3()).start();
		}
	}
	private synchronized static void addToCounter() {
		// TODO Auto-generated method stub
		int c = count;
		try {
			Thread.currentThread().sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Before "+ count +" Thread id" + Thread.currentThread().getId());
		count = c+1;
		System.out.println("After "+ count +" Thread id" + Thread.currentThread().getId());

	}

	private  static void addToCounter1() {
		// TODO Auto-generated method stub
		synchronized(FixRaceWithSynchronized.class) // part of the method
		{
			int c = count;

			try {
				Thread.currentThread().sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Before "+ count +" Thread id" + Thread.currentThread().getId());
			count = c+1;
			System.out.println("After "+ count +" Thread id" + Thread.currentThread().getId());
		}
	}

	// with object lock
	private  static void addToCounter2() {
		// TODO Auto-generated method stub
		synchronized(lock) // part of the method
		{
			int c = count;

			try {
				Thread.currentThread().sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Before "+ count +" Thread id" + Thread.currentThread().getId());
			count = c+1;
			System.out.println("After "+ count +" Thread id" + Thread.currentThread().getId());
		}
	}
	private  void addToCounter3() {
		// TODO Auto-generated method stub
		System.out.println("entered in a method");
		synchronized(this) // part of the method
		{
			int c = count;

			try {
				Thread.currentThread().sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Before "+ count +" Thread id" + Thread.currentThread().getId());
			count = c+1;
			System.out.println("After "+ count +" Thread id" + Thread.currentThread().getId());
		}
	}
}
