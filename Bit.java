//282/A

import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // String[] str = new String[n];
        int c = 0;

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            if (str.charAt(1) == '+') {
                c++;

            } else {
                c--;
            }
        }

        System.out.println(c);

    }

}