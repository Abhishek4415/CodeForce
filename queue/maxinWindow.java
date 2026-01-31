package queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

//max in every winow of size k
public class maxinWindow {
    public static void main(String[] args) {
        int arr[] = { 1,3,-1,-3,5,3,6,7 };
        int k = 4;
        Deque<Integer> dq = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        //no of window = n - k +1
        for (int i = 0; i < arr.length; i++) {
            if (!dq.isEmpty() &&  dq.peekFirst() == i - k) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.removeLast();
            }

            dq.addLast(i);
            // 4. Add max to output once window size reached
            if(i >= k - 1) {
                list.add(arr[dq.peekFirst()]);
            }

        }

        System.out.println(list);

    }

}