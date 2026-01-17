//279/b
//input n - no of books
//input t = free time
//arr[] = contain ith book take min to complere reading

import java.util.Scanner;

public class books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t = sc.nextLong();

        long[]  arr = new long[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextLong();
        }
        
        //two pointer
        int left = 0;
        int maxBook = 0;
        long sum = 0;

        for(int right = 0; right < n;right++){
            sum += arr[right];
            
            while(sum > t){
                sum -= arr[left];
                left++;
            }
            
            maxBook = Math.max(maxBook,right - left +1);
        }
    

        System.out.println(maxBook);
            

            



    }
}