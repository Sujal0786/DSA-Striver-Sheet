import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();
            long value = 1;

            for (int col = 0; col <= row; col++) {
                currentRow.add((int) value);
                value = value * (row - col) / (col + 1);
            }

            triangle.add(currentRow);
        }

        return triangle;
    }
}