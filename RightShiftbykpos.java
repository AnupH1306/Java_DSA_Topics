package Arrays_Problems;

import java.util.Arrays;

public class RightShiftbykpos {
    
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        
        // 1. ALWAYS calculate effective shifts first
        k = k % arr.length;
        
        // Handle edge case where k is 0 or multiple of array length
        if (k == 0) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        
        // 2. Instantiate temp with correct normalized size
        int[] temp = new int[k];
        
        // 3. Save the last k elements in CORRECT order
        for (int i = 0; i < k; i++) {
            temp[i] = arr[arr.length - k + i];
        }
        
        // 4. Shift the remaining elements to the right
        for (int i = arr.length - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }
        
        // 5. Place temp elements into the front
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
        
        System.out.println(Arrays.toString(arr));
    }
}