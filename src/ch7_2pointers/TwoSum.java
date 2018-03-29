package ch7_2pointers;

import java.util.HashMap;
import java.util.Map;
/*
 * 608. Two Sum - Input array is sorted 
 Description
 Notes
 Testcase
 Judge
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

 Notice
You may assume that each input would have exactly one solution.

Have you met this question in a real interview? Yes
Example
Given nums = [2, 7, 11, 15], target = 9
return [1, 2]
 */
public class TwoSum {
    /*
     * @param nums: an array of Integer
     * @param target: target = nums[index1] + nums[index2]
     * @return: [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> hash = new HashMap<Integer, Integer> ();
      int[] result = new int[2];
      for (int i = 0; i < nums.length; ++i) {
        if (hash.containsKey(target - nums[i])) {
          result[0] = hash.get(target - nums[i]) + 1;
          result[1] = i + 1;
          break;
        }
        hash.put(nums[i], i);
      }
      return result;
    }
}
