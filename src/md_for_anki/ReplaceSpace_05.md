# jmvioffer
## 替换空格。
请实现一个函数，把字符串 s 中的每个空格替换成"%20"。

示例 1：

输入：s = "We are happy."
输出："We%20are%20happy."
限制：

0 <= s 的长度 <= 10000

Related Topics
字符串

👍 258
👎 0
%

```java
        public static String replaceSpaces(StringBuffer str) {
        if (str.length() == 0) return "";
        int count = 0;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        int nLength = count * 2 + length;
        str.setLength(nLength);
        int index0 = nLength - 1;
        int index1 = length - 1;
        while (count > 0 && index0 >= 0 && index1 >= 0) {
            if (str.charAt(index1) == ' ') {
                str.setCharAt(index0--, '0');
                str.setCharAt(index0--, '2');
                str.setCharAt(index0--, '%');
                count--;
            } else {
                str.setCharAt(index0--, str.charAt(index1));
            }
            index1--;
        }
        return str.toString();
    }
```

```kotlin
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
```