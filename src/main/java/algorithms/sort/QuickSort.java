package algorithms.sort;

/**
 * NOTE: Arrays.sort() method uses the quick sort algorithm to sort arrays of primitives
 * using double pivot elements. 
 *
 */
public interface QuickSort {

	static void sort(Integer[] array, int low, int high) {
		if (array == null || array.length == 0 || low >= high) {
			return;
		}
		int middle = low + (high - low) / 2;
		int pivot = array[middle];
		int i = low;
		int j = high;
		while (i <= j) {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				swap(array, i, j);
				i++;
				j--;
			}
		}
		if (low < j) {
			sort(array, low, j);
		}
		if (high > i) {
			sort(array, i, high);
		}
	}

	static void swap(Integer[] array, int x, int y) {
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
}
