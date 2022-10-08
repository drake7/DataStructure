package practice;

public class ShellSort {

	public static void main(String[] args) {

		int[] a = { 12, 23, 1, 42, 1 };

		sortingByShell(a);
		for (int i : a) {
			System.out.println(i);
		}

	}

	public static void sortingByShell(int[] a) {
//int div=a.length;

		//division of div by 2 ,n/2,n/4 and so on
		for (int div = a.length / 2; div > 0; div /= 2) {
			for(int i=div;i<a.length;i++)
			{
				int temp=a[i];
				int j;
				for(j=i;j>=div && a[j-div]>temp;j=j-div)
				{
					a[j]=a[j-div];
				}
				a[j]=temp;
				}
		}

	}
}
