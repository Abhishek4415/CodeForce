import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class permutationReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            int l = -1, r = -1;

            for (int i = 0; i < n; i++) {
                int bvalue = -1, bpos = -1;

                for (int j = i + 1; j < n; j++) {
                    if (a[j] > a[i] && a[j] > bvalue) {
                        bvalue = a[j];
                        bpos = j;
                    }
                }

                if (bpos != -1) {
                    l = i;
                    r = bpos;
                    break;
                }
            }
            if (l == -1) {
                for (int x : a)
                    System.out.print(x + " ");
                System.out.println();
                continue;
            }

            while (l < r) {
                int temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r--;
            }

            for (int x : a)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}
