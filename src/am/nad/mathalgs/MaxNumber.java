package am.nad.mathalgs;

public class MaxNumber {

	public static int maxNumber(int x, int y) {
		return x>=y ? x : y;
	}
	
	public static void main(String[] args) {
		System.out.println(maxNumber(-150, 66));
	}

}
