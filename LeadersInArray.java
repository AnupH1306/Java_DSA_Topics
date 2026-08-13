package Arrays_Problems;

import java.util.ArrayList;

public class LeadersInArray {
	
	public static void main(String[] args) {
		
		int[] arr = {10,22,14,16,1,4,3};
		ArrayList<Integer> ans = new ArrayList<>();
		int max = arr[arr.length-1];
		ans.add(arr[arr.length-1]);
		for(int i=arr.length-2; i>=0;i--) {
			if(max < arr[i]) {
				max = arr[i];
				ans.add(max);
			}
		}
			
		for(int i=0; i<ans.size();i++) {
			System.out.println(ans.get(i));
		}
	}

}
