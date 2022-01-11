package zouf

import java.lang.RuntimeException
import java.util.*

/**
 *实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作。
 * 【要求】
 * 1.pop、push、getMin操作的时间复杂度都是O（1）。
 * 2.设计的栈类型可以使用现成的栈结构。
 */
fun main() {

}

class GetMinStack() {
    var data: Stack<Int> = Stack()
    var minData: Stack<Int> = Stack()


    public fun push(num: Int) {
        data.push(num)
        if (minData.empty()) {
            minData.push(num)
        } else {
            val min = minData.peek()
            if (min > num) {
                minData.push(num)
            }
        }
    }

    public fun pop(): Int {
        if (data.isEmpty()) {
            throw RuntimeException("empty stack")
        }
        val num = data.pop()
        if (num <= minData.peek()) {
            minData.pop()
        }
        return num
    }

    public fun getMin(): Int {
        if (minData.isEmpty()) {
            throw RuntimeException("empty")
        } else {
            return minData.peek()
        }
    }
}