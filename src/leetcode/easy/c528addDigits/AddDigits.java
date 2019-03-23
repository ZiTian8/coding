/**
 * @ClassName AddDigits
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/3/21 20:40
 */
package leetcode.easy.c528addDigits;

import java.util.Scanner;

/**
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
 * 示例:
 * 输入: 38
 * 输出: 2
 * 解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
 */

public class AddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();

        while(nums>9){
            int temp = 0;
            while(nums!=0){
                temp=temp+(nums%10);
                nums =nums/10;
            }
            nums=temp;
        }


        System.out.println(nums);

    }
}
