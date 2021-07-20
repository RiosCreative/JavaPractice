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
public interface FindTheMissingNumber {

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
		for (int i = 1; i < nums.size() + 1; i++) {
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
		int n = arr.length + 1;
		int totalPlus = n * (n + 1) / 2;
		int total = 0;
		for (int i : arr) {
			total += i;
		}
		return totalPlus - total;
	}

	public static int findMissingListB(List<Integer> nums) {
		int totalPlus = IntStream.rangeClosed(1, nums.size() + 1).sum();
		int total = nums.stream().mapToInt(Integer::intValue).sum();
		return totalPlus - total;
	}

}
