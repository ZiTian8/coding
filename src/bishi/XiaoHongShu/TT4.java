/**
 * @ClassName TT4
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/9/14 16:45
 */
package bishi.XiaoHongShu;

import java.util.Arrays;
import java.util.Scanner;

public class TT4 {


    public static int help(int[][] edg, int[] d, int index) {
        if (d[index] >= 0)
            return d[index];
        d[index] = 1;
        for (int i = 0; i < edg.length; i++) {
            if (edg[index][i] == 1) {
                int temp = help(edg, d, i) + 1;
                if (temp > d[index])
                    d[index] = temp;
            }
        }
        return d[index];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] a = new int[n][2];
        int[][] edg = new int[n][n];
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        for (int i = 0; i < n; i++) {

            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {        //用邻接矩阵存储各个矩形的包含关系
            for (int j = i + 1; j < n; j++) {
                if ((a[i][0] <= a[j][0] && a[i][1] <= a[j][1])) {
                    edg[i][j] = 1;
                } else if ((a[i][0] >= a[j][0] && a[i][1] >= a[j][1])) {
                    edg[j][i] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            help(edg, dp, i);
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] > max) {
                max = dp[i];

            }
        }
        System.out.println(max);

    }
}
