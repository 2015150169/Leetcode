package leetcode_11;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:Solution
 * @DATE:2021/4/520:41
 **/
public class Solution {

    public static int maxArea(int[] height) {
        int maxArea = 0;
        Map<Integer,Integer> maxHeight = new HashMap<>();
        int maxValue = 0;
        for(int i=height.length-1; i >= 0; i--) {
            if(height[i] > maxValue) {
                maxHeight.put(i, height[i]);
                maxValue = height[i];
            }
        }
        for(Integer weight: maxHeight.keySet()) {
            for(int i=0;i < height.length - 1; i++) {
                if(weight - i > 0 || i - weight > 0) {
                    int n = 0;
                    if(weight > i) {
                        n = weight - i;
                    }else {
                        n = i - weight;
                    }
                    int high = maxHeight.get(weight) < height[i] ? maxHeight.get(weight) : height[i];
                    if(maxArea < high * n) {
                        maxArea = high * n;
                    }
                }
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1,2,1};
        System.out.println(maxArea(height));
    }

}
