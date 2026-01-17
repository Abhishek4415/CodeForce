import java.util.*;

public class oddqueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while(T-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            
            int[] prefix = new int[n];
            prefix[0] = arr[0];
            for(int i = 1; i < n; i++){
                prefix[i] = prefix[i-1] + arr[i];
            }
            
            while(q-- > 0){
                int l = sc.nextInt() - 1; 
                int r = sc.nextInt() - 1;
                int k = sc.nextInt();
                
                int originalSum = prefix[r] - (l == 0 ? 0 : prefix[l-1]);
                int totalOriginal = prefix[n-1];

                int replaced = totalOriginal - originalSum + (r - l + 1) * k;

                System.out.println(replaced % 2 != 0 ? "YES" : "NO");
            }
        }
        
    }
}
