package Arrays_Problems;

public class SortColors {
	
	public static void main(String[] args) {
		int[] arr = {0,1,2,0,2,1};
		int mid = 0;
		int low = 0;
		int high = arr.length-1;
		
		int temp = 0;
		
		while(mid <= high) {
			if(arr[mid] == 0) {
				temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				low++;
				mid++;
			}else if(arr[mid] == 1) {
				mid++;
			}else {
				temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
		}
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
