package assignment2;

import java.util.Scanner;

public class LeapYear {
public static void main(String...s)
{
	
Scanner sc=new Scanner(System.in);
System.out.println("Please enter a year:");
int year=sc.nextInt();

if((year%4==0) && (year%100!=0))
{
System.out.println(year+ " is a leap year");	
}
else
{
System.out.println(year+ " is not a leap year");	
}
}
}
