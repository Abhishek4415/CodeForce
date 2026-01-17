package ProgramPathshala;

public class maxChunks {
    public static int mChunks(int arr[]) {
        int n = arr.length;
        int chunks = 0;
        if (n == 0)
            return 0;
        // apporach 1
        int[] prefixMax = new int[n];
        int[] suffixMin = new int[n];
        // step 1 prefix max -- pahleKaMax
        prefixMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], arr[i]);
        }
        // step 2 suffixmin -- baaddkamin -- uss idx se baadkamin
        suffixMin[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], arr[i]);
        }
        // note [pahlekamax < badkamin] == chunk++;
        
        for(int i=0;i<n;i++){
            int pahleKaMax = i> 0 ? prefixMax[i-1] : -1;
            int baadkamin =  suffixMin[i];
            if(pahleKaMax < baadkamin){
                chunks++;
            }

        }

        return chunks;
    }


    //approach 2
//     class Solution {
//     public int maxChunksToSorted(int[] arr) {
//         int oriSum = 0; // 0+1+2+3+4
//         int cumSum = 0;
//         int chunks = 0;
//         for(int i=0;i<arr.length;i++){
//             cumSum += arr[i];
//             oriSum += i;
//             if(cumSum == oriSum)chunks++;
//         }
        
//         return chunks;
//     }
// }


//approach 3

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 3, 4 };
        System.out.println(mChunks(arr));
    }
}
