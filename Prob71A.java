import java.util.*;
public class Prob71A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            String str = sc.next();
            if(str.length() > 10){
                int size = str.length() - 2;
                int finalIdx = str.length() - 1;
                System.out.println(str.charAt(0)+""+ size +""+ str.charAt(finalIdx));
            }else{
                System.out.println(str);
            }

            n--;
        }



    }
}