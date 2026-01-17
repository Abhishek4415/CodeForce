// lecture sleep 960/
import java.util.*;
public class lectureSleep{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        int[] behavior = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            behavior[i] = sc.nextInt();
        }


        int alreadyAwake = 0;
        for(int i=0;i<n;i++){
            if(behavior[i] != 0){
                alreadyAwake += arr[i];

            }

        }
        int maxAwake = Integer.MIN_VALUE;
        int current_Sum = 0;
        //first window
        for(int j=0;j<k;j++){
            if(behavior[j] == 0) current_Sum += arr[j];

                
        }

        maxAwake = current_Sum;

        for(int i=k;i<n;i++){
            if(behavior[i] == 0) current_Sum += arr[i];
            if(behavior[i - k] == 0) current_Sum -= arr[i - k];
            maxAwake = Math.max(maxAwake, current_Sum);
        }

            

        System.out.println(maxAwake + alreadyAwake);
    }
}