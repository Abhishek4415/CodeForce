// import java.util.HashMap;
// import java.util.Stack;
// import java.util.*;

// public class smallestString {
//     public static void main(String[] args) {
//         String str = "dbacdab";
//         Stack<Character>  st = new Stack<>();
//         HashMap<Character,Integer> freq = new HashMap<>();
//         for(char ch : str.toCharArray()){
//             freq.put(ch,freq.getOrDefault(ch,0)+1);

//         }

//         StringBuilder s = new StringBuilder();
//         for(char ch :str.toCharArray()){
//             while(!st.isEmpty() && st.peek() < ch && freq.get(ch) > 0){
//                 st.pop();
//             }

//             if(!st.isEmpty()){
//                 s.append(st.peek());
//             }

//             st.push(ch);
//         }

//         System.out.println(s);

//     }
    
// }

import java.util.*;

public class smallestString {
    public static void main(String[] args) {
        String str = "pedfefd";
        Map<Character, Integer> freq = new HashMap<>();
        Stack<Character> st = new Stack<>();
        boolean used[] = new boolean[256];

        for(char c : str.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for(char c : str.toCharArray()){
            freq.put(c, freq.get(c) - 1);

            if(used[c]) continue;

            while(!st.isEmpty() && st.peek() > c && freq.get(st.peek()) > 0){
                used[st.pop()] = false;
            }

            st.push(c);
            used[c] = true;
        }   
        
        // System.out.println(st); //[p, d, e, f]
        // for(char c : st){
        //     System.out.println(c);
        // }
        // /[p, d, e, f]

        StringBuilder ans = new StringBuilder();
        for(char c : st) ans.append(c);

        System.out.println(ans);
    }
}

