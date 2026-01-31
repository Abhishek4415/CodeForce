public class judgeFind {
  
    public static int findJudge(int N, int[][] trust) {
        int[] Trusted = new int[N+1];
        for(int[] person : trust){
            Trusted[person[0]]--;
            Trusted[person[1]]++;
        }
        for(int i = 1;i < Trusted.length;i++){
            if(Trusted[i] == N-1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,3}};
        System.out.println(findJudge(3,arr));
        
    }
}
