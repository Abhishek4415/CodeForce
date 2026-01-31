import java.util.ArrayList;
import java.util.Stack;

public class nextgreaterLeft {
    public static void main(String[] args) {
        int num[] = { 2, 1, 4, 3, 2 };
        int n = num.length;
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek() < num[i]){
                st.pop();
            }

            if(!st.isEmpty()){
                list.add(st.peek());
            }else{
                list.add(-1);
            }

            st.push(num[i]);
        }

        System.out.println(list);
    }

}
