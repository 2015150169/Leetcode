package leetcode_14;

/**
 * @author:Solution
 * @DATE:2021/4/623:18
 **/
public class Solution {

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        if(strs.length <= 0) {
            return "";
        }
        String first = "";
        for(int i=0; i < strs.length;i++) {
            if(strs[i].length() > 0) {
                first = strs[i];
                break;
            }else {
                return "";
            }
        }
        boolean flag = true;
        for(int i=0;i < first.length(); i++){
            for(String str: strs) {
                if(str.length() <= i) {
                    flag = false;
                    break;
                }
                if(str.charAt(i) != first.charAt(i)) {
                   flag = false;
                   break;
                }
            }
            if(flag) {
                stringBuilder.append(first.charAt(i));
            }else {
                break;
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String [] strs = {"flower","flow","flowflight"};
        System.out.println(longestCommonPrefix(strs));
    }

}
