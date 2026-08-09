package Arrays_Problems;

public class MaximumSubArraySum {
	
	public static void main(String[] args) {
		
		//Approaches to solve this problem 1. Brute force 1. Better 3. Optimal
		
		//Optimal Solution (kadene's Algorithm)
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		int max = Integer.MIN_VALUE;
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			
			if(sum > max) {
				max = Math.max(sum, max);
			}
			
			if(sum < 0) {
				sum = 0;
			}
		}
		System.out.println("Maximun Sub-Array Sum in the given array is:"+" "+ max);
	}

}
dskndrgztlhmzt,h]gmr;lgOerjgewG