package assignment1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HasOldDogTest {

	@Test
	void test() {
		Dog d = new Dog("Kai", 9);
		Person p = new Person("Ryan", 20, d);
		assertEquals(p.hasOldDog(), false);
	}
	
	@Test
	void reverseTest() {
		Dog d = new Dog("Tyson", 11);
		Person p = new Person("Karen", 21, d);
		assertEquals(p.hasOldDog(), true);
	}
	
	@Test
	void withoutDog() {
		Person p = new Person("Karen", 21);
		assertEquals(p.hasOldDog(), false);
	}
}
