package deepakMid7444;

public class MyList<T> {

	static int size;
	static Employee[] empArray = new Employee[10];
	static int last = 0;

	MyList(int size) {
		this.size = size;
	}

	public static void add(Employee e) {
		// TODO Auto-generated method stub
		empArray[last] = e;
		last++;
	}

	public static void add(int position, Employee e) {
		if(position>last)
		{
			System.out.println("Position is greater then the size list");
			return;
		}
		makeSpace(position);
		empArray[position]=e;
		last++;
	}

	public static void makeSpace(int position)
	{
		//new positon user want to enter
		int newIndex=position;
		
		//where the last element is
		int lastindex=last;
		
		//starting from last index and then traversing back while enhancning the space
		for(int i=lastindex;i>=newIndex;i--)
		{
			//new location to previous
			empArray[i+1]=empArray[i];
		}
		
	}
	public static void remove(int position) {
		// TODO Auto-generated method stub
		if (position >= size) {
			System.out.println("Out of the limits of list");
		}
		for (int i = position; i < last; i++) {
			empArray[i]=empArray[i+1];
			
		}
		last--;
	}

	public static void toArray() {
		for (int i = 0; i < last; i++) {
			System.out.println(empArray[i]);
		}

	}

}
