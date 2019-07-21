/**
 * @ClassName Exam360
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/24 19:34
 */
package exam;

import java.util.Scanner;

public class Exam360 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] in=new int [n];
        for (int i = 0; i <n ; i++) {
            in[i]=sc.nextInt();

        }
        int res=0;
        for (int i = 0; i <in.length ; ++i) {
            int tem=in[i];
            while (tem>2&&tem%3==0){
                ++res;
                tem=tem/3;
            }
        }
        System.out.println(res);


    }
}
