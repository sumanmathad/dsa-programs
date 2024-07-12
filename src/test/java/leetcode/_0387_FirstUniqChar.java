package leetcode;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
//Given a string s, find the first non-repeating character in it and return its index.
// If it does not exist, return -1.



public class _0387_FirstUniqChar {
    public static void main(String[] args) {
        assertEquals(firstUniqChar("traveller"),0);

    }

    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> count = new HashMap<>();
        int n=s.length();
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            count.put(c,count.getOrDefault(c,0)+1);
        }
        for(int j=0; j<n;j++){
            if(count.get(s.charAt(j))==1){
                return j ;
            }
        }
        return -1;
    }


}
