package acwing;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 *
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * 数据范围
 * 二维数组中元素个数范围 [0,1000]
 * 样例
 * 输入数组：
 *
 * [
 *   [1,2,8,9]，
 *   [2,4,9,12]，
 *   [4,7,10,13]，
 *   [6,8,11,15]
 * ]
 *
 * 如果输入查找数值为7，则返回true，
 *
 * 如果输入查找数值为5，则返回false。
 */
class Solution15 {

    public static void main(String[] args) {
        int[][] array = new int[4][4];
        array[0] = new int[]{1, 2, 8, 9};
        array[1] = new int[]{2, 4, 9, 12};
        array[2] = new int[]{4, 7, 10, 13};
        array[3] = new int[]{6, 8, 11, 15};

        System.out.println(searchArray(array, 0));
    }

    public static boolean searchArray(int[][] array, int target) {
        if (array.length == 0 || array[0].length == 0) {
            return false;
        }
        int x = 0;
        int y = array[0].length - 1;
        while (x < array.length && y >= 0)
            if (array[x][y] == target) {
                return true;
            } else if (array[x][y] < target) {
                x++;
            } else {
                y--;
            }
        return false;
    }
}