package assignment2;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
	}
	
	public static int largestNumber(List<Integer> list) {
		return list.stream().max(Integer::compare).get();
	}
	
	public static List<Integer> greaterThanN(List<Integer> list, int n){
		return list.stream()
				.filter(x -> x > n)
				.collect(Collectors.toList());
	}
	
	public static List<String> fizzBuzz(List<Integer> list) {
		List<String> strList = new ArrayList<String>();
		list.stream().forEach( x -> {
			if(x % 2 == 0 && x % 5 == 0){
				strList.add("fizz buzz");
			}
			else if(x % 2 == 0) {
				strList.add("fizz");
			}
			else if(x % 5 == 0) {
				strList.add("buzz");
			}
			else{
				strList.add(x.toString());
			}
		});
		return strList;
	}
	
	public static boolean isLessThanN(Map<String, Integer> map, int n) {
		return map.values().stream().anyMatch(num -> num < n);
	}
	
	public static List<Integer> largestElements(List<Integer> list, int n){
		return list.stream()
				.sorted(Comparator.reverseOrder())
				.limit(n)
				.collect(Collectors.toList());
	}
}
