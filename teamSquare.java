//https://codeforces.com/problemset/problem/1/A
// Total squares needed = widthSquares×heightSquares

import java.util.Scanner;

public class teamSquare {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt(); // rectangle width
        int m = sc.nextInt(); // rectangle height
        int a = sc.nextInt(); // square side

        int widthSquares = (int) Math.ceil((double) n / a);
        int heightSquares = (int) Math.ceil((double) m / a);

        int total = widthSquares * heightSquares;
        //math.ceil(4.7) = 5


        System.out.println(total);
    }
}
