package questions;

public class FindTheFibonacciNumber {

	public static void main(String[] args) {
		System.out.println("First fibonacci number is " + fibRecursive(1));
		System.out.println("Second fibonacci number is " + fibRecursive(2));
		System.out.println("Third fibonacci number is " + fibRecursive(3));
		System.out.println("Fourth fibonacci number is " + fibRecursive(4));
		System.out.println("Fifth fibonacci number is " + fibRecursive(5));
		
		System.out.println("First fibonacci number is " + fib(1));
		System.out.println("Second fibonacci number is " + fib(2));
		System.out.println("Third fibonacci number is " + fib(3));
		System.out.println("Fourth fibonacci number is " + fib(4));
		System.out.println("Fifth fibonacci number is " + fib(5));
	}
	
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
