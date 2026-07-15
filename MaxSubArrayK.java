package Arrays_Problems;

public class MaxSubArrayK {
	
	public static void main(String[] args) {
		int [] arr = {4,5,6,7,8,9,0,0,0,1,4,5,2,};
		int k = 3;
		if(arr == null || arr.length == 0 || k > arr.length || k <= 0) {
			System.out.println("Define Specific data");
		}
		
		int windowSum =0;
		
		for(int i=0;i<k;i++) {
			windowSum += arr[i];
		}
		
		int maxSum = windowSum;
		
		for(int i=k; i<arr.length;i++){
			windowSum += arr[i];
			windowSum -= arr[i-k];
			
			maxSum = Math.max(maxSum, windowSum);
		}
		
		System.out.println("Max Sum of K SubArray is: " + maxSum);
	}

}
