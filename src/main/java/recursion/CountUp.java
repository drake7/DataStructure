package recursion;

public class CountUp {
public static void main(String[] args) {
	count(10);
	count(10,1);
}


public static void count(int n)
{
	if(n==1)
	{
	System.out.println(n);
	return;
	}
	//call the method before print and in the LIFO 1 will be on top
	count(n-1);
	System.out.println(n);

}

public static void count(int n,int  x)
{
	if(x==n)
	{
	System.out.println(n);
	return;
	}
	//call the method before print and in the LIFO 1 will be on top
	else
	{
	System.out.println(n);
	count(n,x+1);
	}
}
}
