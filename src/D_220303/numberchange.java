package D_220303;

public class numberchange
{
	public static void main(String[]args)
	{
		String[] strings = {"one4seveneight", "1zerotwozero3", "onezero456sixnine", "1564841", "zero123"};// 1478 10203 1045669 1564841

		for (int i = 0; i < strings.length; i++) 
		{
			strings[i] = strings[i].replace("zero", "0")
								   .replace("one", "1")
								   .replace("two", "2")
								   .replace("six", "6")
								   .replace("seven", "7")
								   .replace("eight", "8")
								   .replace("nine", "9");
			System.out.println(Integer.valueOf(strings[i]));
		}
	}
}