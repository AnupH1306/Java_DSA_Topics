package Arrays_Problems;

public class PairOfGivenSum {
	
	public static void main(String [] args) {
		
		
		int []arr = {2,7,11,15};
		int target = 1;
		
		int i=0;
		int j= arr.length-1;
		
		
		while(i < j) {
			
			if(arr[i] + arr[j] == target) {
				System.out.println("true");
				break;
			}else if(arr[i] + arr[j] > target) {
				j--;
			}else {
				i++;
			}
		}
		
		if(j <= i) {
			System.out.println("False");
		}
	}

}
