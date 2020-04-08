/**
 * @ClassName T1
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/10/18 19:48
 */
package bishi.liulishuo;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String[] sarry1 = s1.split(" ");
        String[] sarry2 = s2.split(" ");
        int len = sarry1.length;
        int[][] num = new int[len][2];
        for (int i = 0; i < len; i++) {
            num[i][0]=Integer.valueOf(sarry1[i]);
            num[i][1]=Integer.valueOf(sarry2[i]);
        }
        int count =1;
        for (int i = 0; i < len-1; i++) {
            for (int j = i+1; j < len-1 ; j++) {
                if(num[j][0]<num[i][0]) count++;
            }

        }
        System.out.println(count);
    }

}
