package dice;

public class TwoDice {

	
	public static void main(String...s)
	{
		
		Dice dice1=new Dice();
		Dice dice2=new Dice();
		
		
		int[] firstDice=new int[3];
		int[] secondDice=new int[3];
		
		int selectedNumber=5;
		
		
		for(int i=0;i<firstDice.length;i++)
		{
			firstDice[i]=dice1.RandomDice();
			secondDice[i]=dice2.RandomDice();
			
		if((firstDice[i]+secondDice[i])==selectedNumber)
		{
			System.out.println("User win  in "+(i+1)+" attempt:First Dice:"+firstDice[i]+" and Second Dice:"+secondDice[i]);
			break;
		}
		else
		{
			System.out.println(""+(i+1)+" Iteration: first dice"+firstDice[i]+" and Second Dice:"+secondDice[i]);
			
		}
		}
		
		
	}
}
