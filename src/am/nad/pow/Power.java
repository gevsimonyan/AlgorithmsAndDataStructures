package am.nad.pow;

public class Power {

	public static long powNotRecursiv(int x, int y) {
		long res = 1;
		for(int i = 0; i <= y; i++) {
			res *= x;
		}
		return res; 
	}
	
	public static long powRecursiv(int x, int y) {
		if (y == 0) {
			return 1;
		} else {
			return x * powRecursiv(x, y - 1);
		}
	}
	
	public static void main(String[] args) {
			int x = 8;
			int y = 12;
			System.out.println(powNotRecursiv(x, y));
			
			int a = 4;
			int b = 20;
			System.out.println(powNotRecursiv(a,b));
	}

}
