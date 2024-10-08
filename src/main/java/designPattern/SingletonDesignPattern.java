package designPattern;

public class SingletonDesignPattern {
	
	// only one instance, that is accessible but has to be thread safe as well.
	
	//why volatile to ensure the visibility of the variable to all threads,
	//by writing and reading from main memory not cpu register
	private static volatile SingletonDesignPattern instance;
	
	
	private SingletonDesignPattern()
	{
		
	}
	
	public static SingletonDesignPattern getSingletonInstance() {
		
		if(instance == null) //first check without synch keyword so no locking
		{
			synchronized(SingletonDesignPattern.class)
			{
				
				if(instance == null) // second check with synchronized key word(double locking)
				{
					instance = new SingletonDesignPattern();
				}
			}
		}
		
		
		return instance;
	}
	
	 public void doSomething() {
	        System.out.println("Singleton instance is doing something.");
	    }
}
