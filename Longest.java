package Arrays_Problems;

import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);

        if(nums.length == 0) return 0;
        int longest = 1;
        int cnt = 0;
        int last_smaller = Integer.MIN_VALUE;

        for(int i=0; i<nums.length;i++){

            if(nums[i]-1 == last_smaller){
                cnt++;
                last_smaller = nums[i];
            }else if(nums[i] != last_smaller){
                cnt = 1;
                last_smaller = nums[i];
            }

            longest = Math.max(longest, cnt);
        }
        return longest;
    }
}

public class Longest {
	
	public static void main(String [] args) {
		int[] arr = {100, 4, 101,3 ,1};
		Solution sol = new Solution();
		int ans = sol.longestConsecutive(arr);
		System.out.println(ans);
	}
}
