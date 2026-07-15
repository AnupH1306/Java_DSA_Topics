package Arrays_Problems;

public class ThirdLargest {
	
	public static void main(String[] args) {
		
		//Declare An Array(Must be Greater than zero;
		int[] arr = {};
		
		int first = -1;
		int second =-1; 
		int third = -1;
		
		for(int i=0; i<arr.length;i++) {
			
			
			//Skips duplicate elements
			if(arr[i] == first || arr[i] == second || arr[i] == third ) {
				continue;
			}
			
			if(arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			}
			
			else if(arr[i]> second) {
				third = second;
				second = arr[i];
			}else if(arr[i] >third){
				third = arr[i];
			}
		}
		
		if(third == -1) {
			System.out.println("No element");
		}else {
			System.out.println("Third Largest Elemet is: " + third);
		}
	}

}
