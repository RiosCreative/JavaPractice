package questions.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import questions.FindTheFibonacciNumber;

class FindTheFibonacciNumberTests {

	@Test
	void testFirstFibonacciNumberIs0() {
		assertEquals(0, FindTheFibonacciNumber.fib(0));
		assertEquals(0, FindTheFibonacciNumber.fibRecursive(0));
	}
	
	@Test
	void testSecondFibonacciNumberIs1() {
		assertEquals(1, FindTheFibonacciNumber.fib(1));
		assertEquals(1, FindTheFibonacciNumber.fib(1));
	}
	
	@Test
	void testThirdFibonacciNumberIs1() {
		assertEquals(1, FindTheFibonacciNumber.fib(2));
		assertEquals(1, FindTheFibonacciNumber.fibRecursive(2));
	}
	
	@Test
	void testFourthFibonacciNumberIs2() {
		assertEquals(2, FindTheFibonacciNumber.fib(3));
		assertEquals(2, FindTheFibonacciNumber.fibRecursive(3));
	}
	
	@Test
	void testFifthFibonacciNumberIs3() {
		assertEquals(3, FindTheFibonacciNumber.fib(4));
		assertEquals(3, FindTheFibonacciNumber.fibRecursive(4));
	}
	
	@Test
	void testSixthFibonacciNumberIs5() {
		assertEquals(5, FindTheFibonacciNumber.fib(5));
		assertEquals(5, FindTheFibonacciNumber.fibRecursive(5));
	}
	
	@Test
	void testSeventhFibonacciNumberIs8() {
		assertEquals(8, FindTheFibonacciNumber.fib(6));
		assertEquals(8, FindTheFibonacciNumber.fibRecursive(6));
	}

	
	@Test
	void testEigthFibonacciNumberIs13() {
		assertEquals(13, FindTheFibonacciNumber.fib(7));
		assertEquals(13, FindTheFibonacciNumber.fibRecursive(7));
	}
}
