package Arrays_Problems;

public class NextPermutation {
	
	public static  int[] reverse(int[] arr, int start, int end) {
		
		while(start <= end ) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {4,2,3,5,7,1};
		
		int ind = -1;
		
		int n = arr.length;
		
		for(int i = n-2; i>=0; i--) {
			if(arr[i] < arr[i+1]) {
				ind = i;
				break;
			}
		}
		
		if(ind == -1) {
			arr = reverse(arr, 0, n-1);
			
		}else {
			for(int i=n-1;i>ind;i--) {
				if(arr[i]>arr[ind]) {
					int temp = arr[i];
					arr[i] =arr[ind];
					arr[ind] = temp;
					break;
				}
			}
			arr = reverse(arr, ind+1, n-1);
		}

		for(int i=0; i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
