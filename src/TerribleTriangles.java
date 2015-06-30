import java.util.Scanner;


public class TerribleTriangles {

	public static void main(String[] args) {
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("Enter in cordinates for A: (x1, y1), B: (x2, y2), C: (x3, y3)!");
		System.out.println("x1: ");
		double x1 = input.nextDouble();
		System.out.println("y1: ");
		double y1 = input.nextDouble();
		System.out.println("x2: ");
		double x2 = input.nextDouble();
		System.out.println("y2: ");
		double y2 = input.nextDouble();
		System.out.println("x3: ");
		double x3 = input.nextDouble();
		System.out.println("y3: ");
		double y3 = input.nextDouble();
		displayTri(x1, y1, x2, y2, x3, y3);
		*/
		
		
		double x1 = 1.0; double y1 = 1.0; double x2 = -4.0; double y2 = 4.0; double x3 = 4.75; double y3 = 4.5;
		displayTri(x1, y1, x2, y2, x3, y3);
		double x21 = 0; double y21 = 8; double x22 = 0; double y22 = 0; double x23 = 8; double y23 = 0;
		displayTri(x21, y21, x22, y22, x23, y23);
		double x31 = 0; double y31 = 0; double x32 = 0; double y32 = 3; double x33 = 6; double y33 = 0;
		displayTri(x31, y31, x32, y32, x33, y33);
		double x41 = 0; double y41 = 0; double x42 = 1; double y42 = 3; double x43 = 4; double y43 = 0;
		displayTri(x41, y41, x42, y42, x43, y43);
		
		
	}
	public static double roundNum(double x, double d)
	{
		x += (5 * Math.pow(10, -d));
		double divide = Math.pow(10, d);
		double remainder = (int)((x * divide) % divide);
		return x = (int)x + (remainder / divide);
	}
	public static double calcDistance (double x1, double y1, double x2, double y2){
		double Distance = (Math.sqrt(((x2 - x1)*(x2 - x1))+((y2 - y1)*(y2 - y1))));
		//System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + Distance );
		return Distance;
	}
	public static double getSlope(double x1, double y1, double x2, double y2){
		double slope = (y2 - y1)/(x2 - x1);
		//System.out.println("The slope between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + slope); 
		return slope;
	}
	public static double triArea(double side1, double side2, double side3){
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}
	public static void displayTri(double x1, double y1, double x2, double y2, double x3, double y3){
		double sideA = calcDistance(x2, y2, x3, y3);
		double sideB = calcDistance(x3, y3, x1, y1);
		double sideC = calcDistance(x1, y1, x2, y2);
		double length = sideA + sideB + sideC;
		
		double slopeA = getSlope(x2, y2, x3, y3);
		double slopeB = getSlope(x3, y3, x1, y1);
		double slopeC = getSlope(x1, y1, x2, y2);
		
		double angleA = Math.toDegrees(Math.acos( ((sideA * sideA)-(sideB * sideB)-(sideC * sideC)) / (-2 * sideB * sideC)));
		double angleB = Math.toDegrees(Math.acos( ((sideB * sideB)-(sideA * sideA)-(sideC * sideC)) / (-2 * sideA * sideC)));
		double angleC = Math.toDegrees(Math.acos( ((sideC * sideC)-(sideB * sideB)-(sideA * sideA)) / (-2 * sideA * sideB)));
		double totalAngle = angleA + angleB + angleC;
		
		double area = triArea(sideA, sideB, sideC);
		
		double angleAround = roundNum(angleA, 2);
		double angleBround = roundNum(angleB, 2);
		double angleCround = roundNum(angleC, 2);
	
		
		String type;
		
		
		if (angleAround > 90.1 || angleBround > 90.1 || angleCround > 90.1){
			type = "Obtuse";
		} else if ((angleAround >= 89.9 && angleAround <= 90.1) || (angleBround >= 89.9 && angleBround <= 90.1) || (angleCround >= 89.9 && angleCround <= 90.1)){
			type = "Right";
		} else if (angleAround < 89.99 || angleBround < 89.9 || angleCround < 89.9){
			type = "Acute";
		} else {
			type = "Acute";
		}
		
		
		/*
		if (sideA == sideB || sideA == sideC || sideB == sideC){
			type = "Right";
		} else if (angleAround > 90.1 || angleBround > 90.1 || angleCround > 90.1){
			type = "Obtuse";
		} else if (angleAround < 89.99 || angleBround < 89.99 || angleCround < 89.99) {
			type = "Acute";
		} else {
			type = "Right";
		}
		*/
		
		String filler = "=====";
		String a = "Coordinates";
		String b = "length";
		String c = "slope";
		String d = "OppAngle";
		String e = "";
		
		System.out.printf("%12s %15s %10s %8s %11s\n", e, a, b, c, d);
		System.out.printf("(%4.1f, %4.1f) (%4.1f, %4.1f): %10.2f %10.2f %10.1f\n", x1, y1, x2, y2, sideC, slopeC, angleC);
		System.out.printf("(%4.1f, %4.1f) (%4.1f, %4.1f): %10.2f %10.2f %10.1f\n", x2, y2, x3, y3, sideA, slopeA, angleA);
		System.out.printf("(%4.1f, %4.1f) (%4.1f, %4.1f): %10.2f %10.2f %10.1f\n", x3, y3, x1, y1, sideB, slopeB, angleB);
		System.out.printf("%37s %21s\n", filler, filler);
		System.out.printf("Type: %6s %24.2f %21.1f\n", type, length, totalAngle);
		System.out.printf("Area: %5.2f sq units\n", area);
		System.out.println("------------------------------------------------------------");
		
		
	} 

}
