
public class PiCalc 
{
	
	final static double NUM_OF_TIMES = 10000000;
	final static double CIRCLE_RADIUS = 1;
	final static double SQUARE_SIDE_LENGTH = 2;

	public static void main(String[] args) 
	{
		int hitCount = 0;
		int misCount = 0;
		double x;
		double y;
		double distance;
		
			for(int i = 1; i <= NUM_OF_TIMES; i++)
			{
				x = (Math.random()*2 - 1);
				y = (Math.random()*2 - 1);
				distance = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
				
				if (distance <= CIRCLE_RADIUS)
				{
					hitCount++;
				} else {
					misCount++;
				}
				//System.out.println("HitCount: " + hitCount + " MisCount: " + misCount);
				
			}
			
			double PI = (4 * hitCount) / NUM_OF_TIMES;
			System.out.println("Pi is equal to " + PI);
			System.out.println("Real Pi is 3.14159265359 ");
	}
}
