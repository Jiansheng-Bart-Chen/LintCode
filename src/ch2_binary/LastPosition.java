package ch2_binary;
/*
 * 458. Last Position of Target 
 Description
 Notes
 Testcase
 Judge
Find the last position of a target number in a sorted array. Return -1 if target does not exist.

Have you met this question in a real interview? Yes
Example
Given [1, 2, 2, 4, 5, 5].

For target = 2, return 2.

For target = 5, return 5.

For target = 6, return -1.
 */
public class LastPosition {
    /**
     * @param nums: An integer array sorted in ascending order
     * @param target: An integer
     * @return an integer
     */
    public int lastPosition(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int l = 0;
        int r = nums.length - 1;
        while (l + 1 < r) {
            int m = l + (r - l) / 2;
            if (nums[m] <= target) {
                l = m;
            } else {
                r = m;
            }
        }
        if (nums[r] == target) {
            return r;
        } else if (nums[l] == target) {
            return l;
        } else {
            return -1;
        }
    }
}
