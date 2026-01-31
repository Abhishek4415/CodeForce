//

import java.util.Arrays;
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 4;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);
      
         boolean triangle = (arr[0] + arr[1] > arr[2]) || (arr[1] + arr[2] > arr[3]);
         boolean segment  = (arr[0] + arr[1] == arr[2]) || (arr[1] + arr[2] == arr[3]);
       
        if(triangle){
            System.out.println("TRIANGLE");
        }else if(segment){
            System.out.println("SEGMENT");
        }else{
            System.out.println("IMPOSSIBLE");
        }

    }

}

// import java.util.*;

// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int[] a = new int[4];
// for (int i = 0; i < 4; i++) a[i] = sc.nextInt();
// Arrays.sort(a);

// boolean triangle = (a[0] + a[1] > a[2]) || (a[1] + a[2] > a[3]);
// boolean segment = (a[0] + a[1] == a[2]) || (a[1] + a[2] == a[3]);

// if (triangle) System.out.println("TRIANGLE");
// else if (segment) System.out.println("SEGMENT");
// else System.out.println("IMPOSSIBLE");
// }
// }
