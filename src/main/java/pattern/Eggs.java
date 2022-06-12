package pattern;

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of eggs you are buying:");
		int eggCount=sc.nextInt();
		
		int div=eggCount/12;
		int remain=eggCount%12;
		double totalCost=(div*3.25)+(remain*0.45);
		System.out.println("You ordered "+eggCount+" eggs. That's "+div+" for $3.25 per dozen"
				+ " and  "+remain+" loose eggs at 45 cents each for a total of $"+totalCost+".");
	
	}

}
