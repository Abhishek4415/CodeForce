import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;

public class arraycoloring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            HashMap<Integer, String> map = new HashMap<>();
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (i % 2 != 0) {
                    map.put(arr[i], "red");
                } else {
                    map.put(arr[i], "blue");

                }
            }

            Arrays.sort(arr);
            boolean x = true;
            for(int i=1;i<n;i++){
                if(map.get(arr[i]) == map.get(arr[i-1])){
                    x = false;
                }
            }

            if(x){
                System.out.println("YES");

            }else{
                System.out.println("NO");
            }



                
                



        }

    }
}
