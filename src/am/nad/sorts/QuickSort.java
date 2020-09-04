package am.nad.sorts;

public class QuickSort {

	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for(int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				
				int temp =arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
			int temp = arr[i+1];
			arr[i+1] = arr[high];
			arr[high] = temp;
		}
		
		return i + 1;
	}
	
	public static void sort(int arr[], int low, int high) {
		if (low < high) {
			int partIndex = partition(arr, low, high);
			
			sort(arr, low, partIndex - 1);
			sort(arr, partIndex + 1, high);
		}
	}
	
	public static void printArr(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = {10, 52, -100, 785, 0, 11};
		
		printArr(arr);
		
		sort(arr, 0, arr.length - 1);
		
		printArr(arr);
	}

}
