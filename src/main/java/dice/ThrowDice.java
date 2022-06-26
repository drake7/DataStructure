package dice;

import java.util.Arrays;

import com.sun.tools.javac.code.Attribute.Array;

public class ThrowDice {

	
	public static void main(String...s)
	{
		int[] userValues=new int[5];
		int[] computerValues=new int[5];
		Dice dice1=new Dice();
		Dice dice2=new Dice();
	
		for(int i=0;i<userValues.length;i++)
		{
			
			userValues[i]=dice1.RandomDice();
			computerValues[i]=dice2.RandomDice();
			
		}
		for(int i=0;i<userValues.length;i++)
		{
			System.out.println(userValues[i]+":"+computerValues[i]);
		}
		
		System.out.println(":::::::::::::::::::::::");
		Arrays.sort(userValues);
		Arrays.sort(computerValues);
		for(int i=0;i<userValues.length;i++)
		{
			System.out.println(userValues[i]+":"+computerValues[i]);
		}
		
		System.out.println("**************************");
		
	}
}
