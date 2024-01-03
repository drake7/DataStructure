package designPattern;

public class MainTester {


    public static void main(String[] args) {
        //design pattern for Singleton Pattern
    	SingletonDesignPattern singletonInstance = SingletonDesignPattern.getSingletonInstance();

        // Use the singleton instance
        singletonInstance.doSomething();
    }
}
