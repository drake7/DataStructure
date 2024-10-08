package multithreading;

public class DataRaceDemo {


	private static int count = 0;
	public static void main(String[] args) {
		for(int i = 1;i<10;i++)
		{
			new Thread (()-> addToCounter()).start();
		}
	}
	private static void addToCounter() {
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
}
