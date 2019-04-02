/**
 * @ClassName InsertSort
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/2/19 18:04
 */
package sort;
//插入排序
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertSort {

    public static int[] insertSort(int[] array){
        // 外层循环选择插入的牌，第一张已经排好
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            // 内存循环从后向前扫描，寻找正确的插入位置
            for (; j > 0 && temp < array[j - 1]; j--) {
                // 元素向后移动腾出位置
                array[j] = array[j - 1];
            }
            array[j] = temp;
        }
        return array;
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

            int[] res=insertSort(nums);

            String out = String.valueOf(res);
            for (int i:res){
                System.out.print(i+" ");
            }

        }

    }

}
