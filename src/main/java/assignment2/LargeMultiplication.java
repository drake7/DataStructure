package assignment2;

import java.util.Scanner;

public class LargeMultiplication {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter first number:");
		int number1=sc.nextInt();
		System.out.println("Please enter second number:");
		int number2=sc.nextInt();
		
		//find length
		int length1=0,length2=0,lengthNum1=number1,lengthNum2=number2;
		while(lengthNum1!=0 && lengthNum2!=0)
		{
		length1+=1;
		length2+=1;
		lengthNum1=lengthNum1/10;
		lengthNum1=lengthNum1/10;	
		}
		
		System.out.println(length1+":"+lengthNum2);
		int[] multiplicationResult=new int[200];
		
		
		//index for position
		int index1=0;
		int index2=0;
		
		
		
		
		
		
		
		
		
	}

}
