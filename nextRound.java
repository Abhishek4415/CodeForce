//https://codeforces.com/problemset/problem/158/A

import java.util.Scanner;

public class nextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr  = new int[n+1];
        int c = 0;
        for (int i= 1;i<=n;i++) {
            arr[i] = sc.nextInt();
            
          
            
        }

        for(int i=1;i<=n;i++){
              if(arr[i] >= arr[k] && arr[i] > 0){
                c++;
            }



        }
        System.out.println(c);
    }
    
}
