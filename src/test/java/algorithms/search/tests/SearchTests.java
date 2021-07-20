package algorithms.search.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algorithms.search.BinarySearch;
import algorithms.search.SequentialSearch;

class SearchTests {

	private int[] numbers = { 1, 14, 2, 78, 128, 50, 9, 26, 99 };
	private int[] numbersSorted = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void searchingNumbersFor2YieldsIndex2() {
		assertEquals(2, SequentialSearch.search(2, numbers));
	}
	
	@Test
	void searchingNumbersFor128YieldsIndex4() {
		assertEquals(4, SequentialSearch.search(128, numbers));
	}
	@Test
	void searchingNumbersFor99YieldsIndex8() {
		assertEquals(8, SequentialSearch.search(99, numbers));
	}
	
	@Test
	void binarySearchOfNumbersSortedFor4YieldsIndex3() {
		assertEquals(3, BinarySearch.binarySearch(4, numbersSorted));
		assertEquals(3, BinarySearch.binarySearchRecursive(4, numbersSorted, 0, 14));
	}
	
	@Test
	void binarySearchOfNumbersSortedFor8YieldsIndex7() {
		assertEquals(7, BinarySearch.binarySearch(8, numbersSorted));
		assertEquals(7, BinarySearch.binarySearchRecursive(8, numbersSorted, 0, 14));
	}
	
	@Test
	void binarySearchOfNumbersSortedFor12YieldsIndex11() {
		assertEquals(11, BinarySearch.binarySearch(12, numbersSorted));
		assertEquals(11, BinarySearch.binarySearchRecursive(12, numbersSorted, 0, 14));
	}

}
