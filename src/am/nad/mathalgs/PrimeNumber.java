package am.nad.mathalgs;

public class PrimeNumber {

	public static boolean isPrimeNumberNotRecursive(int number) {
		if (number % 2 == 0) {
			return false;
		}
		for(int i = 3; i < Math.sqrt(number); i+=2) {
			if ( number% i == 0 ) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPrimeNumberRecursive(int number, int divisor) {
		if (number <= 2) {
			return (number == 2) ? true : false;
		}
		if (number % divisor == 0) {
			return false;
		}
		if (divisor * divisor > number) {
			return true;
		}
		
		return isPrimeNumberRecursive(number, divisor + 1);
	}
	
	public static void main(String[] args) {
		System.out.println(isPrimeNumberNotRecursive(7) ? "Yes" : "No");
		System.out.println(isPrimeNumberNotRecursive(15) ? "Yes" : "No");
		System.out.println(isPrimeNumberNotRecursive(12) ? "Yes" : "No");
		
		System.out.println();
		
		System.out.println(isPrimeNumberRecursive(13, 2) ? "Yes" : "No");
		System.out.println(isPrimeNumberRecursive(7, 2) ? "Yes" : "No");
		System.out.println(isPrimeNumberRecursive(12, 2) ? "Yes" : "No");
		
	}

}
