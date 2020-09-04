package am.nad.pow;

public class PowerOfTwo {

	public static boolean isPowerOfTwo(int value) {
		return value != 0 && ((value & ( value - 1 )) == 0);
	}
	
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(30457) ? "Yes" : "No");
		System.out.println(isPowerOfTwo(2048)  ? "Yes" : "No");
	}

}
