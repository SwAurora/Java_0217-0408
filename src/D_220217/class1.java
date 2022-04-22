package D_220217;

public class class1
{

	public static void main(String[] args) 
	{
		long lightspeed;
		long distance;
		
		lightspeed = 300_000;
		distance = lightspeed * 365L * 24 * 60 * 60;
		System.out.println("빛이 1년동안 가는 거리: " + distance + "km");
	}

}
