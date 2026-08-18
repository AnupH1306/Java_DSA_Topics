package Arrays_Problems;

import java.util.Scanner;

public class SetMatrixToZero {
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		int l = 4;
		int k = 4;
		int[][] matrix = new int[l][k];
//		
//		System.out.println("Fill the array with 0 And 1");
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<m;j++) {
//				matrix[i][j] = sc.nextInt();
//			}
//		}
//		
//		// Step 1: Track Matrix And find Zeros
////		for(int i=0;i<n;i++) {
////			for(int j=0;j<m;j++) {
////				if(matrix[i][j] == 0) {
////					markRow(i, m, matrix);
////					markCol(j, n, matrix);
////				}
////			}
////		}
////		
////		// Step 2: Convert all temporary -1 markers to 0 (THIS WAS MISSING)
////		for(int i=0;i<n;i++) {
////			for(int j=0;j<m;j++) {
////				if(matrix[i][j] == -1) {
////					matrix[i][j] = 0;
////				}
////			}
////		}
//		
//		
//		
//
//		// Step 3: Print the matrix
//		for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        sc.close();
//	}
//
//	public static void markRow(int i, int m, int[][] matrix) {
//		for(int j=0;j<m;j++) {
//			if(matrix[i][j] != 0) {
//				matrix[i][j] = -1;
//			}
//		}
//	}
//
//	public static void markCol(int j, int n, int[][] matrix) {
//		for(int i=0;i<n;i++) {
//			if(matrix[i][j] != 0) {
//				matrix[i][j] = -1;
//			}
//		}
		
		
		 int col0 = 1;
	        int n = matrix.length;
	        int m = matrix[0].length;
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                if(matrix[i][j] == 0){
	                    matrix[i][0] = 0;

	                if( j != 0){
	                    matrix[0][j] = 0;
	                }else{
	                    col0 = 0;
	                }
	                }
	            }
	        }

	        for(int i=1;i<n;i++){
	            for(int j=1;j<m;j++){
	                if(matrix[i][j] != 0){
	                    if(matrix[0][j] == 0 || matrix[i][0] == 0){
	                        matrix[i][j] =0;
	                    }
	                }
	            }
	        }

	        if(matrix[0][0] == 0){
	            for(int j=0;j<m;j++){
	                matrix[0][j] = 0;
	            }
	        }

	        if(col0 == 0){
	            for(int i=0;i<n;i++){
	                matrix[i][0] = 0;
	            }
	        }
	}
}