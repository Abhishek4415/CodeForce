import java.util.HashMap;

//remember this concept for sum subarray - prefix[r] - prefix[l-1] = k ---->>mean sum l to r is k
//prefix[l-1] = prefix[r] - k;
//sum = 0 k=0  prefix[l-1] = prefix[r]  == mean sum l to r is 0


public interface subarraySumK {
    public static void main(String[] args) {
        int[] arr = { 9, 4, 20, 3, 10, 5};
        int k = 33;

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0, 1);
        int count = 0;
        int currentSum = 0;
        int maxLen = 0;
        for(int i=0;i< arr.length;i++){
            
            currentSum += arr[i];
            //for sum =-----------------------------============================================
            // currentSum += arr[i];
            // int target = currentSum - k;  //

            // if(map.containsKey(target)){
            //     count += map.get(target);
            // }

            // map.put(currentSum,map.getOrDefault(currentSum,0)+1);

            //========================================================================================

            //for max length of subarray have sum = 0


            // if(currentSum == k){
            //     maxLen  = i+1;
            // }

            // int target = currentSum - k;

            // if(map.containsKey(target)){
            //     maxLen = Math.max(maxLen,  i - map.get(target) );
            // }

            // map.put(currentSum,i);


            //=============================================================================================

            


            
            
            
            
            
            
            
            
        }
        
        System.out.println(maxLen);
        //System.out.println(count);




    }
}
