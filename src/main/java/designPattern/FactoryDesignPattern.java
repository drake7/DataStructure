package designPattern;


interface Pizza{
	
	void prepare();
	void bake();
	void box();
	
}

class CheesePizza implements Pizza{

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("prepare cheese pizza");
		
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("bake cheese pizza");
		
	}

	@Override
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("box cheese pizza");
	}
	
}

class PepperonniPizza implements Pizza{

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("prepare pepperoni pizza");
		
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("bake pepperoni pizza");
		
	}

	@Override
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("box pepperoni pizza");
	}
	
}

class PizzaFactory{
	
	public Pizza createPizza(String type)
	{
		if(type.equals("cheese"))
			return new CheesePizza();
		
		if(type.equals("pepperonni"))
			return new PepperonniPizza();
		
		else
			throw new IllegalArgumentException("Wrong pizza type");
		
		
	}
}

public class FactoryDesignPattern {

	public static void main(String[] args) {
		PizzaFactory pizzaFactory = new PizzaFactory();
		Pizza cheesePizza = pizzaFactory.createPizza("cheese");
		cheesePizza.prepare();
		cheesePizza.bake();
		cheesePizza.box();
		Pizza pepperoniPizza = pizzaFactory.createPizza("pepperonni");
		pepperoniPizza.prepare();
		pepperoniPizza.bake();
		pepperoniPizza.box();
		
		
		
	}
}
