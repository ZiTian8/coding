/**
 * @ClassName LeetCode169
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/2/19 19:29
 */
package leetcode.easy.leetcode169;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public int majorityElement(int[] nums) {
        //find1:分治算法，4ms,29mb内存
        //find2：将不同的元素删除，7ms，40mb内存   https://blog.csdn.net/DERRANTCM/article/details/47902549
        //return find(nums,0,nums.length-1);
        return find2(nums);



    }

    public static int find2(int[] nums){
        int main=nums[0];
        int count=1;

        for(int i=1;i<nums.length;i++){
            if(main==nums[i]){
                count++;
            }else{
                if(count>0){
                    count--;
                }else{
                    main=nums[i];
                }
            }
        }
        return main;
    }

    public static int find(int[] nums,int begin,int end) {
        if (begin == end) {
            return nums[begin];
        } else {
            int mid = (begin + end) / 2;
            int x = find(nums, begin, mid);
            int y = find(nums, mid+1, end);


            if (x == y) {
                return x;
            } else {
                int xcount = 0;
                int ycount = 0;
                for (int i =begin;i<=end;i++) {
                    if (nums[i] == x) {
                        xcount++;
                    } else if (nums[i]==y){
                        ycount++;
                    }
                }
                if (xcount > ycount) {
                    return x;
                }else{
                    return y;
                }

            }
        }
    }
}

public class LeetCode169 {
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

            int ret = new Solution().majorityElement(nums);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}



