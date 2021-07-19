package algorithms.search;

import java.util.List;

public interface BinarySearch {

	static int binarySearch(int num, int[] array) {
		int start = 0, end = array.length-1;
		int mid = 0;
		while(start <= end) {
			mid=(start+end)/2;
			if(array[mid] > num) {
				end=mid-1;
			} else if(array[mid] < num) {
				start = mid+1;
			} else {
				return mid;
			}	
		}
		return -1;
	}
	
	static int binarySearchRecursive(int num, int[] array, int start, int end) {
		if(end >= start) {
			int mid = start + (end -1)/2;
			if(array[mid] == num) {
				return mid;
			}
			if(array[mid] > num) {
				return binarySearchRecursive(num, array, start, mid-1);
			}
		}
		return -1;
	}
	
	static int binarySearch(int num, List<Integer> list){
		if(list.contains(Integer.valueOf(num))) {
			return list.indexOf(Integer.valueOf(num));
		}
		return -1;
	}
	
	
}
