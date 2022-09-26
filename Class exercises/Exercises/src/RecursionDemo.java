
public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("abcde"));
	}
	
	public static String reverseString(String s) {
		if(s == null || s.length() <= 1) {
			return s;
		}
		return reverseString(s.substring(1)) + s.charAt(0);
		
	}
}
