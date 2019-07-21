/**
 * @ClassName Heapsort
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/2/20 9:15
 */
package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//堆排序,大的在上，可以用来求最小topk问题
public class HeapSort {

    public static int[] sort(int[] array) {
        int N = array.length - 1;
        // 构造堆
        for (int i = (N - 1) / 2; i >= 0 ; i--) {
            sink(array, i, N);
        }
        // 下沉排序
        while (N > 0) {
            // 交换
            int temp = array[0];
            array[0] = array[N];
            array[N] = temp;

            // 下沉0
            sink(array,0, --N);
        }
        return array;
    }

    /**
     * 下沉k索引元素至正确位置
     * @param array 数组
     * @param k
     * @param tail 堆的末尾索引
     */
    public static void sink(int[] array, int k, int tail) {
        while (2 * k + 1 <= tail) {
            int index = 2 * k + 1;
            if (index < tail && array[index] < array[index + 1]) {
                index++;
            }
            //父节点大于子节点，不交换
            if (array[k] >= array[index]) {
                break;
            }
            // 交换，父节点小于子节点
            int temp = array[k];
            array[k] = array[index];
            array[index] = temp;
            k = index;
        }
    }

    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            int[] res = sort(nums);


            for (int i:res) {
                System.out.print(i+",");
            }


        }
    }
}