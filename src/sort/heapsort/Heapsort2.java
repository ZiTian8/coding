/**
 * @ClassName Heapsort
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/2/20 9:15
 */
package sort.heapsort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Heapsort2 {
    
    public static int[] sort(int[] nums){
        int len=nums.length;
        for(int k=len/2;k>=0;k--){
            sink(nums,k,len);
        }
//        while(len>1){
//            exch(nums,1,len--);
//            sink(nums,1,len);
//        }
        return nums;
    }

    private static void sink(int[] nums, int i, int len) {
        /**
         * 由上至下的堆有序化
         */

            int j = 2*i;
            int largest=i;
            if(j<len&&nums[j]>nums[largest]){
                largest=j;
            }
            if((j+1)<len&&nums[j+1]>nums[largest]){
                largest=j+1;
            }
            if(largest!=i){
                exch(nums,i,largest);
                sink(nums,largest,len);
            }

    }
    private static void exch(int[] nums, int i, int j) {
        /**
         * 交换nums数组中下标为i和j的元素
         */
        int t= (int) nums[i];
        nums[i]=nums[j];
        nums[j]=t;
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