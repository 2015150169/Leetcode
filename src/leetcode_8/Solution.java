package leetcode_8;

/**
 * @author:Solution
 * @DATE:2021/4/122:18
 **/
public class Solution {


    public static int myAtoi(String s) {
        long result = 1;
        int min = -2147483648;
        int max = 2147483647;
        s = s.trim();
        if(s.length() <= 0) {
            return 0;
        }
        char fisrt = s.charAt(0);
        if(fisrt != '-' && fisrt != '+' && (fisrt > '9' || fisrt < '0')) {
            return 0;
        }
        if(fisrt == '-' || fisrt == '+') {
            result = 0;
        }else {
            result = fisrt - '0';
        }
        long temp = result;
        for(int i=1;i < s.length();i++) {
            if(s.charAt(i) > '9' || s.charAt(i) < '0') {
                if(fisrt == '-') {
                    result = result * -1;
                }
                if(result < min){
                    return min;
                }else if(result > max) {
                    return max;
                }else {
                    return (int)result;
                }
            }else {
                result = result * 10 +  (s.charAt(i) - '0');
            }
            if(fisrt == '-' ) {
                temp = -1 * result;
            }else {
                temp = result;
            }
            if(temp < min){
                return min;
            }else if(temp > max){
                return max;
            }
        }
        if(fisrt == '-') {
            result = result * -1;
        }
        return (int)result;
    }


    public static void main(String[] args) {
        String s = "-111111111142";
        System.out.println(myAtoi(s));
    }
}
