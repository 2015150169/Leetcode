package leetcode_16;

import java.util.Arrays;

/**
 * @author:Solution
 * @DATE:2021/4/721:49
 **/
public class Solution {

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for(int i=0;i<nums.length;i++) {
            int start = i+1, end = nums.length - 1;
            while(start < end) {
                int sum = nums[start] + nums[end] + nums[i];
                if(Math.abs(target - sum) < Math.abs(target - ans))
                    ans = sum;
                if(sum > target)
                    end--;
                else if(sum < target)
                    start++;
                else
                    return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,4,8,16,32,64,128};
        int target = 82;
        System.out.println(threeSumClosest(nums,target));
    }
}

