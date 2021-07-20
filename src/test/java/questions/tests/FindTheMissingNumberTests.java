package questions.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import questions.FindTheMissingNumber;

class FindTheMissingNumberTests {

	private int[] simpleArray = { 1, 3, 4 }; // missing 2
	private int[] mediumArray = { 1, 4, 2, 3, 7, 5, 8 }; // missing 6
	private int[] largeArray = { 8, 16, 12, 1, 9, 4, 6, 10, 5, 11, 14, 2, 3, 7, 15 }; // missing 13

	@Test
	void findTheMissingNumberInASimpleArray() {
		assertEquals(2, FindTheMissingNumber.findMissingA(simpleArray));
		assertEquals(2, FindTheMissingNumber.findMissingB(simpleArray));
	}

	@Test
	void findTheMissingNumberInAMediumArray() {
		assertEquals(6, FindTheMissingNumber.findMissingA(mediumArray));
		assertEquals(6, FindTheMissingNumber.findMissingB(mediumArray));
	}

	@Test
	void findTheMissingNumberInAlargeArray() {
		assertEquals(13, FindTheMissingNumber.findMissingA(largeArray));
		assertEquals(13, FindTheMissingNumber.findMissingB(largeArray));
	}

	@Test
	void findTheMissingNumberInASimpleList() {
		assertEquals(2, FindTheMissingNumber.findMissingListA(Arrays.asList(new Integer[] { 1, 3, 4 })));
		assertEquals(2, FindTheMissingNumber.findMissingListB(Arrays.asList(new Integer[] { 1, 3, 4 })));
	}

	@Test
	void findTheMissingNumberInAMediumList() {
		assertEquals(6, FindTheMissingNumber.findMissingListA(Arrays.asList(new Integer[] { 1, 4, 2, 3, 7, 5, 8 })));
		assertEquals(6, FindTheMissingNumber.findMissingListB(Arrays.asList(new Integer[] { 1, 4, 2, 3, 7, 5, 8 })));
	}

	@Test
	void findTheMissingNumberInALargeList() {
		assertEquals(13, FindTheMissingNumber
				.findMissingListA(Arrays.asList(new Integer[] { 8, 16, 12, 1, 9, 4, 6, 10, 5, 11, 14, 2, 3, 7, 15 })));
		assertEquals(13, FindTheMissingNumber
				.findMissingListB(Arrays.asList(new Integer[] { 8, 16, 12, 1, 9, 4, 6, 10, 5, 11, 14, 2, 3, 7, 15 })));
	}

}
