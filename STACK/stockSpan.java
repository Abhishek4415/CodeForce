import java.util.ArrayList;
import java.util.Stack;

public class stockSpan {
    public static void main(String[] args) {
        int num[] = { 100, 80, 60, 70, 60, 75, 85 };
        int n = num.length;
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            //next left greatest
            //pop -num[ st.peek()] < curr
            //stack me index add karo 
            while(!st.isEmpty() && num[st.peek()] < num[i]){
                st.pop();
            }

            //if !empty then span = i - st.peek()
            if(!st.isEmpty()){
                list.add(i - st.peek());
            }else{
                list.add(1);
            }

            st.push(i);
        }

        System.out.println(list);

    }
}
