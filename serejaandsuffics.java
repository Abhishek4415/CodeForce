// 368/b
//arr[n] = {1,2,3,1,2}
//marr[m] = {1,2,3}
//after every index in m value m[0] = 1 arr[1] and to n get distinct number is -

import java.util.HashSet;
import java.util.Scanner;

public class serejaandsuffics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> distinctValue = new HashSet<>();
        
        //=====================================TLE=======================
        // for (int i = 1; i <= m; i++) {
        //     int x = sc.nextInt();
        //     HashSet<Integer> distinctValue = new HashSet<>();
        //     int distinct = 0;
        //     for(int j=x;j<=n;j++){
        //         if(!distinctValue.contains(arr[j])){
        //             distinctValue.add(arr[j]);
        //             distinct++;
        //         }

        //     }

        //     System.out.println(distinct);

        // }

        //=======================================SUFFIX
        //WHAT MY FEAR IS HOW I CHANGE HASHSET FOR DIFFERENT INDEX
        //MEAN AT INDEX 1 TO N DIFFRENT VALUE IN HASHSET AND DIFF IN INDEX 5 TO N
        //SOLUTION IS THAT:- IF WE HAVE A ARRAY THAT CONTAIN DISTINT SET SIZE FROM DIFFRENT INDEX
        //IF I=10 SET{1} = SUFFIX[10] = 1
        //   I=9 SET{1,2} = SUFFIX[9] = 2
        //GO DOWN THEN SET SIZE INCREASE
        //1-N, 2- N,3-N,4-N --- SUFFIX
        int[] suffix = new int[n+2];  //[                       ,2,1]
        for(int i=n;i>0;i--){
            distinctValue.add(arr[i]);
            suffix[i] = distinctValue.size();

        }

        while(m-- > 0){
            int x = sc.nextInt();
            System.out.println(suffix[x]);
        }


    }
}
