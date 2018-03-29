package ch2_binary;
/*
 * 459. Closest Number in Sorted Array 
 Description
 Notes
 Testcase
 Judge
Given a target number and an integer array A sorted in ascending order, find the index i in A such that A[i] is closest to the given target.

Return -1 if there is no element in the array.

 Notice
There can be duplicate elements in the array, and we can return any of the indices with same value.

Have you met this question in a real interview? Yes
Example
Given [1, 2, 3] and target = 2, return 1.

Given [1, 4, 6] and target = 3, return 1.

Given [1, 4, 6] and target = 5, return 1 or 2.

Given [1, 3, 3, 4] and target = 2, return 0 or 1 or 2.
 */
public class ClosestNumber {
    /**
     * @param A an integer array sorted in ascending order
     * @param target an integer
     * @return an integer
     */
    public int closestNumber(int[] A, int target) {
        if (A == null || A.length == 0) {
            return -1;
        }
        int l = 0, r = A.length - 1;
        while (l + 1 < r) {
            int m = l + (r - l) / 2;
            if (A[m] == target) {
                return m;
            }
            if (A[m] < target) {
                l = m;
            } else {
                r = m;
            }
        }
        if (Math.abs(A[l] - target) < Math.abs(A[r] - target)) {
            return l;
        }
        return r;
    }
}
