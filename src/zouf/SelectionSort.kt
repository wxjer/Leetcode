package zouf

import kotlin.random.Random

fun main(args1: Array<String>?) {
    val args: Array<Int> = Array(10) { Random.nextInt(-100, 100) }
    if (args == null || args.size < 2) {
        return
    }
    println(args.contentToString())
    for (i in args.indices) {
        var minNumIndex = i
        for (j in (i + 1 until args.size)) {
            if (args[minNumIndex] > args[j]) {
                swapNum(args, minNumIndex, j)
            }
        }
    }
    println(args.contentToString())

}

fun swapNum(args: Array<Int>, a: Int, b: Int) {
    args[a] = args[a] xor args[b]
    args[b] = args[a] xor args[b]
    args[a] = args[a] xor args[b]
}


