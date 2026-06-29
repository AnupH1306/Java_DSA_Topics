package Arrays_Problems;

public class Remove_Duplicate {
	
	public static void main(String[] args) {
		
		//take an array
		int []arr = {1,1,2,2,3};
		
		//Take variable j & i And initialize it to 0 & 1.
		int j=0;
		int i=1;
		
		//Traverse upto n-1.
		for(;i<arr.length;i++) {
			
			//Check Duplicate
			if(arr[j] != arr[i]) {
				
				//Replace duplicate element
				arr[++j] = arr[i];
			}
		}
		
		//Print final array upto the j that we are removed duplicates.
		for(int k=0;k<=j;k++) {
			System.out.println(arr[k]);
		}
	}

}
