class Solution {
    public void setZeroes(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        
        int[][] temp = new int[row][col];

      //  First copy original array to temp
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp[i][j] = arr[i][j];
            }
        }

        // Mark zeroes in temp
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 0) {
                    // Set entire row to zero
                    for (int k = 0; k < col; k++) {
                        temp[i][k] = 0;
                    }
                    // Set entire column to zero
                    for (int k = 0; k < row; k++) {
                        temp[k][j] = 0;
                    }
                }
            }
        }

        // Copy temp back to arr
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = temp[i][j];
            }
        }
    }
}
