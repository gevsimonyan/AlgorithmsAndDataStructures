package am.nad.search;

public class JumpSearch {

	public static int jumpSearch(int arr[], int target) {
		int size = arr.length;
		
		int step = (int)Math.floor(Math.sqrt(size));
		int prev = 0;
		
		while (arr[Math.min(step, size) - 1] < target) {
			prev = step;
			step += (int)Math.floor(Math.sqrt(size));
			if (prev > size) {
				return -1;
			}
		}
		
		while (arr[prev] < target) {
			prev++;
			
			if (prev == Math.min(step, size)) {
				return -1;
			}
		}
		if(arr[prev] == target) {
			return prev;
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		int[] arr = new int[1000];
		for (int i = 0; i < 1000; i++) {
			arr[i] = i - 7;
		}
		int target = 325;
		int result = jumpSearch(arr,target);
		System.out.println(result);
		if (result == -1) {
			System.out.println("Element not found");
		}
	}

}
