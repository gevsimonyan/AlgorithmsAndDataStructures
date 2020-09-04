package am.nad.search;



public class BinarySearch {

	
	// arr[l....r]
	// we want to find index of x
	public static int binarySearch(int arr[], int l, int r, int x) {
		if(r >= l) {
			int middle = l + (r - l) / 2;
			if(arr[middle] == x) {
				return middle;
			}
			if (arr[middle] > x) {
				return binarySearch(arr, l, middle - 1, x);
			}
			return binarySearch(arr, middle + 1, r, x);
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {2, 4, 1, 8, 4, 9, 11};
		int size = arr.length;
		int searchNumber = 124;
		int result = binarySearch(arr,0 ,size - 1, searchNumber);
		System.out.println("Element number is:" + result);
		if (result == -1) {
			System.out.println("Element not found");
		}
	}

}
