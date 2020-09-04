package am.nad.mathalgs;

public class PalindromNumbers {

	public static boolean isPalindromString(String word) {
		int i = 0;
		int j = word.length() - 1;
		
		while (i < j) {
			if (word.charAt(i) != word.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static int reverseNumber(int n) {
		int revNumber = 0;
		while (n > 0) {
			revNumber = revNumber * 10 + n % 10;
			n = n / 10;
		}
		return revNumber;
	}
	
	public static boolean isPalindromInteger(int n) {
		int revNumber = reverseNumber(n);
		if (revNumber == n) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindromString("aaaabbaaaa") ? "Yes" : "No");
		System.out.println(isPalindromInteger(11122111) ? "Yes" : "No");
		
		System.out.println(isPalindromInteger(123) ? "Yes" : "No");
		System.out.println(isPalindromString("WASD") ? "Yes" : "No");
	}

}
