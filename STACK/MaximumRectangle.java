import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class MaximumRectangle {

    // This function finds the maximum rectangle area in a histogram
    public static int hist(int[] heights) {

        // Total number of bars in histogram
        int n = heights.length;

        // Stack to store indices of bars
        Stack<Integer> st = new Stack<>();

        // NSR = Nearest Smaller to Right
        ArrayList<Integer> nsrlist = new ArrayList<>();

        // Traverse histogram from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Remove all bars from stack which are
            // greater than or equal to current bar
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            // If stack is not empty, top is nearest smaller to right
            if (!st.isEmpty()) {
                nsrlist.add(st.peek());
            }
            // If stack is empty, no smaller bar on right
            else {
                nsrlist.add(n);
            }

            // Push current index into stack
            st.push(i);
        }

        // Reverse list because we traversed from right to left
        Collections.reverse(nsrlist);

        // Clear stack before reusing
        st.clear();

        // NSL = Nearest Smaller to Left
        ArrayList<Integer> nsllist = new ArrayList<>();

        // Traverse histogram from left to right
        for (int i = 0; i < n; i++) {

            // Remove all bars from stack which are
            // greater than or equal to current bar
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            // If stack is not empty, top is nearest smaller to left
            if (!st.isEmpty()) {
                nsllist.add(st.peek());
            }
            // If stack is empty, no smaller bar on left
            else {
                nsllist.add(-1);
            }

            // Push current index into stack
            st.push(i);
        }

        // Variable to store maximum area
        int maxArea = 0;

        // Calculate area for each bar
        for (int i = 0; i < n; i++) {

            // Width = right boundary - left boundary - 1
            int width = nsrlist.get(i) - nsllist.get(i) - 1;

            // Area = height * width
            int area = heights[i] * width;

            // Store maximum area
            maxArea = Math.max(maxArea, area);
        }

        // Return maximum area for this histogram
        return maxArea;
    }

    public static void main(String[] args) {

        // Given binary matrix
        char[][] mat = {
            {'1','0','1','0','0'},
            {'1','0','1','1','1'},
            {'1','1','1','1','1'},
            {'1','0','0','1','0'}
        };

        // This matrix will store histogram heights
        int[][] heights = new int[mat.length][mat[0].length];

        // Build histogram column-wise
        for (int i = 0; i < mat[0].length; i++) {

            int count = 0;

            // Traverse rows
            for (int j = 0; j < mat.length; j++) {

                // If current cell is '1', increase height
                if (mat[j][i] == '1') {
                    count++;
                }
                // If '0', reset height
                else {
                    count = 0;
                }

                // Store height
                heights[j][i] = count;
            }
        }

        // Variable to store final answer
        int ans = 0;

        // Apply histogram method on each row
        for (int i = 0; i < heights.length; i++) {

            int area = hist(heights[i]);

            // Store maximum rectangle area
            ans = Math.max(ans, area);
        }

        // Print final maximum rectangle area
        System.out.println(ans);
    }
}
