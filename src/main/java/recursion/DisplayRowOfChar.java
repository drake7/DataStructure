package recursion;

public class DisplayRowOfChar {

	public static void main(String[] args) {
		
		displayCharacter('*', 5);
	}

	
	
	public static void displayCharacter(char displayCharacter,int count)
	{
		
		//base condition to check
		if (count<=1)
		{
			System.out.print(displayCharacter);
			return;
		}
		
		//decrease the number by one
		displayCharacter(displayCharacter, count-1);
		System.out.print(displayCharacter);
	}
}
