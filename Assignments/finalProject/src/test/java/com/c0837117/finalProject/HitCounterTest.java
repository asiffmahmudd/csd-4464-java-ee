package com.c0837117.finalProject;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class HitCounterTest {
	@Test
	public void HitCounterCountTest() throws Exception {
		HitCounter h = new HitCounter();
		h.incrementCounter();
		assertEquals(h.getHitCount(), 1);
	}
}
