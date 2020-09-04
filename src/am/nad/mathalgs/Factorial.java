package am.nad.mathalgs;

public class Factorial {

	public static int factorialNotRecursive(int n) {
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	public static int factorialRecursive(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorialRecursive(n - 1);
		}
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(factorialRecursive(n));
		System.out.println();
		System.out.println(factorialNotRecursive(n));
	}

}
