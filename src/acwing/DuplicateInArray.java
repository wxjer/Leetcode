package acwing;

import java.util.HashSet;

public class DuplicateInArray {
    public static void main(String[] args) {

    }
}

class Solution {
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