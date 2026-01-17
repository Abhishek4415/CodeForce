//https://codeforces.com/problemset/problem/4/C
//registration system


import java.util.HashMap;
import java.util.Scanner;

public class registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            String str = sc.next();
            if(map.containsKey(str)){
                System.out.println(str + map.get(str));
            }else{
                System.out.println("OK");
            }
            map.put(str,map.getOrDefault(str,0)+1);
        }

        



    }
    
}
