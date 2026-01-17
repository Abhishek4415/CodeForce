//https://codeforces.com/problemset/problem/231/A
//contest n=3;
//3
// 1 1 0  == 3 member behavior  mean 1 solve 0 not if at least 2 member sure to solve
// 1 1 1
// 1 0 0

//output 2
import java.util.*;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = 0; j < 3; j++){
                temp.add(sc.nextInt());
            }
            arr.add(temp);
        }

        int count = 0;

        for(int i = 0; i < n; i++){
            int sum = arr.get(i).get(0) + arr.get(i).get(1) + arr.get(i).get(2);
            if(sum >= 2){
                count++;
            }
        }

        System.out.println(count);
    }
}
