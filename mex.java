import java.util.HashSet;

public class mex {
    public static void main(String[] args) {
        int arr[] = {2,1,3,5};
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(num >= 0){
                set.add(num);
            }
        }
        int mex = 0;
        while(set.contains(mex)){
            mex++;
        }

        System.out.println(mex);
    }
}
