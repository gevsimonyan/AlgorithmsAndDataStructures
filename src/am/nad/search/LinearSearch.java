package am.nad.search;

public class LinearSearch {

	public static int linearSearch(int arr[], int val) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[1000];
		for (int i = 0; i < 1000; i++) {
			arr[i] = i + 17;
		}
		int target = 749;
		int result = linearSearch(arr,target);
		System.out.println(result);
		if (result == -1) {
			System.out.println("Element not found");
		}
	}
	

}
