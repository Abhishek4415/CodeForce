import java.util.HashMap;
import java.util.Scanner;

public class mexReordering {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            HashMap<Integer,Integer> map = new HashMap<>();
            //freq count
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }

            if(map.getOrDefault(0,0) == 0){
                System.out.println("NO");
            }else if(map.getOrDefault(0,0)== 1){
                System.out.println("YES");

            }else if(map.getOrDefault(1,0)== 0){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
            
            
        }


    }
}
