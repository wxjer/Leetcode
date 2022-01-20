package leetcode

class Leetcode240 {
    fun searchMatrix(array: Array<IntArray>, target: Int): Boolean {
        if (array.size === 0 || array.get(0).size === 0) {
            return false
        }
        var x = 0
        var y: Int = array.get(0).size - 1
        while (x < array.size && y >= 0) if (array.get(x).get(y) === target) {
            return true
        } else if (array.get(x).get(y) < target) {
            x++
        } else {
            y--
        }
        return false
    }
}