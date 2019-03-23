/**
 * @ClassName test
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/2/19 16:26
 */
package leetcode.easy.leetcode53;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6,7};

        int mid=(0+a.length)/2;
        System.out.println(mid);
        System.out.println(a[mid]);

        int[] b = Arrays.copyOfRange(a,0,a.length);
        for(int i:b){
            System.out.print(i);
        }

    }
}
