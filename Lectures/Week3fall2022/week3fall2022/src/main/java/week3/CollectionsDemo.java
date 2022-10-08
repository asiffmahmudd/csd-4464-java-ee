package week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {

	public static void main(String[] args) {
		List<String> stores = new ArrayList<>();
		stores.add("walmart");
		stores.add("bestbuy");
		stores.add("subway");
		stores.add("pizzapizza");
		stores.add("walmart");
		
		System.out.println("list size " + stores.size());
		stores.forEach(x -> System.out.println(x));
		//stores.forEach(System.out::println);
		
		System.out.println("======Set======");
		Set<String> storeSet = new HashSet<>();
		storeSet.add("walmart");
		storeSet.add("bestbuy");
		storeSet.add("subway");
		storeSet.add("pizzapizza");
		storeSet.add("walmart");
		System.out.println("Set size " + storeSet.size());
		storeSet.forEach(x -> System.out.println(x));
		
		
		
		System.out.println("======Maps======");
		Map<String, Person> myMap = new HashMap<>();
		myMap.put("c01234567", new Person("joe smoe", 22));
		myMap.put("c01234568", new Person("joe bob", 21));
		myMap.put("c01234569", new Person("john doe", 24));
		myMap.put("c01234666", new Person("jane doe", 30));
		
		System.out.println("c01234567 - " + myMap.get("c01234567").getName());
	}

}
