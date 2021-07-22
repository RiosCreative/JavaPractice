package algorithms.sort;

public interface MergeSort {

	static Integer[] sort(Integer[] array) {
		if(array.length <=1) {
			return array;
		}
		Integer[] firstHalf = new Integer[array.length/2];
		Integer[] secondHalf = new Integer[array.length - firstHalf.length];
		System.arraycopy(array, 0, firstHalf, 0, firstHalf.length);
		System.arraycopy(array, firstHalf.length, secondHalf, 0, secondHalf.length);
		
		sort(firstHalf);
		sort(secondHalf);
		merge(firstHalf, secondHalf, array);
		return array;
	}
	
	static void merge(Integer[] first, Integer[] second, Integer[] result) {
		int firstIndex = 0;
		int secondIndex = 0;
		int mergedIndex = 0;
		
		while(firstIndex < first.length && secondIndex < second.length) {
			if(first[firstIndex].compareTo(second[secondIndex]) < 0) {
				result[mergedIndex] = first[firstIndex];
				firstIndex++;
			} else {
				result[mergedIndex] = second[secondIndex];
				secondIndex++;
			}
			mergedIndex++;
		}
		System.arraycopy(first, firstIndex, result, mergedIndex, first.length - firstIndex);
		System.arraycopy(second, secondIndex, result, mergedIndex, second.length - secondIndex);;
		
	}
	
}
