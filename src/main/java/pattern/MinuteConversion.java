package pattern;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MinuteConversion {
	private static final DecimalFormat df = new DecimalFormat("0.00");
public static void main(String...s)
{

	Scanner sc=new Scanner(System.in);
	System.out.print("Please Enter number of minutes:");
	int minutes=sc.nextInt();
	
	Double Hours=(minutes/60.00);
	System.out.println("For "+ minutes+" total number of hours are:"+df.format(Hours));
	
	double Days=(Hours/24.00);
	
	System.out.println("For "+minutes+" total number of days are:"+df.format(Days));
	
	
	
}
}
