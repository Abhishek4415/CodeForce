import java.util.HashMap;
import java.util.Scanner;
public class sameDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            //o(n2) 
            //pair nc2 n(n-1)/2

            // int count = 0;
            // for(int i=0;i<n;i++){
            //     for(int j=i+1;j<n;j++){   //i+1 reason j > i
            //         int diff = arr[j] - arr[i];
            //         if(diff == (j - i)){
            //             count++;
            //         }
                


            //     }
            // }

            //System.out.println(count);

            //optimised

            HashMap<Long,Long> map = new HashMap<>();

            for(int i=0;i<n;i++){
                long key = arr[i] - i;
                map.put(key,map.getOrDefault(key,0L)+1);
            }

            long count = 0;

            for(Long k : map.keySet()){
                long a = map.get(k);
                count += (a * (a-1)) /2;

            }

            System.out.println(count);
         






        }


    
    }
    
}
