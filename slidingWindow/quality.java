
//https://codeforces.com/problemset/problem/1646/B
import java.util.*;

public class quality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextLong();

            Arrays.sort(arr);

            boolean ok = false;

            Long prefix[] = new Long[n];
            Long suffix[] = new Long[n];
            prefix[0] = arr[0];
            suffix[n - 1] = arr[n - 1];
            for (int i = 1; i < n; i++) {
                prefix[i] = prefix[i - 1] + arr[i];

            }

            for (int i = n - 2; i >= 0; i--) {
                suffix[i] = suffix[i + 1] + arr[i];
            }

            int left = n-1;
            long sumBlue = 0;
            long sumRed = 0;
            for(int right=1;right<n;right++){
                sumBlue = prefix[right];
                sumRed = suffix[left];
                if(left > right){

                    if (sumBlue < sumRed) {
                        ok = true;
                    }
    
                    if (sumBlue >= sumRed) {
                        left--;
                    }
                    
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }
    }
}
