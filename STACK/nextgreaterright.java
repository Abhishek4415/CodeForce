
//NEXT GREATER ELEMENT
import java.util.*;
public class nextgreaterright{
    public static void main(String[] args){
        int num[] = {2,1,4,3,5};
        int n = num.length;
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            //when st.top() < curr - pop while
            while(!st.isEmpty() && st.peek() < num[i]){
                st.pop();
            }
            
            //when stack is not empty - st.peek()
            //when stack is empty - -1
            if(!st.isEmpty()){
                list.add(st.peek());
            }else{
                list.add(-1);
            }

            st.push(num[i]);

        }
        
        Collections.reverse(list);
        System.out.println(list);

    }
}