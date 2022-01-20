package acwing;

import java.util.HashSet;

/**
 * 给定一个长度为 n+1 的数组nums，数组中所有的数均在 1∼n 的范围内，其中 n≥1。
 * <p>
 * 请找出数组中任意一个重复的数，但不能修改输入的数组。
 * <p>
 * 数据范围
 * 1≤n≤1000
 * 样例
 * 给定 nums = [2, 3, 5, 4, 3, 2, 6, 7]。
 * <p>
 * 返回 2 或 3。
 * 思考题：如果只能使用 O(1) 的额外空间，该怎么做呢？
 */
public class DuplicateInArray2 {
    public static void main(String[] args) {

    }

    public int duplicateInArray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return nums[i];
            }
        }
        return -1;
    }

}


