
import java.util.*;

public class shiftedMEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            int best = 1;
            int cur = 1;

            for (int i = 1; i < n; i++) {
                if (a[i] == a[i - 1]) continue;        // skip duplicates
                if (a[i] == a[i - 1] + 1) {
                    cur++;
                } else {
                    cur = 1;
                }
                best = Math.max(best, cur);
            }

            System.out.println(best);
        }

        sc.close();
    }
}
