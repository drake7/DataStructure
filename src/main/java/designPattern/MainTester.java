package designPattern;

public class MainTester {


    public static void main(String[] args) {
        //design pattern for Singleton Pattern
    	SingletonDesignPattern singletonInstance = SingletonDesignPattern.getSingletonInstance();
    	SingletonDesignPattern singletonInstance1 = SingletonDesignPattern.getSingletonInstance();

        // Use the singleton instance
        singletonInstance.doSomething();
        
        //even though two object still we have only one hashcode
        System.out.println(singletonInstance.hashCode());
        System.out.println(singletonInstance1.hashCode());
    }
}
