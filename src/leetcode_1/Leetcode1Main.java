package leetcode_1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:Leetcode1Main
 * @DATE:2021/3/2817:08
 **/
public class Leetcode1Main {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> newMap = new HashMap<>();
        int[] value = new int[2];
        for(int i=0; i < nums.length; i++){
            if(newMap.containsKey(new Integer(target-nums[i]))) {
                value[1] = i;
                value[0] = newMap.get(target - nums[i]);
            }
            else {
                newMap.put(nums[i],i);
            }
        }
        return value;
    }

    public static void main(String[] args) {
           int[] nums = new int[4];
           nums[0] = 2;
           nums[1] = 7;
           nums[2] = 11;
           nums[3] = 15;
           int target = 9;
           System.out.println(twoSum(nums, target)[0] + "," + twoSum(nums, target)[1]);
    }

}
