//676/c
//n = size
//k = 2 no of change possible
//string of size n
//output - max substring contains same letter - 'aaaa' - 4

import java.util.Scanner;

public class vasyaString {
    public static int getmax(int n,int k,String str, char target){
        int left = 0;
        int max = 0;
        int change = 0;
        for(int right=0;right<n;right++){
            if(str.charAt(right) != target) change ++;  //  - 
            if(change > k){
                if(str.charAt(left) != target) change --;  //target need in substring so when != then left++
                left++;

            }

            max = Math.max(max,right - left +1);


        }

        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        String str = sc.next();
        System.out.println(Math.max(getmax(n,k,str,'a'),getmax(n,k,str,'b')));
        
    }

}
