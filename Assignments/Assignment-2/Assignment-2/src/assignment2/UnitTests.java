package assignment2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class UnitTests {
	
	List<Integer> list = new ArrayList<Integer>();
	
	@Before
	public void setup() {
		list.add(5);
		list.add(10);
		list.add(6);
		list.add(8);
		list.add(1);
		list.add(4);
		list.add(16);
		list.add(7);
	}
	
	@Test
	public void largestNumberTest() {
		assertEquals(16, Main.largestNumber(list));
	}
	
	@Test
	public void greaterThanNTest() {
		assertEquals(Arrays.asList(10,6,8,16,7), Main.greaterThanN(list, 5));
	}
	
	@Test
	public void lessThanNTest() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("first", 5);
		map.put("second", 3);
		map.put("third", 4);
		map.put("fourth", 7);
		map.put("fifth", 9);
		map.put("sixth", 8);
		map.put("seventh", 2);
		assertEquals(true, Main.isLessThanN(map, 5));
		assertEquals(false, Main.isLessThanN(map, 0));
	}
	
	@Test
	public void fizzbuzzTest() {
		List<String> str = Main.fizzBuzz(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		assertEquals(Arrays.asList("1","fizz","3","fizz","buzz","fizz","7","fizz","9","fizz buzz"), str);
	}
	
	@Test
	public void largestElementsTest() {
		assertEquals(Arrays.asList(16,10,8), Main.largestElements(list, 3));
	}
}
