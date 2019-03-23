/**
 * @ClassName LeetCode219
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/3/11 17:00
 */
package leetcode.easy.leetcode219;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。

 示例 1:

 输入: nums = [1,2,3,1], k = 3
 输出: true
 示例 2:

 输入: nums = [1,0,1,1], k = 1
 输出: true
 示例 3:

 输入: nums = [1,2,3,1,2,3], k = 2
 输出: false


  1 2 3 4
  3
 */
public class LeetCode219 {

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        String num =sc.nextLine();
        String[] parts = num.split(" ");
        int[] nums = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            nums[index] = Integer.parseInt(part);
        }
        int k= sc.nextInt();

        if(nums.length<2){
            System.out.println("false");
        }
        int min =Integer.MAX_VALUE;
        List list = new ArrayList(num.length());
        for(int i =0;i<nums.length;i++){
            if(list.contains(nums[i])){
                min=(i-list.lastIndexOf(nums[i])<min)? i-list.lastIndexOf(nums[i]):min;
                list.add(nums[i]);
            }else{
                list.add(nums[i]);
            }
        }
        if(0<min&&min<=k){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
