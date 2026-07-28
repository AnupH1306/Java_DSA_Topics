package Arrays_Problems;

public class FindSingleElement {
	
	public static void main(String[] args) {
		//Brute Force Solution
		int []arr = {1,1,2,2,3,4,4,5,5};
		
		int cnt = 0;
		int num = 0;
		for(int i=0; i<arr.length;i++) {
			 num = arr[i];
			 
			 for(int j =0;j<arr.length;j++) {
				 if(arr[j] == num) {
					 cnt++;
				 }
			 }
			 if(cnt == 1) {
				 System.out.println(arr[i]);
				 break;
			 }
			 cnt = 0;
		}
		
		
		
		if(cnt == 0) {
			System.out.println("No element found with one appearence");
		}
		
	}

}
