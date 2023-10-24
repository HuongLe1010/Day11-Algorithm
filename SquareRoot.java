package Day11;

public class SquareRoot {
	public static void main(String[] args) {
		int num = 16;
		double result = sqrt(num);
		System.out.println("Approximate square root of " + num + " is: " + result);
	
	}
		
	public static double sqrt(int num) {
		double x = num/ 2.0;
		double y = (x + num/ x)/2.0;
		
		while (y - x >= 0.01 || x - y >= 0.01) {
			x = y;
			y = (x + num/x)/ 2.0;
		}
		
		return y;
	}
	
}
