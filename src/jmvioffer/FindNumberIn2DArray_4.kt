package jmvioffer
//在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个
//整数，判断数组中是否含有该整数。
//
//
//
// 示例:
//
// 现有矩阵 matrix 如下：
//
//
//[
//  [1,   4,  7, 11, 15],
//  [2,   5,  8, 12, 19],
//  [3,   6,  9, 16, 22],
//  [10, 13, 14, 17, 24],
//  [18, 21, 23, 26, 30]
//]
//
//
// 给定 target = 5，返回 true。
//
// 给定 target = 20，返回 false。
//
//
//
// 限制：
//
// 0 <= n <= 1000
//
// 0 <= m <= 1000
//
//
//
// 注意：本题与主站 240 题相同：https://leetcode-cn.com/problems/search-a-2d-matrix-ii/
// Related Topics 数组 二分查找 分治 矩阵 👍 644 👎 0
class FindNumberIn2DArray_4 {
    fun findNumberIn2DArray(array: Array<IntArray>, target: Int): Boolean {
        if (array.size == 0 || array.get(0).size == 0) {
            return false
        }
        var x = 0
        var y: Int = array.get(0).size - 1
        while (x < array.size && y >= 0) if (array.get(x).get(y) == target) {
            return true
        } else if (array.get(x).get(y) < target) {
            x++
        } else {
            y--
        }
        return false
    }
}