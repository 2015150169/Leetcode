package leetcode_9;

/**
 * @author:Solution
 * @DATE:2021/4/123:13
 **/
public class Solution {

    public static boolean isPalindrome(int x) {
        boolean result = false;
        if(x < 0) {
            return false;
        }
        int first = x;
        int second = 0;
        do {
            second = second * 10 + (x - x/10*10);
            x = x/10;
        }while (x > 0);
        if(first == second) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        int x =12321;
        System.out.println(isPalindrome(x));
    }
}
