import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MexRecording {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder ans = new StringBuilder();
        int t = sc.nextInt();
        while (t-- > 0) {
            HashMap<Integer, String> map = new HashMap<>();
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }
             int[] freq = new int[n + 5];
            for (int val : arr) {
                if (val <= n + 2) {
                    freq[val]++;
                }
            }

            // Find m = MEX of the whole multiset
            int m = 0;
            while (freq[m] > 0) {
                m++;
            }

            boolean bad = true;
            if (m == 0) {
                bad = false;
            } else {
                // Check if every number from 0 to m-1 appears at least twice
                boolean allAtLeastTwo = true;
                for (int i = 0; i < m; i++) {
                    if (freq[i] < 2) {
                        allAtLeastTwo = false;
                        break;
                    }
                }
                bad = allAtLeastTwo;
            }

            ans.append(bad ? "NO\n" : "YES\n");
        }


        
        System.out.print(ans);


    }
}
