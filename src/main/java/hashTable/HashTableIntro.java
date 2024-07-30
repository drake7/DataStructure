package hashTable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HashTableIntro 
{
	public static void main(String...s)
	{
		//hashtable class 
		//simmilar to hashmap but synchronized
		//need to use hashcode and equeals method to get the key/pair

		/*
		 * Constructors:
	Hashtable(): This is the default constructor.
	Hashtable(int size): This creates a hash table that has initial size specified by size.
	Hashtable(int size, float fillRatio): This version creates a hash table that has initial size specified 
	                                      by size and fill ratio specified by fillRatio. 
	                                      fill ratio: Basically it determines how full hash table
	                                      can be before it is resized upward.and its Value lie between 0.0 to 1.0
	Hashtable(Map m): This creates a hash table that is initialised with the elements in m.
		 */
		// creating a hash table 
		Hashtable<Integer, String> h =new Hashtable<Integer, String>(); 
		//using generics to ensure that keys are integer and values are strings
		Hashtable<Integer, String> h1 =new Hashtable<Integer, String>(); 

		h.put(3, "drake"); 
		h.put(2, "is my"); 
		h.put(1, "gaming  and developer Name"); 

		// create a clone or shallow copy of hash table h 
		h1 = (Hashtable<Integer, String>)h.clone(); 

		// checking clone h1 
		System.out.println("values in clone: " + h1); 

		// clear hash table h 
		h.clear(); 

		// checking hash table h 
		System.out.println("after clearing: " + h);

		//************************************************************************//
		System.out.println("*****************************************************");
		// create a table and add some values 
		Map<String, Integer> table = new Hashtable<>(); 
		table.put("Pen", 10); 
		table.put("Book", 500); 
		table.put("Clothes", 400); 
		table.put("Mobile", 5000); 

		// print map details 
		System.out.println("hashTable: "+ table.toString()); 

		// provide value for new key which is absent 
		// using computeIfAbsent method 
		//using arraw function with k
		table.computeIfAbsent("newPen", k -> 600); 
		//    table.computeIfAbsent("Book", k->200);
		table.computeIfAbsent("newBook", k -> 800); 

		// print new mapping 
		System.out.println("new hashTable: "
				+ table);

		//************************************************************************//
		System.out.println("*****************************************************");
		//Contains Method in Java        
		// Checking for the Value 'Geeks' 
		System.out.println("Is the value 'Geeks' present? " + 
				((Hashtable<String, Integer>) table).contains(500)); 
		System.out.println("*****************************************************");
		// check whether a value exists or not 
		if (table.containsKey("newBook")) 
			System.out.println("Key found in table"); 
		System.out.println("*****************************************************");
		// creating a hash table 
		Hashtable<Integer, String> h2 =  
				new Hashtable<Integer, String>(); 

		h.put(3, "drake"); 
		h.put(2, "Shaktiman he "); 
		h.put(1, "GangaDhar Hai"); 

		// create enumeration 
		Enumeration e = h.elements(); 

		System.out.println("display values:"); 

		while (e.hasMoreElements()) { 
			System.out.println(e.nextElement()); 
		} 
	}
}
