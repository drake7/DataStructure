package dsAssignment1;

public class DriverClass {
	
	public static void main(String[] args) {
		
		//address.instance,reference,pointer
		
		LinkedList l=new LinkedList();//there is nothing inside it is empty
		
		
		
		l.add(6);
		l.add(10); 
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println(	l.contains(140));
		
		
		Node[] n=l.toArray();
		for (Node node : n) {
			System.out.println(node.data);
		}
		LinkedList s=new LinkedList();
		
		s.add("haha");
		s.add(7);
		s.add("huhu");
		s.add("hoho");
		s.add("lala");
		
		//s.printList();
		
		
		
		
	//	System.out.println(l.getLength());
	//	l.clear();
	//	l.printList();
		
//		System.out.println(l.getEntry(2));
	//	System.out.println(l.getLength());

	}

}
