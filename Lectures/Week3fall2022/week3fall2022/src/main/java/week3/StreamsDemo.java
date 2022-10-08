package week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsDemo {
	public static void main(String[] args) {
		List<Club> schoolClubs = setup();
		
		Map<String, List<Person>> clubsMap = new HashMap<>();
		
		clubsMap = schoolClubs.stream() //stream<club>
				.collect(Collectors.toMap(c -> c.getName(), c -> c.getMembers()));
		
		System.out.println("esports club members = " + clubsMap.get("esports"));
		System.out.println("esports club members = " + 
		schoolClubs.stream().filter(c -> c.getName().equals("esports")).findFirst().get().getMembers());
	}
	
	public static void allUniquePersons() {
		List<Club> schoolClubs = setup();
		
		List<Person> allPersons = schoolClubs.stream()   //stream<Club>
				.flatMap(club -> club.getMembers().stream()) //Stream<Person>
				.distinct()
				.collect(Collectors.toList());
		
		/*
		 * List<Person> allPersons = new ArrayList<>();
		 * for(Club club : schoolClubs) {
		 *    for(Person person : club.getMembers) {
		 * 	      if (!allPersons.contains(person)) {
		 *            allPersons.add(person);
		 *        }
		 *    }
		 * }
		 * 
		 */
		
		
		allPersons.forEach(System.out::println);
	}
	
	public static void LargeClubsDemo() {
		List<Club> schoolClubs = setup();
		
		List<Club> largeClubs = schoolClubs.stream()
			.filter(club -> club.getMembers().size() < 3)
			.collect(Collectors.toList());
		/*
		 * List<Club> largeClubs = new ArrayList<>();
		 * for(Club club : schoolClubs) {
		 * 	  if (club.getMembers.size() >= 3) {
		 *       largeClubs.add(club)
		 *    }
		 * }
		 */
		System.out.println("====LARGE CLUBS DEMO====");
		largeClubs.forEach(System.out::println);
	}
	
	public static List<Club> setup() {
		Person p1 = new Person("joe", 22);
		Person p2 = new Person("bob", 22);
		Person p3 = new Person("jane", 30);
		Person p4 = new Person("jill", 21);
		Person p5 = new Person("jake", 23);
		Person p6 = new Person("billy", 25);
		Person p7 = new Person("boe", 27);

		List<Person> c1 = new ArrayList<>();
		List<Person> c2 = new ArrayList<>();
		List<Person> c3 = new ArrayList<>();
		List<Person> c4 = new ArrayList<>();
		
		c1.add(p1);
		c1.add(p2);
		c1.add(p3);
		c2.add(p7);
		c3.add(p3);
		c3.add(p4);
		c4.add(p5);
		c4.add(p6);
		
		List<Club> clubs = new ArrayList<>();
		clubs.add(new Club("esports", c1));
		clubs.add(new Club("boardgames", c2));
		clubs.add(new Club("hockey", c3));
		clubs.add(new Club("football", c4));
		return clubs;
	}
}
