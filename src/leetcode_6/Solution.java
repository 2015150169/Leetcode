package leetcode_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author:Solution
 * @DATE:2021/3/2922:58
 **/
public class Solution {

    public static String convert(String s, int numRows) {
        String result = "";
        int flag = 0;//0 ADD 1 del
        int j=0;
        int first = 1;
        Map<Integer,List<String>> map = new HashMap<>();
        for(int i =0;i < numRows ; i++) {
            map.put(i, new ArrayList<String>());
        }
        if(numRows > 1) {
            for(int i=0;i < s.length() ; i++) {
                if(j == numRows) {
                    flag = 1;
                    j--;
                }
                if(j == 0 && first != 1) {
                    flag = 0;
                    j++;
                }
                if(flag == 0) {
                    map.get(j).add(String.valueOf(s.charAt(i)));
                    j++;
                }
                if(flag == 1) {
                    j--;
                    map.get(j).add(String.valueOf(s.charAt(i)));
                }
                first =2;
            }
            for(int i=0;i < numRows;i++) {
                List<String> row = map.get(i);
                for(String str: row) {
                    result += str;
                }
            }
        }else {
            return s;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "AB";
        int numRows = 1;
        System.out.println(convert(s,numRows));
    }

}
