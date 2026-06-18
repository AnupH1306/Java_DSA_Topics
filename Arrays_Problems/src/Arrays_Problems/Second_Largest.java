package Arrays_Problems;
//Second Largest
// Example int arr = {12,35,1,10,34,1} output = 34 (Array Should not be an empty).
public class Second_Largest {
	
	public static void main(String [] args) {
		
		//Declare array
		int[] arr = {12,35,1,10,34,1};
		
		//Now Initialize a variables
		int first = arr[0];
		int	second = 0;
		
		//Traverse through an for loop till (n-1).
		for(int i=1; i<arr.length;i++) {
			
			if(arr[i] == firts) {
				continue;
			}
			
			//Check for greatest element.
			if(arr[i] > first) {
				second = first; // May be second greatest element
				first = arr[i];
			}
			else {
				
				//May be second greatest element After the first.
				if(arr[i] > second) {
					second = arr[i];
				}
			}
			
		}
		
		//if all elements are same 
		if(second == 0) {
			System.out.println("No elemet found");
		}else {
		   System.out.println("Second Largest Element is :" + second);
		}
	}

}
