package leetcode_12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author:Solution
 * @DATE:2021/4/520:59
 **/
public class Solution {

    public static String intToRoman(int num) {
        String result = "";
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(900,"CM");
        map.put(1000,"M");
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4,1};
        while (num > 0) {
            for(Integer v1: value) {
                if(num >= v1) {
                    num = num - v1;
                    result = result + map.get(v1);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 58;
        System.out.println(intToRoman(num));
    }

}
