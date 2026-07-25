package Arrays_Problems;

import java.util.ArrayList;

public class UniofTwoArrays {
	
	public static void main(String[] args) {
		
		int [] nums1 = {1,2,3,3,4,5};
		int [] nums2 = {2,2,4,4,5,6,};
		
		ArrayList<Integer> al = new ArrayList<>();
		
		int m = nums1.length;
		int n = nums2.length;
		
		int i=0, j=0, k=0;
		
		
		while(i < m && j < n) {
			if(nums1[i] <= nums2[j]) {
				if(al.size() ==0 || al.get(k-1) != nums1[i]) {
					al.add(nums1[i]);
					k++;
				}
				i++;
			}else {
			if(al.size() == 0 || al.get(k-1) != nums2[j]) {
				al.add(nums2[j]);
				k++;
			}
			j++;
		}
	}
		
		while(i < m ) {
			if(al.size() == 0 || al.get(k-1)!= nums1[i]) {
				al.add(nums1[i]);
				k++;
			}
			i++;
		}
		while(j < n ) {
			if(al.size() == 0 || al.get(k-1)!= nums2[j]) {
				al.add(nums2[j]);
				k++;
			}
			j++;
		}
		for(i=0; i<k;i++) {
			System.out.println(al.get(i));
		}
	}

}
