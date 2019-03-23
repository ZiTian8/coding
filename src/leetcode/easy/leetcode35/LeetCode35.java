/**
 * @ClassName LeetCode35
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/2/18 21:24
 */
package leetcode.easy.leetcode35;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeetCode35 {
    public int searchInsert(int[] nums, int target) {
        int a=-1;
        for (int i = 0; i < nums.length; i++) {

            if ((nums[i] == target)||(nums[i] > target)) {
                a=i;
                break;
            }
        }
        if(a==-1){
            a=nums.length;
        }
        return a;
    }

    public int searchInsert1(int[] nums, int target) {
        return binarySearch(nums,target,0,nums.length-1);
    }
    private int binarySearch(int[] nums, int target, int left, int right) {
        // TODO Auto-generated method stub

        if(left == right){
            if(nums[left] >= target){
                return left;
            }else{
                return right+1;
            }
        }
        int mid = (left + right)/2;
        if(target < nums[mid]){
            return binarySearch(nums,target,left,mid);
        }else if(target == nums[mid]){
            return mid;
        }else{
            return binarySearch(nums,target,mid+1,right);
        }
    }


}
class MainClass {
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
            line = in.readLine();
            int target = Integer.parseInt(line);

            int ret = new LeetCode35().searchInsert1(nums, target);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}