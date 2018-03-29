package ch2_binary;
/*
 * 585. Maximum Number in Mountain Sequence 
 Description
 Notes
 Testcase
 Judge
Given a mountain sequence of n integers which increase firstly and then decrease, find the mountain top.

Have you met this question in a real interview? Yes
Example
Given nums = [1, 2, 4, 8, 6, 3] return 8
Given nums = [10, 9, 8, 7], return 10


 */
public class MaxInMtn {
    /**
     * @param nums a mountain sequence which increase firstly and then decrease
     * @return then mountain top
     */
    public int mountainSequence(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int ll = 0;
        int rl = nums.length - 1;
        while (ll + 1 < rl) {
            int m = ll + (rl - ll) / 2;
            if (nums[m - 1] < nums[m]) { // asend
                ll = m;
            } else {
                rl = m;
            }
        }
        return Math.max(nums[ll], nums[rl]);
    }
}
