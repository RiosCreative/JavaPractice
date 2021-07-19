package questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * You are given an array of positive numbers from 1 to n, such that all numbers
 * from 1 to n are present except one number x. You have to find x. The input
 * array is not sorted.
 * 
 * @author riosfamily
 *
 */
public class FindTheMissingNumber {

	public static void main(String[] args) {
		int[] simpleArray = { 1, 3, 4 }; // missing 2
		int[] mediumArray = { 1, 4, 2, 3, 7, 5, 8 }; // missing 6
		int[] largeArray = { 8, 16, 12, 1, 9, 4, 6, 10, 5, 11, 14, 2, 3, 7, 15 }; // missing 13

		System.out.println(findMissingA(simpleArray));
		System.out.println(findMissingA(mediumArray));
		System.out.println(findMissingA(largeArray));
		System.out.println(findMissingB(simpleArray));
		System.out.println(findMissingB(mediumArray));
		System.out.println(findMissingB(largeArray));
		
		System.out.println(findMissingListA(Arrays.asList(new Integer[] { 1, 3, 4 })));
		System.out.println(findMissingListA(Arrays.asList(new Integer[] { 1, 4, 2, 3, 7, 5, 8 })));
		System.out.println(findMissingListA(Arrays.asList(new Integer[] { 8, 16, 12, 1, 9, 4, 6, 10, 5, 11, 14, 2, 3, 7, 15 })));
		System.out.println(findMissingListB(Arrays.asList(new Integer[] { 1, 3, 4 })));
		System.out.println(findMissingListB(Arrays.asList(new Integer[] { 1, 4, 2, 3, 7, 5, 8 })));
		System.out.println(findMissingListB(Arrays.asList(new Integer[] { 8, 16, 12, 1, 9, 4, 6, 10, 5, 11, 14, 2, 3, 7, 15 })));
		
	}

	public static int findMissingA(int[] arr) {
		// Sort array
		Arrays.sort(arr);
		// Check for missing value
		for (int i = 0; i < arr.length; i++) {
			if (arr[i + 1] - arr[i] == 2) {
				return arr[i] + 1;
			}
		}
		return -1;
	}

	static int findMissingListA(List<Integer> nums) {
		for (int i = 1; i < nums.size()+1; i++) {
			if (nums.contains(i)) {
				continue;
			} else {
				return i;
			}
		}
		return -1;
	}

	public static int findMissingB(int[] arr) {
		// Assume array should be from 1 to length+1 (n);
		// Assume sum of numbers should be sum of 1 to n;
		int n = arr.length+1; 
		int totalPlus = n * (n+1)/2;
		int total = 0;
		for(int i: arr) {
			total += i;
		}
		return totalPlus - total;
	}
	
	public static int findMissingListB(List<Integer> nums) {
		int totalPlus = IntStream.rangeClosed(1, nums.size()+1).sum();
		int total = nums.stream().mapToInt(Integer::intValue).sum();
		return totalPlus - total;
	}

}
