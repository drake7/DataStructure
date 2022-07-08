package abstraction;

public class TestAnimal {

	public static void main(String...s)
	{
		
		Animal cow=new Cow();
		Cow cow1=new Cow();
		
		Animal[] animals=new Animal[3];
		
		
		animals[0]=new Cow();

		animals[1]=new Cow();
		animals[2]=new Cow();
		cow.Speak();
		cow1.Speak();
	}
}
