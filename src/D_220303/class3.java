package D_220303;

public class class3
{
	public static void main(String[] args) 
	{
		String s = "This is java Program";
		String result = s.substring(8, 20);
		String result2 = s.toUpperCase();
		String result3 = s.toLowerCase();
		int result4 = s.indexOf("java");
		String result5 = s.replace("java", "python");
		String[] result6 = s.split("is");
		char[] result7 = s.toCharArray();
		String result8 = s.trim();//문자열 앞,뒤 공백제거
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);//없으면 -1로 알려줌
		System.out.println(result5);
		
		for (int i = 0; i < result6.length; i++) 
		{
			System.out.println("result의" + i + "번째: " + result6[i]);
		}
		for (int i = 0; i < result7.length; i++) 
		{
			System.out.println("result의" + i + "번째: " + result7[i]);
		}
		System.out.println(result8);
	}
}
