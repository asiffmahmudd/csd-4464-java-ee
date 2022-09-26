package week2fall2022;

public class ExceptionsDemo {

	public static void main(String[] args) {
		
		try {
			//throw new MySuperAwesomeException("something happened!");
		} catch (NullPointerException e) {
			System.out.println("NPE occured");
		} catch (MySuperAwesomeException e) {
			System.out.println("an exception was handled : " + e.getMessage());
		} finally {
			System.out.println("finally doing something");
		}

	}
}
