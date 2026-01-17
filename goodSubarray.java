//1398/c
//good subarray
//sum of subarray = length of subarray 

import java.util.Scanner;

public class goodSubarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();

            int count = 0;
            for(int i=0;i<n;i++){
                int sum =0;
                for(int j=i;j<n;j++){
                    sum += str.charAt(j) - '0' ;
                    int length = j - i + 1;
                    if(sum == length){
                        count++;
                    }
                    
                }
            }



            System.out.println(count);
            //120 - 1,3,3
            //

            

            
        }
    }
}