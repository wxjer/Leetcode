package acwing;

/**
 * 请实现一个函数，把字符串中的每个空格替换成"%20"。
 *
 * 数据范围
 * 0≤ 输入字符串的长度 ≤1000。
 * 注意输出字符串的长度可能大于 1000。
 *
 * 样例
 * 输入："We are happy."
 *
 * 输出："We%20are%20happy."
 */
class Solution16 {

    public static void main(String[] args) {
        System.out.println(replaceSpaces(new StringBuffer(" h jPW5a   y rZ 4 6E")));
    }

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
}