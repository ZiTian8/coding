/**
 * @ClassName MissingNumber
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/3/22 14:46
 */
package leetcode.easy.c268missingNumber;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] nums = new int[num];
        for(int i=0;i<num;i++){
            nums[i]=sc.nextInt();

        }
        int result=0;
        if(nums.length==1&&nums[0]==0){
            result=1;
        }
        Arrays.sort(nums);
        for(int j=0;j<nums.length-1;j++){
            if(nums[j]+1!=nums[j+1]){
                result=nums[j]+1;
            }
            if(j==nums.length-2){
                result=nums[nums.length-1]+1;
            }
        }
        System.out.println(result);
    }

}
