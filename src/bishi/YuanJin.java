/**
 * @ClassName YuanJin
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/9/12 19:59
 */
package bishi;

import java.util.Scanner;

public class YuanJin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(",");
        int [] num = new int[str.length];
        for (int i = 0; i <str.length ; i++) {
            num[i]=Integer.valueOf(str[i]);
        }
        int output = 0;
//        int in = num[0];
        for (int i = 1; i <num.length ; i++) {
            if(num[i]<num[i-1]){
            output += num[i-1]-num[i];}
        }
        System.out.println(output);


    }
}
