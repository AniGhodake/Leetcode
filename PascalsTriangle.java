class Solution {
    public List<List<Integer>> generate(int numRows) {
         // Create a list to hold the rows of Pascal's Triangle
        List<List<Integer>> triangle = new ArrayList<>();

        // Generate each row
        for (int rowIndex = 0; rowIndex < numRows; rowIndex++) {
            // Create a new row
            List<Integer> row = new ArrayList<>();
            // The first element is always 1
            row.add(1);

            // Each triangle element (except the first and last) is the sum of the two elements above it
            if (rowIndex > 0) {
                List<Integer> previousRow = triangle.get(rowIndex - 1);
                for (int j = 1; j < rowIndex; j++) {
                    row.add(previousRow.get(j - 1) + previousRow.get(j));
                }
                // The last element is always 1
                row.add(1);
            }

            // Add the current row to the triangle
            triangle.add(row);
        }

        return triangle;
    }
}