package Arrays_Problems;


//Problem represent the array Always start from 1 to n-1;
//Example: int[] arr = {1,2,3,5,6}--> missing number is 4 or {1}-- missing number is 2

public class Missing_Number {
	
	public static void main(String[] args) {
		
		//Initialize An Array;
		int[] arr = {};
		
		//Take An 2 Variable one for array traversal sum And Another for max element in array;
		int sum  = 0;
		int max = 0; //--> this will find max element we will get to know that array is from 1 to max
		
		for(int i=0; i<arr.length;i++) {
			sum += arr[i];
			max = Math.max(max, arr[i]);//--> we got max;
		}
		
		//Take Total_Sum as variable to find sum upto that max.
		int total_sum = (max * (max-1))/2;// --> calculate sum from 1 to max(it help to find missing number).
		
		//Here we will get missing number.
		int ans = total_sum - sum; //--> sum(Only element from 1 to max but one no. is missing).
		
		if(ans == 0); //--> No missing number upto that range here the missing number is max = 1(The Upcoming one).
		
		System.out.println(ans);
		
		//NOTE:
		//If input it too large or Big replace "int" Data type with "long" for better optimization.
		//
		//Added new3 line
		
	}
	

}
