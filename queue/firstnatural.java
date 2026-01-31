package queue;

import java.util.LinkedList;
import java.util.Queue;

public class firstnatural {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int n = 10; //10 first natural number
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        int c = 0;
        while(true){
            int x = q.peek();
            if(x>0){
                System.out.println(x);
                c++;
            }

            q.poll();
            q.add(x*10+1);
            q.add(x*10+2);
            q.add(x*10+3);
            if(c==n)break;

           
            
        }

    }
    
}
