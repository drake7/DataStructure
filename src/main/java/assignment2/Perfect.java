package assignment2;

import java.util.Scanner;

public class Perfect {

	public static void main(String... s) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;

		System.out.println("Please enter your number to check:");
		int number = sc.nextInt();

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		if (sum == number)
			System.out.println(number + " is a Perfect number.");
		else
			System.out.println(number + " is not a Perfect number.");

	}

}
