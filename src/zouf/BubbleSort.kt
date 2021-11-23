package zouf

fun main(args: Array<String>) {
    print(2 shr 1)
//    val data = intArrayOf(234,25,6,346,35,3246,346,346,34,1234,12356,63,7,5,45,345,13,64,6,34,2345,6,234,634)
//    data.shuffle()
//    bubbleSort(data)
}

fun bubbleSort(args: IntArray?) {
    if (args == null || args.size < 2) {
        return
    }
    println(args.contentToString())
    for (i in args.indices) {
        var currentIndex = i
        for (j in i + 1 until args.size) {
            if (args[currentIndex] > args[j]) {
                swap(args, currentIndex, j)
            }
        }
    }
    println(args.contentToString())
}

fun swap(args: IntArray, i: Int, j: Int) {
    args[i] = args[i] xor args[j]
    args[j] = args[i] xor args[j]
    args[i] = args[i] xor args[j]
}
