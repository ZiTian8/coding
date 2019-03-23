///**
// * @ClassName Leet
// * @Description
// * @Author HAHA
// * @Version V1.0.0
// * @Date 2019-03-06 20:55
// */
//package leetcode226.easy;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//class Solution {
//    public int rob(int[] nums) {
//        if(nums.length==0){
//            return 0;
//        }
//        if(nums.length==1){
//            return nums[0];
//        }
//
//        if(nums.length==2){
//            return Math.max(nums[0],nums[1]);
//        }
//
//
//        int num1=nums[0];
//        int num2=Math.max(nums[0],nums[1]);
//
//        for(int i=2;i<nums.length;i++){
//            int temp=num2;
//
//            num2=Math.max(temp,num1+nums[i]);
//            num1=temp;
//
//        }
//        return num2;
//
////        num[0]=nums[0];
////        num[1]=Math.max(nums[0],nums[1]);
////        for(int i=2;i<nums.length;i++){
////
////            num[i]=Math.max(num[i-1],num[i-2]+nums[i]);
////
////        }
////        return num[nums.length-1];
//
//    }
//}
//public class LeetCode198 {
//    public static int[] stringToIntegerArray(String input) {
//        input = input.trim();
//        input = input.substring(1, input.length() - 1);
//        if (input.length() == 0) {
//            return new int[0];
//        }
//
//        String[] parts = input.split(",");
//        int[] output = new int[parts.length];
//        for(int index = 0; index < parts.length; index++) {
//            String part = parts[index].trim();
//            output[index] = Integer.parseInt(part);
//        }
//        return output;
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String line;
//        while ((line = in.readLine()) != null) {
//            int[] nums = stringToIntegerArray(line);
//
//            int ret = new Solution().rob(nums);
//
//            String out = String.valueOf(ret);
//
//            System.out.print(out);
//        }
//    }
//}