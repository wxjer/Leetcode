package zouf

import java.lang.RuntimeException
import java.util.*

/**
 *编写一个类，用两个栈实现队列，支持队列的基本操作（add、poll、peek）
 * 如果stackPush要往stackPop中压入数据，那么必须一次性把stackPush中的数据全部压入。
 * 2.如果stackPop不为空，stackPush绝对不能向stackPop中压入数据
 */
public fun main() {

}

class TwoStackQueue {
    private val stackPush: Stack<Int> = Stack()
    private val stackPop: Stack<Int> = Stack()

    private fun pushToPop() {
        if (stackPop.empty()) {
            while (stackPop.isNotEmpty()) {
                stackPop.push(stackPush.pop())
            }
        }
    }


    fun poll(): Int {
        if (stackPop.empty() && stackPush.isEmpty()) {
            throw RuntimeException("error")
        }
        pushToPop()
        return stackPop.pop()
    }

    fun add(num: Int) {
        stackPush.push(num)
        pushToPop()
    }

    fun peek(): Int {
        if (stackPush.isEmpty() && stackPop.isEmpty()) {
            throw RuntimeException("")
        }
        pushToPop()
        return stackPop.pop()
    }


}