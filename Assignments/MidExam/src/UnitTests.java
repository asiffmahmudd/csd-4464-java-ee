import static org.junit.Assert.*;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

public class UnitTests {
	List<Business> business1 = new ArrayList<Business>();
	List<Business> business2 = new ArrayList<Business>();
	List<Business> business3 = new ArrayList<Business>();
	
	
	List<Pet> pets1 = new ArrayList<Pet>();
	List<Pet> pets2 = new ArrayList<Pet>();
	List<Pet> pets3 = new ArrayList<Pet>();
	List<Pet> pets4 = new ArrayList<Pet>();
	List<Pet> pets5 = new ArrayList<Pet>();
	List<Pet> pets6 = new ArrayList<Pet>();
	List<Pet> pets7 = new ArrayList<Pet>();
	
	List<Person> persons1 = new ArrayList<Person>();
	List<Person> persons2 = new ArrayList<Person>();
	List<Person> persons3 = new ArrayList<Person>();
	
	Person owner1;
	Person owner2;
	Person owner3;
	
	@Before
	public void init() {
		pets1.add(new Pet("Galarian Exeggutor", 7, "Dragon"));
		pets1.add(new Pet("Charizard", 5, "Not dragon"));
		pets2.add(new Pet("Charizard", 5, "Not dragon"));
		pets2.add(new Pet("Lugia", 12, "Psychic/Water"));
		pets3.add(new Pet("Blaziken", 9, "Fire"));
		pets3.add(new Pet("Cyndaquil", 6, "Fire"));
		pets3.add(new Pet("Snorlax", 5, "Normal"));
		pets4.add(new Pet("Dragonite", 13, "Dragon"));
		pets4.add(new Pet("Celebi", 11, "Grass/Psychic"));
		pets5.add(new Pet("Gyrados", 9, "Dragon"));
		pets5.add(new Pet("Suicune", 16, "Water"));
		pets6.add(new Pet("Entei", 14, "Fire"));
		pets7.add(new Pet("Raikou", 9, "Electric"));
		pets7.add(new Pet("Magnetite", 4, "Electric"));

		owner1 = new Person("Jessy", 14, pets6);
		owner2 = new Person("Andy", 18, pets7);
		owner3 = new Person("Bruce", 19, pets3);
		
		persons1.add(new Person("Ash", 10, pets1));
		persons1.add(new Person("Misty", 11, pets2));
		persons2.add(new Person("Brock", 12, pets3));
		persons3.add(new Person("Nurse Joy", 16, pets4));
		persons3.add(new Person("James", 14, pets5));
		persons3.add(owner2);
		
		
		business1.add(new Business("Team rocket", "Kanto", owner1, "12345", persons1));
		business1.add(new Business("Team Magma", "Hoene", owner2, "34523", persons2)); 
		business2.add(new Business("Team Aqua", "Hoene", owner2, "56734", persons3));
		business3.add(new Business("Team Fire", "Kanto", owner1, "34263", persons1));
		business3.add(new Business("Team Water", "Alola", owner2, "96784", persons2));
		business3.add(new Business("Team Grass", "Jhoto", owner1, "56735", persons3));
		business3.add(new Business("Team ground", "Unova", owner3, "67455", persons1));
	}
	
	@Test
	public void q1Test() {
		assertEquals(Main.q1(business1, "Team rocket"), persons1);
	}
	
	@Test
	public void q2Test() {
		assertEquals(Main.q2(business2), Arrays.asList(owner2));
	}
	
	@Test
	public void q3Test() {
		List<Pet> pets = new ArrayList<Pet>();
		pets.add(new Pet("Galarian Exeggutor", 7, "Dragon"));
		pets.add(new Pet("Charizard", 5, "Not dragon"));
		pets.add(new Pet("Lugia", 12, "Psychic/Water"));
		pets.add(new Pet("Blaziken", 9, "Fire"));
		pets.add(new Pet("Cyndaquil", 6, "Fire"));
		pets.add(new Pet("Snorlax", 5, "Normal"));
		assertEquals(Main.q3(business1), pets);
	}
	
	@Test
	public void q7Test() {
		assertEquals(Main.multiply(5,4), 20);
	}
	
	//test1
//	List<Person> p = q1(business1, "Team rocket");
//	for (Person ps : p) 
//    {
//        System.out.println(ps);
//    }
	
	//test2
//	List<Person> p = q2(business2);
//	for (Person ps : p) 
//    {
//        System.out.println(ps);
//    }
	
	//test3
//	List<Pet> p = q3(business1);
//	for (Pet ps : p) 
//    {
//        System.out.println(ps);
//    }
}
