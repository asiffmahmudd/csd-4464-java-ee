package com.c0837117.finalExam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class otherTest {

	@Test
	void q6() {
		assertEquals(ExamQuestions.isPrime(7, 2), true);
		assertEquals(ExamQuestions.isPrime(10, 2), false);
	}

}
