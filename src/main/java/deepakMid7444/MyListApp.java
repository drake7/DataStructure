package deepakMid7444;

import java.util.Scanner;

public class MyListApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		MyList newList = new MyList(10);

		boolean check = true;
		int n = 5;
		while (check) {
			System.out.println("Please choose one of the below given options");
			System.out.println("1:Add Employee");
			System.out.println("2:Add Employee at particular position");
			System.out.println("3:Remove an Employee at particular position");
			System.out.println("4:Retrive details of all employee");
			System.out.println("5:To Exit The system");
			n = sc.nextInt();
			sc.nextLine();
			switch (n) {
			case 1: {

				System.out.println("Please provide name of an employee");
				String name = sc.nextLine();

				System.out.println("Please provide id of an employee");
				int id = sc.nextInt();
				Employee e3=new Employee(name, id);
				newList.add(e3);
				break;
			}
			case 2: {

				System.out.println("Please provide name of an employee");
				String name = sc.nextLine();

				System.out.println("Please provide id of an employee");
				int id = sc.nextInt();
				
				System.out.println("Please provide position of an employee where you want to store");
				int position = sc.nextInt();
				
				Employee e3=new Employee(name, id);
				newList.add(position,e3);
				break;
			}
			case 3: {
				
				System.out.println("Please provide position of an employee where you want to delete from");
				int position = sc.nextInt();
				
				newList.remove(position);
				break;
			}

			case 4: {
				newList.toArray();
				break;
			}
			case 5: {
				check = false;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + n);
			}
		}

	}
}
