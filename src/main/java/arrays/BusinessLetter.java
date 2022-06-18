package arrays;

import javax.swing.JOptionPane;

public class BusinessLetter {

	public static void main(String...s)
	{
		String name;
		String firstName="";
		String lastName="";
		
		
		// 
		name=JOptionPane.showInputDialog(null,"Please input a customer's name");
		
		int[] nums= {1,5,2,8,7};
		
		for(int i=0;i<name.length();i++)
		{
			
			
			if(name.charAt(i)==' ')
			{
				firstName=name.substring(0,i);
				lastName=name.substring(i+1);
				break;
			}
		}
		JOptionPane.showMessageDialog(null, "Dear"+firstName+" " +lastName+" welcome to class.");
		
		
	}
	
}
