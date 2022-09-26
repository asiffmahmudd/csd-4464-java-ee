package week1fall2022;

import static org.junit.Assert.*;
import org.junit.Test;

public class RecursionTest {

	@Test
	public void test() {
		assertEquals(24, RecursionDemo.factorial(4));
	}

	@Test
	public void reverseTest() {
		assertEquals("edcba", RecursionDemo.reverseString("abcde"));
	}
}
