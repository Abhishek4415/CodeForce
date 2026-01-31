import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class largestRectangle {
    public static void main(String[] args) {
        int[] heights = {1,1};
        int n = heights.length;
        if(n==1){
            System.out.println(1);
        }
        // NSR -- n-1 to 0
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> nsrlist = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) { // curr > peek() hona chahiye nahi toh pop
                st.pop();
            }
            if (!st.isEmpty()) {
                nsrlist.add(st.peek());
            } else {
                nsrlist.add(n);
            }

            st.push(i);
        }
        Collections.reverse(nsrlist);
        System.out.println(nsrlist);

        st.clear(); // if stack is not empty

        // NSL -- o to n
        ArrayList<Integer> nsllist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) { // curr > peek() hona chahiye nahi toh pop
                st.pop();
            }
            if (!st.isEmpty()) {

                nsllist.add(st.peek());

            } else {
                nsllist.add(-1);
            }

            st.push(i);
        }

        System.out.println(nsllist);
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int width = (nsrlist.get(i) - nsllist.get(i) - 1);
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);

        }

        System.out.println(maxArea);
    }

}
