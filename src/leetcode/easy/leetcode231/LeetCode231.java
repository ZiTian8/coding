/**
 * @ClassName LeetCode231
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/3/13 14:34
 */
package leetcode.easy.leetcode231;

import java.util.Scanner;

public class LeetCode231 {
    public static void main(String[] args) {
        //System.out.println(2%2);
        Scanner in = new Scanner(System.in);
        int num= in.nextInt();

        if(num<=0){
            System.out.println("false");
        }else{
            System.out.println((num & (num-1)) == 0);
        }
        //fun1(num);

    }

    private static void fun1(int num) {
        if (num % 2 == 1 && num != 1 || num == 0) {

            System.out.println("false");
        } else {
            while (num % 2 == 0) {
                num = num / 2;

            }
            if (num == 1) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
