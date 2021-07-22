package algorithm.sort.tests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algorithms.sort.MergeSort;
import algorithms.sort.QuickSort;

class SortTests {

	Integer[] baseNumbers = { 55, 21, 4, 60, 77, 86, 12, 3, 34, 100 };
	Integer[] sortedNumbers = { 3, 4, 12, 21, 34, 55, 60, 77, 86, 100 };
	Integer[] numbers = new Integer[baseNumbers.length];
	
	@BeforeEach
	public void setUp() {
		for(int i=0; i < numbers.length; i++) {
			numbers[i] = baseNumbers[i];
		}
	}

	@Test
	void quickSortSortsNumbersArray() {
		QuickSort.sort(numbers, 0, 9);
		assertArrayEquals(sortedNumbers, numbers);
	}
	
	@Test
	void mergeSortSortsNumbersArray() {
		//System.out.println(Arrays.toString(MergeSort.sort(numbers)));
		assertArrayEquals(sortedNumbers, MergeSort.sort(numbers));
	}
}
