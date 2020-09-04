package am.nad.sorts;

public class InsertionSort {

	public static void insSort(int arr[]) {
		int len = arr.length;
		for (int i = 1; i < len; i++) {
			int key = arr[i];
			int j = i - 1;
			
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1; 
			}
			
			arr[j + 1] = key;
		}
	}
	
	public static void printArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = {9, 15, 74, 0, -3};
		
		printArr(arr);
		
		insSort(arr);
		
		System.out.println();
		
		printArr(arr);
	}

}
