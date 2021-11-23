package leetcode

import kotlin.random.Random

/**
 * 给你一个整数数组  nums ，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次 。请你找出并返回那个只出现了一次的元素。
示例 1：

输入：nums = [2,2,3,2]
输出：3
示例 2：

输入：nums = [0,1,0,1,0,1,99]
输出：99


提示：

1 <= nums.length <= 3 * 104
-231 <= nums[i] <= 231 - 1
nums 中，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次


进阶：你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/single-number-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
fun main(args: Array<String>) {
    val data = IntArray(31)
    var index = 0
    for (i in 0..9) {
        val randomNum = Random.nextInt(0, 100)
        for (j in 0..2) {
            data[index++] = randomNum
        }
    }
    data[30] = 101
    println(data.contentToString())
    println(singleNumber(data))
}

fun singleNumber(nums: IntArray): Int {
    var numIndexArray = IntArray(32)
    for (num in nums) {
        for (i in 0..31) {
            if (((num shr i) and 1) == 1) {
                numIndexArray[i]++
            }
        }
    }
    println(numIndexArray.contentToString())
    var ans = 0
    for (i in 0..31) {
        if (((numIndexArray[i] % 3 ) and 1 ) == 1) {
            ans += (1 shl i)
        }
    }
    return ans
}
