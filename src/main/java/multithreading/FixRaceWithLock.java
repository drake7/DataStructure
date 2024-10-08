package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FixRaceWithLock {

	private static int count = 0;
	private static Lock lock = new ReentrantLock();

	public static void addToCounter()
	{

		if(lock.tryLock())
		{
			try
			{
				//	lock.lock();
				int c = count;
				System.out.println("Before "+ count);
				count = c+1;
				System.out.println("After "+ count);
			}finally {
				lock.unlock();
			}
		}
		else
		{
			System.out.println("Failed to get lock");
		}


	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Thread(()-> addToCounter()).start();
		}
	}
}
