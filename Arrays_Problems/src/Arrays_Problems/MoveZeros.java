package Arrays_Problems;

public class MoveZeros {
	
	public static void main(String [] args) {
		
		int [] arr = {0,0,1,2,3,4,5,6,6};
		
		int i=1;
		int j=0;
		int temp =0;
		
		while(i<arr.length && j<i) {
			
			if(arr[i] !=0 && arr[j]==0) {
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;;
			}else {
				i++;
			}
		}
	
	for(i=0; i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	}

}
