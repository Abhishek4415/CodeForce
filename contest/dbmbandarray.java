import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class dbmbandarray{
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            int s = sc.nextInt();
            int x = sc.nextInt();
            int arr[] = new int[n];
            int sum = 0;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                sum+=arr[i];
            }

            boolean ans = false;

            if(sum == s){
                ans = true;
            }else{
                for(int i=0;i<100;i++){
                    sum+=x;
                    if(sum == s){
                        ans = true;
                    }
                }
            }


            if(ans){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

            






        }
    }
}