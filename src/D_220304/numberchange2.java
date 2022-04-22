package D_220304;

public class numberchange2
{
	public static void main(String[] args)
	{
		String s = "one4seveneight";

		char[] sChars = s.toCharArray();
		
		String nowString = "";
		String resultString = "";
		
		for (int i = 0; i < sChars.length; i++) 
		{
			if(sChars[i] >= 97 || sChars[i] <= 122)
			{
				nowString += sChars[i];
			}
			System.out.println(sChars[i]);
		} 
	}
}