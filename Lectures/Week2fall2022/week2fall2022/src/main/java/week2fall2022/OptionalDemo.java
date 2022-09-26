package week2fall2022;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Optional<Integer> myOptional = Optional.ofNullable(5);
		
		

		String results = myOptional
				.map(x -> x * 5)  //optional(5) * 5
				.map(x -> x.toString())  //optional(25) -> optional("25")
				.orElse("the optional was empty"); //returns "25"
		
		System.out.println(results);
		
		
		String results2 = myOptional
				.filter(x -> x > 6)  //empty optional
				.map(x -> x * 5)     //empty optional
				.map(x -> x.toString())   //empty optional
				.orElse("the optional was empty");  //falls into or else
		
		System.out.println(results2);
	}

}
