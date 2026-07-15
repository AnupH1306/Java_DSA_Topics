package Arrays_Problems;

public class MaxsumSubarray {
	
	public static int maxSubArraySum(int[] arr) {
		
		int sum =arr[0];// ---> Store first element as sum
		int maxSum = arr[0];// ---> Store first element as maxSum
		
		//Start loop from 1 And upto n-1
		for(int i=1; i<arr.length;i++) {
			
			//Track the sum
			sum = Math.max(arr[i], sum + arr[i]);
			
			//Track the current Maximum Sum
			maxSum = Math.max(maxSum, sum);
		}
		
		return maxSum;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		
		
		int result = maxSubArraySum(arr);
		System.out.println("Max of Sub Array Sum is, " + result);// --> we will get our result.
		
	}

}
