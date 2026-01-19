import java.util.Scanner;

public class prefixMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int max = 0;
            int idx = -1;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (max < arr[i]) {
                    max = arr[i];
                    idx = i;
                }
            }

            int temp = arr[0];
            arr[0] = arr[idx];
            arr[idx] = temp;

            int maxSum = arr[0];

            for (int i = 0; i < n; i++) {
                int maxValue = 0;
                for (int j = 0; j < i; j++) {
                    maxValue = Math.max(arr[j], maxValue);
                }
                maxSum += maxValue;


            }

            System.out.println(maxSum);

        }
    }
}
