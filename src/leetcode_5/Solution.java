package leetcode_5;

/**
 * @author:Solution
 * @DATE:2021/3/2922:39
 **/
public class Solution {

    /**
     * 动态规划算法 p[i+1，j-1]是回文则只需要s[i]=s[j]则p[i,j]是回文
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        int sLen = s.length();
        int maxLen = 0;
        String ans = "";
        boolean[][] P = new boolean[sLen][sLen];
        // 遍历所有长度
        for (int len = 1; len <= sLen; len++) {
            for (int start = 0; start < sLen; start++) {
                int end = start + len - 1;
                // 下标越界，结束循环
                if (end >=sLen) {
                    break;
                }
                P[start][end] = (len == 1 || len == 2 || P[start + 1][end - 1]) && s.charAt(start) == s.charAt(end);
                if (P[start][end] && len > maxLen) {
                    maxLen = len;
                    ans = s.substring(start, end + 1);
                }
            }
        }
        return ans;
    }


}
