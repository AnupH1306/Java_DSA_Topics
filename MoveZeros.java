package Arrays_Problems;

public class MoveZeros {
	
	public static void main(String [] args) {
		int[] arr = {1,0,2,0,3};
		int i=1;
		int j=0;
		int temp =0;
		while (i < arr.length && j < i) {

		    if (arr[i] != 0 && arr[j] == 0) {
		    	  temp = arr[i];
		         arr[i] = arr[j];
		         arr[j] = temp;
		        i++;
		        j++;
		    }
		    else if (arr[j] == 0) {
		        i++;
		    }
		    else {
		        i++;
		        j++;
		    }
		}
	
	for( i=0; i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	}

}
