package BinarySearch;

public class Test240_Search_a_2D_Matrix_II {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int row = matrix.length - 1, col = 0;

            while (row >= 0 && col < matrix[0].length) {
                int val = matrix[row][col];

                if (target == val) {
                    return true;
                }
                else if (target > val) {
                    col++;
                }
                else {
                    row--;
                }
            }
            return false;
        }
    }
}
