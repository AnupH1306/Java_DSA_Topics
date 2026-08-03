package Arrays_Problems;

public class PairOfGivenSum {
	
	public static void main(String [] args) {
		
		//Optimal Solution if array is sorted
		int []arr = {2,7,11,15};
		int target = 1;
		
//		int i=0;
//		int j= arr.length-1;
		
		
//		while(i < j) {
//			
//			if(arr[i] + arr[j] == target) {
//				System.out.println("true");
//				break;
//			}else if(arr[i] + arr[j] > target) {
//				j--;
//			}else {
//				i++;
//			}
//		}
//		
//		if(j <= i) {
//			System.out.println("False");
//		}
		
		//Brute force if Array is not Sorted.
		int i = -1; 
		int j = -1;
		for( i=0;i<arr.length;i++){
			for(j = i+1; j<arr.length;j++) {
				if(arr[i]+arr[j] == target) {
					System.out.println("Target exist At index:" + i +"," + j);
					break;
				}
			}
		}
		
	}

}
