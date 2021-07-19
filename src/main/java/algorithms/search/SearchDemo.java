package algorithms.search;

public class SearchDemo {

	public static void main(String[] args) {
		int[] numbers = { 1, 14, 2, 78, 128, 50 };
		// Searching for 2 should return an index of 2;
		System.out.println("The index of 2 is " + SequentialSearch.search(2, numbers));
	}

}
