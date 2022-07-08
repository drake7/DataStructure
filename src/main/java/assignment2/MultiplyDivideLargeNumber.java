package assignment2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class MultiplyDivideLargeNumber {
	static String multiply(String num1, String num2) {
		int lengthNumber1 = num1.length();
		int lengthNumber2 = num2.length();
		// if there is no string
		if (lengthNumber1 == 0 || lengthNumber2 == 0)
			return "0";

		// create a new array for the result which will have the size of both number's
		// length
		int result[] = new int[lengthNumber1 + lengthNumber2];
		
		//indexes for the number
		int indexNumber1 = 0;
		int indexNumber2 = 0;

		// will start multiplying from the left end by extracting digit by digit
		for (int i = lengthNumber1 - 1; i >= 0; i--) {
			int number1 = num1.charAt(i) - '0';
			// to carry the value
			int carry = 0;
			indexNumber2 = 0;
			for (int j = lengthNumber2 - 1; j >= 0; j--) {
				int number2 = num2.charAt(j) - '0';
				int sum = number1 * number2 + result[indexNumber1 + indexNumber2] + carry;
				carry = sum / 10;
				result[indexNumber1 + indexNumber2] = sum % 10;
				indexNumber2++;
			}
			if (carry > 0)
				result[indexNumber1 + indexNumber2] += carry;
			indexNumber1++;
		}

		int i = result.length - 1;
		while (i >= 0 && result[i] == 0)
			i--;

		if (i == -1)
			return "0";

		String s = "";

		while (i >= 0)
			s += (result[i--]);

		return s;
	}

	static String Divison(String input1,String input2)
	{
		BigDecimal first    =new BigDecimal(input1);
		BigDecimal second   =new BigDecimal(input2);
		BigDecimal div		=first.divide(second,20,RoundingMode.CEILING);
		
		return div.toString();
		
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your choice:");
		System.out.println("Press 1 for Multiplication and 2 for Divide:");
		int n = sc.nextInt();

		while (n != 1 || n != 2)

		{
			if (n == 1) 
				{
				sc.nextLine();
				System.out.println("Please enter number 1:");
				String input1 = sc.nextLine();
				System.out.println("Please enter number 2:");
				String input2 = sc.nextLine();

				// to handle negarive scenarios
				if ((input1.charAt(0) == '-' || input2.charAt(0) == '-') && (input1.charAt(0) != '-' || input2.charAt(0) != '-'))
					System.out.print("-");

				// start multiply from the next character
				if (input1.charAt(0) == '-')
					input1 = input1.substring(1);

				// start multiply from the next character
				if (input2.charAt(0) == '-')
					input2 = input2.substring(1);

				System.out.println(multiply(input1, input2));
				break;

			} else if (n == 2) {
				sc.nextLine();
				System.out.println("Please enter number 1:");
				String input1 = sc.nextLine();
				System.out.println("Please enter number 2:");
				String input2 = sc.nextLine();
				System.out.println(Divison(input1,input2));
				break;
			} else {
				System.out.println("Please enter a valid choice");
				n = sc.nextInt();
			}
		}
	}
}
