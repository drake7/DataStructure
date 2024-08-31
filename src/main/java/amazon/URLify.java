package amazon;

public class URLify {

	public static void main(String[] args) {
		String s = "new times   ";
	
		
		
	}
	
	public static String turnToURL(String s)
	{
		char[] c = s.toCharArray();
		
		for(int i = 0;i<s.length();i++)
		{
			//first point is how to identify
			if(c[i]==' ')
			{
				
				//this is for adding into the part now main point is how to rotate array by three
				c[i] = '%';
				c[i+1] = '2';
				c[i+2] = '0';
				
				
			}
		}
		
		return "";
	}
}
