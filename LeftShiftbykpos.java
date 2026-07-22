package Arrays_Problems;

import java.util.Arrays;

class Optimal{
	
	public static void optimalSolution(int[] arr, int start, int end) {
		int temp =0;
		while(start<=end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}

public class LeftShiftbykpos {
	
	
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7,8};
		int k = 3;
		
		k = k%arr.length;
		
//		int temp[] = new int[k];
//		
//		for(int i=0;i<k; i++) {
//			temp[i] = arr[i];
//		}
//		
//		for(int i=k;i<arr.length;i++) {
//			arr[i-k] = arr[i];
//		}
//		
//		for(int i=arr.length-k;i<arr.length;i++) {
//			arr[i] = temp[i-(arr.length-k)];
//		}
		Optimal.optimalSolution(arr,0,k-1);
		Optimal.optimalSolution(arr,k,arr.length-1);
		Optimal.optimalSolution(arr, 0, arr.length-1);
//		System.out.println(Arrays.toString(arr));
	}

}
