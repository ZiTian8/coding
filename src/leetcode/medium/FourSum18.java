/**
 * @ClassName FourSum18
 * @Description
 * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，
 * 使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 *
 * 注意：
 *
 * 答案中不可以包含重复的四元组。
 *
 * 示例：
 *
 * 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
 *
 * 满足要求的四元组集合为：
 * [
 *   [-1,  0, 0, 1],
 *   [-2, -1, 1, 2],
 *   [-2,  0, 0, 2]
 * ]
 *
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/8/15 16:07
 */
package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> output = new ArrayList<>();
        int len = nums.length;
        if(len<4) return output;
        Arrays.sort(nums);
        for (int i = 0; i < len-3; i++) {
            if(i>0&&nums[i]==nums[i-1])continue;
            int sum1=nums[i];
            if(sum1>target&&nums[i]>=0) break;
            for (int j = i+1; j <len -2; j++) {
                if(j>i+1&&nums[j]==nums[j-1])continue;
                int sum2= sum1+nums[j];
                if(sum2>target&&nums[j]>=0) break;
                for (int k = j+1; k <len-1 ; k++) {
                    if(k>j+1&&nums[k]==nums[k-1])continue;
                    int sum3 = sum2+nums[k];
                    if(sum3>target&&nums[k]>=0) break;
                    for (int l = k+1; l <len ; l++) {
                        if(l>k+1&&nums[l]==nums[l-1])continue;
                        int sum4 = sum3+nums[l];
                        if(sum4 ==target){
                            List<Integer> temp = new ArrayList<>(4);
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            temp.add(nums[l]);
                            output.add(temp);
                        }
                        if(sum4>target&&nums[l]>=0) break;
                    }

                }

            }
        }
        return output;


    }
    public List<List<Integer>> fourSum2(int[] nums, int target) {
        return kSum(nums,target,4,0);
    }
    public static ArrayList<List<Integer>> kSum(int nums[],int target,int k, int start){
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if(start>=nums.length)
            return res;
        if(k==2){
            int l = start, h = nums.length-1;
            while(l<h){
                if(nums[l]+nums[h]==target){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[l]);
                    list.add(nums[h]);
                    res.add(list);
                    while(l<h&&nums[l]==nums[l+1])
                        l++;
                    while(l<h&&nums[h]==nums[h-1])
                        h--;
                    l++;
                    h--;
                }else if(nums[l]+nums[h]<target)
                    l++;
                else
                    h--;
            }
            return res;
        }
        if(k>2){
            for(int i=start;i<nums.length-k+1;i++){
                ArrayList<List<Integer>> temp = kSum(nums, target - nums[i], k - 1, i + 1);
                if(temp!=null) {
                    for (List<Integer> l : temp) {
                        l.add(0, nums[i]);
                    }
                    res.addAll(temp);
                }
                while(i<nums.length-1&&nums[i]==nums[i+1]){
                    i++;
                }
            }
            return res;
        }
        return res;
    }

    public static void main(String[] args) {
        //[1,-2,-5,-4,-3,3,3,5]
        //-11
        int[] nums = {1, 0, -1, 0, -2, 2};
        FourSum18 solution = new FourSum18();
        solution.fourSum2(nums,0);
        System.out.println("=====");
    }
}
