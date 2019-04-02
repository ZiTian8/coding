/**
 * @ClassName BubbleSort
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/2 16:10
 */
package sort;

import utils.ArrayUtils;

//冒泡排序
public class BubbleSort {
    public static int[] sort(int[] array) {
        // 外层循环表示所有趟，定义每一趟的终点
        for (int i = array.length - 1; i > 0 ; i--) {
            // 内层循环定义每一趟起点，以及比换的过程
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {53,34,32,56,62,121,55};
        ArrayUtils.printIntArray(sort(array));
    }
}