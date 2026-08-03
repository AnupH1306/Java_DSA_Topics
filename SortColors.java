package Arrays_Problems;

public class SortColors {
	
	public static void main(String[] args) {
		
		//Brute Force Solution
		int[] arr = {0,1,2,0,2,1};
		
		int cnt0=0;
		int cnt1=0;
		int cnt2=0;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==0) {
				cnt0++;
			}else if(arr[i] == 1) {
				cnt1++;
			}else {
				cnt2++;
			}
		}
		
		for(int i=0; i<cnt0;i++) {
			arr[i] = 0;
		}
		
		for(int i=cnt0; i<arr.length-cnt2;i++) {
			arr[i] =1;
		}
		
		for(int i = arr.length-cnt2; i<arr.length;i++) {
			arr[i] =2 ;
		}
//		int mid = 0;
//		int low = 0;
//		int high = arr.length-1;
//		
//		int temp = 0;
//		
//		while(mid <= high) {
//			if(arr[mid] == 0) {
//				temp = arr[mid];
//				arr[mid] = arr[low];
//				arr[low] = temp;
//				low++;
//				mid++;
//			}else if(arr[mid] == 1) {
//				mid++;
//			}else {
//				temp = arr[mid];
//				arr[mid] = arr[high];
//				arr[high] = temp;
//				high--;
//			}
//		}
//		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
