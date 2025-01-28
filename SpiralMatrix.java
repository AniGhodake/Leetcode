class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();

        if(matrix == null || matrix.length == 0){
            return arr;
        }

        int rowSize = matrix.length;
        int colSize = matrix[0].length;

        int top = 0;
        int bottom = rowSize -1;
        int left = 0;
        int right = colSize -1;


        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                arr.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i <= bottom; i++){
                arr.add(matrix[i][right]);
            }
            right--;

             if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    arr.add(matrix[bottom][i]);
                }
                bottom--; // Move bottom boundary up
            }

            // Traverse from bottom to top (if columns remain)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr.add(matrix[i][left]);
                }
                left++; // Move left boundary right
            }
        }

        return arr;
       
    }
}