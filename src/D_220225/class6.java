package D_220225;

public class class6
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3};
		int[] newArr = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) 
		{
			newArr[i] = arr[i];
		}
		newArr[newArr.length-1] = 4;
	}
}