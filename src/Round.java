
public class Round
{
	
	public static double roundNum(double x, double d)
	{
		x += (5 * Math.pow(10, -d));
		double divide = Math.pow(10, d);
		double remainder = (int)((x * divide) % divide);
		return x = (int)x + (remainder / divide);
	}
}
