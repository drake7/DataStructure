package stringQue;

public class UniqueCharacter 
{
	public static void main(String...s)
	{
		String input="abcdefghijklmnopqrstuvwxyz";	

		System.out.println(isUnique(input));
	}
	public static boolean isUnique(String input)
	{
		//if length is greater than 128 character ,then it means character is already repeated.
		if(input.length()>128)
			return false;

		//boolean array for checking the  character uniqueness
		boolean[] strArray=new boolean[128];


		for(int i=0;i<input.length();i++)
		{
			int val=input.charAt(i);

			if(strArray[val])
			{
				return false;	
			}
			strArray[val]=true;
		}

		return true;
	}
}
