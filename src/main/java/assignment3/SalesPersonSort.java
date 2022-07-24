
package assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SalesPersonSort {

	public static void main(String...s)
	{		
		System.out.println("Please provide the input for Id and Annual Sales Amount:");
		Scanner sc=new Scanner(System.in);
		ArrayList<SalesPerson> salesPersonList=new ArrayList<SalesPerson>();
		for(int i=0;i<3;i++)
		{
			System.out.println("Please enter an input for Id:");
			int id=sc.nextInt();
			System.out.println("Please enter an input for Annual Sales Amount:");
			double salesAmount=sc.nextDouble();
		
			salesPersonList.add(new SalesPerson(id,salesAmount));
		}
		
		System.out.println("Please Choose an option to sort: 1 for ID and 2 for Annual Sales Amount");
		int chose=sc.nextInt();
		
		if(chose==1)
		{
			 Collections.sort(salesPersonList);
			 for(SalesPerson salesPer:salesPersonList)
				{
					
					System.out.println(salesPer.toString());
				}
		}
		else if(chose==2)
		{
			SalesPersonSalary salesPersonSalaryCompare = new SalesPersonSalary();
	        Collections.sort(salesPersonList, salesPersonSalaryCompare);
	        for(SalesPerson salesPer:salesPersonList)
			{
				System.out.println(salesPer.toString());
			}
		}
		else
		{
		System.out.println("invalid option.");
		}
		
		
		
	}
	static class SalesPersonSalary implements Comparator<SalesPerson>
	{
	    public int compare(SalesPerson s1, SalesPerson s2)
	    {
	        if (s1.getAnnualSalesAmount() < s2.getAnnualSalesAmount()) return -1;
	        if (s1.getAnnualSalesAmount() > s2.getAnnualSalesAmount()) return 1;
	        else return 0;
	    }
	}
}
