/**
 * @ClassName InsertSort
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/2/19 18:04
 */
package sort.InsertSort;
//插入排序
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertSort {

    public static int[] insertSort(int[] nums){
        for(int j  =1;j<nums.length;j++){
            int key=nums[j];
            int i=j-1;
            while(i>=0&&nums[i]>key){
                nums[i+1]=nums[i];
                i=i-1;
            }
            nums[i+1]=key;

        }
        return nums;
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
