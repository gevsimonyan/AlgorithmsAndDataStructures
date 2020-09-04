package am.nad.search;

public class AnotherBinarySearch {

	public static int anotherBinarySearch(int arr[], int searchNumber) {
		int low = 0;
		int high = arr.length -1;
		
		while (low <= high) {
			int middle = (low + high)/2;
			if (arr[middle] == searchNumber) {
				return middle;
			} else if (arr[middle] > searchNumber) {
				high = middle + 1;
			} else {
				low = middle + 1;
			}
			
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		int[] arr = new int[1000];
		for (int i = 0; i < 1000; i++) {
			arr[i] = i - 12;
		}
		int target = 464;
		int result = anotherBinarySearch(arr,target);
		System.out.println(result);
		if (result == -1) {
			System.out.println("Element not found");
		}
	}
		
}
