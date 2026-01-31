import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class nextSmallestRight {
    public static void main(String[] args) {
        int num[] = { 4, 5, 2, 10, 8 };
        int n = num.length;
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() > num[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                list.add(st.peek());
            } else {
                list.add(-1);
            }

            st.push(num[i]);

        }

        Collections.reverse(list);
        System.out.println(list);
    }
}
