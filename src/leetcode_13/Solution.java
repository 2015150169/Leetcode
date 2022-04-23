package leetcode_13;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author:Solution
 * @DATE:2021/4/521:21
 **/
public class Solution {

    public static int intToRoman(String num) {
        int result = 0;
        Map<String,Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);
        Set<String> key = map.keySet();
        int length = num.length() - 1;
        for(int i=0; i <= length; i++) {
            if(i <= length - 1){
                if(key.contains(String.valueOf(num.charAt(i)) + String.valueOf(num.charAt(i + 1)))) {
                    result = result + map.get(String.valueOf(num.charAt(i)) + String.valueOf(num.charAt(i + 1)));
                    i = i + 1;
                }else {
                    result = result + map.get(String.valueOf(num.charAt(i)));
                }
            }else {
                result = result + map.get(String.valueOf(num.charAt(i)));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String num = "IV";
        System.out.println(intToRoman(num));
    }

}
