/**
 * @ClassName T2
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/10/18 19:22
 */
package bishi.liulishuo;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        long a =1,b=2;
        long temp=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1) System.out.println(1);
        else if(n==2) System.out.println(2);
        else{
            for (int i = 2; i < n; i++) {
                temp=a+b;
                a=b;
                b=temp;

            }
            System.out.println(temp);
        }

    }

}
