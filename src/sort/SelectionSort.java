/**
 * @ClassName SelectionSort
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/2 16:13
 */
package sort;

import utils.ArrayUtils;

public class SelectionSort {
    public static int[] sort(int[] array) {
        // 外层循环控制着每一次数组最小值的寻找范围，也就是定义了起点
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            // 内存循环寻找最小值所在位置
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // 交换位置
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {53, 34, 32, 56, 62, 121, 55};
        ArrayUtils.printIntArray(sort(array));
    }
}
