package Arrays_Problems;

public class LongestSubArrayK {
	
	public static void main(String [] args) {
		int k = 3;
		int[] arr = {1,2,3,0,0,0,0,3,3};
		int maxLen = 0;
		int sum = 0;
		
		int j= 0;
		int i = 0;
		while(i <arr.length && j < arr.length) {
			sum += arr[j];
			while( i <= j&& sum > k) {
				sum -= arr[i];
				i++;
			}
			
			if(sum == k) {
				maxLen = Math.max(maxLen, j-i+1);
			}
			j++;
		}
		
		System.out.println(maxLen);
	}

}
