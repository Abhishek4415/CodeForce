import java.util.Stack;

public class celebrityProb {
    public static void main(String[] args) {
        // int[][] mat  =  {{0, 1, 0},{0, 1, 0},{0, 1, 1}};
        // int[][] mat  =  {{1, 1},{1, 1}};
        int[][] mat  =  {{1,3},{2,3}};
        int n = mat.length;
        Stack<Integer> st = new Stack<>();

        //find celebrity
        for(int i=0;i<n;i++){
            st.push(i);

        }

        int cleb = 0;
        while(st.size()>1){
            int i= st.pop();
            int j= st.pop();
            if(mat[i][j] == 1){
                cleb = j;
            }else{
                cleb = i;
            }

        }
        //verify
        boolean x = true;
        for(int i=0;i<n;i++){
            if(i != cleb){
                if(mat[cleb][i] == 1 || mat[i][cleb] == 0){
                    x = false;
                }
            }
        }
        
        if(x){
            System.out.println();
        }else{
            System.out.println(-1);
        }

    }
    
}
