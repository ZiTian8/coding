/**
 * @ClassName T1
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/9/18 19:50
 */
package bishi.aiqiyi;

import java.util.Arrays;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            num[i]=sc.nextInt();
            sum+=num[i];
        }
        int m =--n;
        Arrays.sort(num);
        int out = num[m];
        while(sum>=out*m){
            out++;
        }
        System.out.println(out);

//        if(n<=2){
//            System.out.println(sum);
//        }else {
//            for (int i = num.length - 1; i >= 0; i--) {
//
//            }
//        }
//
//        if(sum%n==0){
//            System.out.println(sum/m);
//        }
//        else{
//            System.out.println(sum/m+1);
//        }

    }
}
