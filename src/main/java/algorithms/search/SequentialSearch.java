package algorithms.search;

public interface SequentialSearch {

	/**
	 * Sequential search searches an array for a particular value and returns the
	 * index with the value or a -1 if it is not found in the array.
	 * 
	 * BigO: O(n)
	 * 
	 * @param num
	 * @param arr
	 * @return index of num
	 */
	static int search(int num, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return i;
			}
		}
		return -1;
	}
}
