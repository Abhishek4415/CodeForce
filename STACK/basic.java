
import java.util.Stack;

public class basic {
    public static void main(String[] args) {
        Stack<Integer>  st = new Stack<>();

        st.push(5);
        st.push(6);
        // System.out.println(st.pop());  //output - 6
        //System.out.println(st.peek()); //output - 6
        System.out.println(st); //output:- [5,6] 

        while(!st.isEmpty()){
            System.out.println(st.pop());
        }


    }
    
}
