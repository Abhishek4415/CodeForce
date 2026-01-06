import java.util.Scanner;
//https://codeforces.com/problemset/problem/855/B


public class Marvolo855b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long p = sc.nextLong();
        long q = sc.nextLong();
        long r = sc.nextLong();
        long arr[]= new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
        }

        long[] prefixMax = new long[n];
        long[] suffixMax = new long[n];
        //i<j<k
        //step 1 prefixMax
        // Prefix max
        prefixMax[0] = arr[0] * p;
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], arr[i]*p);
        }

        //STEP 2 Suffix max
        suffixMax[n - 1] = arr[n - 1] * r;
        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], arr[i] * r);
        }
        
        //final step
        long ans = Long.MIN_VALUE;
        for(int i=0;i<n;i++){  //mid get first
            long x = prefixMax[i] + arr[i] * q + suffixMax[i];
            ans = Math.max(ans,x);

        }


        System.out.println(ans);

        sc.close();

      
        
    }
}
