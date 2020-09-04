package am.nad.sorts;

public class MergeSort {

	public static void merge(int arr[], int l, int m, int r) {
		int s1 = m - l + 1;
		int s2 = r - m;
		
		int temp1[] = new int[s1];
		int temp2[] = new int[s2];
		
		for(int i = 0; i < s1; i++) {
			temp1[i] = arr[l+i];
		}
		for(int j = 0; j < s2; j++) {
			temp2[j] = arr[m + 1 + j];
		}
		
		int i = 0;
		int j = 0;
		
		int index = l;
		
		while (i < s1 && j < s2) {
			if (temp1[i] <= temp2[j]) {
				arr[index] = temp1[i];
				i++;
			} else {
				arr[index] = temp2[j];
				j++;
			}
			
			index++;
		}
		
		while (i < s1) {
			arr[index] = temp1[i];
			i++;
			index++;
		}
		
		while (j < s2) {
			arr[index] = temp2[j];
			j++;
			index++;
		}
	}
	
	public static void sort(int arr[], int l, int r) {
		if (l < r) {
			int m = (l+r)/2;
			
			sort(arr, l, m);
			sort(arr, m+1, r);
			
			merge(arr, l, m, r);
		}
	}
	
	public static void printArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = {9, 5, 7, 6, 10, 3};
		
		printArr(arr);
		
		sort(arr, 0, arr.length - 1);
		System.out.println();
		printArr(arr);
	}

}
