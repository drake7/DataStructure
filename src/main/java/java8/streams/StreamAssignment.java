package java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamAssignment {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		
		double avg = nums.stream() //convert to stream
				.mapToInt(Integer::intValue) //integer to int
				.average().orElse(0.0);
		
		
		System.out.println(avg);
		 List<Item> itemList = new ArrayList<>();
	        itemList.add(new Item(1, "Screw"));
	        itemList.add(new Item(2, "Nail"));
	        itemList.add(new Item(3, "Bolt"));

	        // Sorting the list by name using Streams
	        List<Item> sortedList = itemList.stream()
	                .sorted((item1, item2) -> item1.getName().compareTo(item2.getName()))
	                .collect(Collectors.toList()); // Collect the sorted stream into a list

	        // Printing the sorted list of items
	        sortedList.forEach(item -> System.out.println("ID: " + item.getId() + ", Name: " + item.getName()));
	}
}
