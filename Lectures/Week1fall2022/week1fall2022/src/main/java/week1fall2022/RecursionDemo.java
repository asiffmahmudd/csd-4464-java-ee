package week1fall2022;

public class RecursionDemo {

	public static int factorial(int a) {
		if (a == 1) {
			return a;
		}
		return a * factorial(a - 1);
	}
	
	public static String reverseString(String toReverse) {
		if (toReverse.length() == 1) {
			return toReverse;
		}
		
		return reverseString(toReverse.substring(1)) + toReverse.charAt(0);
	}
}
