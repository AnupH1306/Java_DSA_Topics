package Arrays_Problems;

import java.util.Arrays;

public class Shift_arraybykpositions {
	
	public static void main(String[] args) {
		
		int []arr = {1,2,3,4,5,6,7,8};
		int k = 5;
		
		k = k%arr.length;
		
		if(k > arr.length) {
			System.out.println("K must be either less than or equal to arr.length");
		}
		
		int i=0;
		int j=arr.length-1;
		int temp =0;
		
		while(i<j) {
			temp =arr[i];
			arr[i] =arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		i=0;
		j=k-1;
		
		while(i<j) {
			temp = arr[i];
			arr[i]=arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		i=k;
		j=arr.length-1;
		
		while(i<j) {
			temp =arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		System.out.print(Arrays.toString(arr));
	}

}
