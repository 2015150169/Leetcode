package leetcode_7;

/**
 * @author:Solution
 * @DATE:2021/3/2923:43
 **/
public class Solution {

    public int reverse(int x) {
        int result = 0;
        String xstr = String.valueOf(x);
        StringBuffer stringBuffer = new StringBuffer();
        int start = 0;
        if(x<0){
            start = 1;
        }
        for (int i=xstr.length() -1; i>=start;i--) {
            stringBuffer.append(xstr.charAt(i));
        }
        String lstr = stringBuffer.toString();
        try {
            result = Integer.valueOf(lstr);
        }catch (Exception ex) {
            result = -1;
        }
        return result;
    }

}
