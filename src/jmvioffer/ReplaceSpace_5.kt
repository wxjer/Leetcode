package jmvioffer

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。

示例 1：

输入：s = "We are happy."
输出："We%20are%20happy."
限制：

0 <= s 的长度 <= 10000

Related Topics
字符串

👍 258
👎 0
 */
class ReplaceSpace_5 {
    fun replaceSpace(s: String): String {
        if (s.isEmpty()) {
            return s
        }
        var count = 0
        for (c in s) {
            if (c == ' ')
                count++
        }
        var nLength = count * 2 + s.length
        var nIndex = nLength - 1;
        var index = s.length - 1
        var charArray = arrayOfNulls<Char>(nLength)
        while (count >= 0 && nIndex >= 0) {
            if (s[index] == ' ') {
                charArray[nIndex--] = '0'
                charArray[nIndex--] = '2'
                charArray[nIndex--] = '%'
                count--

            } else {
                charArray[nIndex--] = s[index]
            }
            index--
        }
        return charArray.joinToString("")
    }
}