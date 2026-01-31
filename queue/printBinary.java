package queue;
import java.util.LinkedList;
import java.util.Queue;


public class printBinary {
        public static void main(String[] args) {
        int arr[] = {1,2,3};
        int n = 10; //10 first n natural number in binary number
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        int c = 0;
        while(true){
            int x = q.peek();
            if(x>0){
                System.out.println(x);
                c++;
            }

            q.poll();
            q.add(x*10+0);
            q.add(x*10+1);
            if(c==n)break;

           
            


        }

    } 
    
}

