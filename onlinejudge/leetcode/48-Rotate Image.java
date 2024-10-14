class Solution {
    public void rotate(int[][] matrix) {
        int width = matrix[0].length;
        int height = matrix.length;
        int[][] arr = new int[width][height];
        
        for (int i = 0; i < width; i += 1) {
            for (int j = 0; j < height; j += 1) {
                arr[j][width - 1 - i] = matrix[i][j];
            }
        }

        for (int i = 0; i < width; i += 1) {
            for (int j = 0; j < height; j += 1) {
                matrix[i][j] = arr[i][j];
            }
        }
    }
}
