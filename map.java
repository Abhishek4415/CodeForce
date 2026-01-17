import java.util.HashMap;
import java.util.TreeMap;

public class map {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();

        // map.put(10,"abhishek");
        // map.put(2,"rohan");

        // //iteration

        // map.forEach((k,v)->System.out.println(k + "->" + v));

        // // for(TreeMap.Entry<Integer,String> entry : map.entrySet()){
        // //     System.out.println(entry.getKey() + "-->" + entry.getValue());
        // // }

        // //using keyset iteration
        // for(Integer k : map.keySet()){
        //     System.out.println(k + "-->" + map.get(k) );
        // }

        //   // SEARCH
        // System.out.println(map.containsKey(103));     // true
        // System.out.println(map.containsValue("Neha")); // true

        //   // DELETE
        // map.remove(101);

        // // SIZE
        // System.out.println(map.size()); // 2

        // // CHECK EMPTY
        // System.out.println(map.isEmpty()); // false
        // //using value
        // for(String val : map.values()){
        //     System.out.println(val);
        // }

        int[] arr = {5,7,7,6,2,5,7,5};
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            
        }

        int max = 0;
        int key = 0;

        //if we want second max and last freq most freq value

       for(Integer k : map.keySet()){
        if(map.get(k) >= max){
            max = map.get(k);
            key = k;

        }
        
        }

        //if we want first max
        for(Integer k : map.keySet()){
            if(map.get(k) == max){
                System.out.println(k);
                // break; for asking first value 
            }
        }

        System.out.println(key + " ++");

       




    }
}
