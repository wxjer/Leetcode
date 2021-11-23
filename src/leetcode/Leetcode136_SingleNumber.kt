package leetcode

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/single-number
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
fun main(args: Array<String>) {
    val data = intArrayOf(2,2,1,3,3,3,3,2,45,2,3,3,5,4,5,4,45)
    println(getSingleNum(data))
}

fun getSingleNum(nums: IntArray): Int {
    if (nums.size == 1) {
        return nums[0]
    }
    var num = nums[0]
    for (i in 1 until nums.size) {
        num = num xor nums[i]
    }
    return num
}
