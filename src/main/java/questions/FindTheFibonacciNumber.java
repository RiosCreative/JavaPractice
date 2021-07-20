package questions;

public interface FindTheFibonacciNumber {
	
	public static int fibRecursive(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibRecursive(n-1) + fibRecursive(n-2);
		}
	}
	
	public static int fib(int n) {
		if(n <= 1) {
			return n;
		}
		int prevFib = 1;
		int fib = 1;
		for(int i=2; i<n; i++) {
			int temp = fib;
			fib += prevFib;
			prevFib = temp;
		}
		return fib;
	}
	
}
