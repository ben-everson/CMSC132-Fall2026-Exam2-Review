package bigOPractice;

import java.math.BigInteger;

public class PracticeProblems {

	static int fibCalls = 0;

	public static void main(String args[] ) {
		int n = 10;
		int i =0;


		// A
		int iterations = 0;
		for (i = 0; i < 500; i++) {
			iterations++;
		}
		System.out.println("A iterations: " + iterations);

		// B
		iterations = 0;
		for (i = 7; i < 4 * n + 25; i += 3) {
			iterations++;
		}
		System.out.println("B iterations: " + iterations);

		// C
		iterations = 0;
		for (i = 0; i < n; i++) {
			iterations++;
		}
		for (i = 0; i < 2 * n; i++) {
			iterations++;
		}
		for (i = 0; i < 1000; i++) {
			iterations++;
		}
		System.out.println("C iterations: " + iterations);

		// D
		iterations = 0;
		for (i = 0; i < n; i++) {
			for (int j = 0; j < 50; j++) {
				iterations++;
			}
		}
		System.out.println("D iterations: " + iterations);

		// E
		iterations = 0;
		for (i = 3; i < n * n - 2; i++) {
			iterations++;
		}
		System.out.println("E iterations: " + iterations);

		// F
		iterations = 0;
		for (i = -100; i < n + 200; i++) {
			for (int j = 50; j < 3 * n + 75; j += 2) {
				iterations++;
			}
		}
		System.out.println("F iterations: " + iterations);

		// G
		iterations = 0;
		for (i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				iterations++;
			}
		}
		System.out.println("G iterations: " + iterations);

		// H
		iterations = 0;
		for (i = 0; i < n; i += 2) {
			for (int j = 0; j < n + 5; j++) {
				for (int k = 1; k < n; k++) {
					iterations++;
				}
			}
		}
		System.out.println("H iterations: " + iterations);

		// I
		iterations = 0;
		for (i = 0; i < n; i++) {
			for (int j = n; j > 0; j /= 2) {
				iterations++;
			}
		}
		System.out.println("I iterations: " + iterations);

		// J
		iterations = 0;
		fibCalls = 0;
		fib(n);
		iterations = fibCalls;
		System.out.println("J iterations: " + iterations);

		// K
		iterations = 0;
		for (int j = 0; j <= n-1; j+= n) {
			for (i = 0; i <= n; i++){
				iterations++;
			}
		}
		System.out.println("K iterations: " + iterations);

		// L
		iterations = 0;
		for (i = 0; i <= n*n*n; i++) {
			i += n;
			iterations++;
		}
		System.out.println("L iterations: " + iterations);

		// M
		iterations = 0;
		for (i = 0; i >= -n; i++) {
			i = i - 2;
			iterations++;
		}
		System.out.println("M iterations: " + iterations);

		// N
		iterations = 0;
		int m = 4;
		for (i = 0; i >= -n; i++) {
			i = i - 2;
			for (int j = 9; j < n * m; j++) {
				iterations++;
			}
		}
		System.out.println("N iterations: " + iterations);

		// O
		iterations = 0;
		i = 0;
		while (i < n) {
			iterations++;
			if (i > 0) {
				i = -i -1;
			} else {
				i = -i + 1;
			}
		}
		System.out.println("O iterations: " + iterations);

		//P
		iterations = 0;
		i = 1;
		while (i < n) {
			i += i;
			iterations++;
		}
		System.out.println("P iterations: " + iterations);


		// Q
		iterations = 0;
		i = 1;
		while (i >= 1) {
			iterations++;
			i*= n;
			if (i > factorial(n)) {
				i = 0;
			}
		}
		//why does this print 1 if n=1000?
		System.out.println("Q iterations: " + iterations);

	}



	//calculate the factorial of the given number
	public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; result *= ++i ) {}
        return result;
    }

	//naive recursive fibonacci, counts every call in fibCalls
	public static int fib(int n) {
		fibCalls++;
		if (n == 0 || n == 1) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}
}
