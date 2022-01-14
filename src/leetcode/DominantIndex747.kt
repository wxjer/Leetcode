package leetcode

/**
 * 给你一个整数数组 nums ，其中总是存在 唯一的 一个最大整数 。

请你找出数组中的最大元素并检查它是否 至少是数组中每个其他数字的两倍 。如果是，则返回 最大元素的下标 ，否则返回 -1 。

 */
class DominantIndex747 {
 fun dominantIndex(nums: IntArray): Int {
  var max = Int.MIN_VALUE
  var secondMax = Int.MIN_VALUE
  var maxIndex = -1
  for (i in nums.indices) {
   if (nums[i] > max) {
    secondMax = max
    max = nums[i]
    maxIndex = i
   } else if (nums[i] > secondMax) {
    secondMax = nums[i]
   }
  }
  if (max / 2 >= secondMax) {
   return maxIndex
  }
  return -1
 }
}