
//
import java.util.*;

public class tableWithNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int h = sc.nextInt();
            int l = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }

            int count = 0;
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= l; j++) {
                    if (map.getOrDefault(i, 0) > 0 && map.getOrDefault(j, 0) > 0) {
                        count++;
                        map.put(i, map.getOrDefault(i, 0) - 1);
                        map.put(j, map.getOrDefault(j, 0) - 1);

                    }

                }

            }

            System.out.println(count);

        }

    }

}
