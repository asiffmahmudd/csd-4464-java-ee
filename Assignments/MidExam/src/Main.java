import java.util.*;
import java.util.stream.Collectors;
public class Main {
	
	public static List<Person> q1(List<Business> business, String name){
		return business
				.stream()
				.filter(bs -> bs.getName().equals(name))
				.flatMap(bs -> bs.getCustomers().stream())
				.distinct()
				.collect(Collectors.toList());
	}
	
	public static List<Person> q2(List<Business> business){
		return business
				.stream()
				.filter(bs -> bs.getCustomers().contains(bs.getOwner()))
				.map(bs -> bs.getOwner())
				.collect(Collectors.toList());
	}
	
	public static List<Pet> q3(List<Business> business){
		return business
				.stream()
				.flatMap(bs -> bs.getCustomers().stream()
				.flatMap(cs -> cs.getPets().stream()))
				.distinct()
				.collect(Collectors.toList());
	}
	
	public static Map<Person, Business> q4(List<Business> business){
		Map<Person, Business> m = new HashMap<Person, Business>();
		business.stream()
				.forEach(bs -> m.put(bs.getOwner(), bs));
		return m;
	}
	
	public static Map<Person, Integer> q5(List<Business> business, Map<String, Integer> m){
		Map<Person, Integer> result = new HashMap<Person, Integer>();
		business.stream()
				.filter(bs -> m.containsKey(bs.getName()))
				.forEach(bs -> result.put(bs.getOwner(), m.get(bs.getName())));
		return result;
	}
	
	private static String numberToWord(int number)  
    {  
        if (number == 0)  
            return "zero";    
        String words = "";  
        if ((number / 10000000) > 0)  
        {  
            words += numberToWord(number / 1000000) + " million ";  
            number %= 10000000;  
        }  
        if ((number / 1000) > 0)  
        {  
            words += numberToWord(number / 1000) + " thousand ";  
            number %= 1000;  
        }  
        if ((number / 100) > 0)  
        {  
            words += numberToWord(number / 100) + " hundred ";  
            number %= 100;  
        }  
        if (number > 0)  
        {  
            String[] singleUnit = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };  
            String[] doubleUnit = { "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };  
            if (number < 20)  
                words += singleUnit[number];  
            else  
            {  
                words += doubleUnit[number / 10];  
                if ((number % 10) > 0)  
                    words += " " + singleUnit[number % 10];  
            }  
        }  
        return words;  
    }  
	
	public static int multiply(int a, int b) {
		if(a <= 0 || b <= 0) {
			return 0;
		}
		if (b <= 1){
			return a;
		}
		else {
			return a + multiply(a, b-1);
		}
	}
}
