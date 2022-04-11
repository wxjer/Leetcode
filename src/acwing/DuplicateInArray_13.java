package acwing;

import java.util.HashSet;

/**
 * 给定一个长度为 n 的整数数组 nums，数组中所有的数字都在 0∼n−1 的范围内。
 *
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 *
 * 请找出数组中任意一个重复的数字。
 *
 * 注意：如果某些数字不在 0∼n−1 的范围内，或数组中不包含重复数字，则返回 -1；
 *
 * 数据范围
 * 0≤n≤1000
 * 样例
 * 给定 nums = [2, 3, 5, 4, 3, 2, 6, 7]。
 *
 * 返回 2 或 3。
 */
class DuplicateInArray_13 {
    public int duplicateInArray(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int target = -1;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 || nums[i] > nums.length) {
                return -1;
            }
            if (target == -1 && !set.add(nums[i])) {
                target = nums[i];
            }
        }
        return target;
    }
}