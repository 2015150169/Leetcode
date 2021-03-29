package leetcode_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author:Solution
 * @DATE:2021/3/2820:34
 **/
public class Solution {

    public static int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int max_length = 0;
        int index = 0;
        Map<Character,Integer> characterList = new HashMap<>();
        if(length <= 0) {
            return max_length;
        }
        for(int i=0;i<length ; i++) {
            if(characterList.keySet().contains(s.charAt(i))){
                int last = characterList.get(s.charAt(i));

                for(int j = index ; j <=last ; j ++ ) {
                    characterList.remove(s.charAt(j));
                }
                index = last + 1 ;
            }
            characterList.put(s.charAt(i),i);
            if(max_length < i-index + 1) {
                max_length =  i-index + 1;
            }
        }
        return max_length;
    }


    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
