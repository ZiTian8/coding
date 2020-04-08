/**
 * @ClassName T4
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/9/15 16:58
 */
package bishi.ZiJie1;

import java.util.Scanner;
public class T4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int happy=0;
        int[][] in= new int[n][3];

        int num = 0;
        for (int i = 0; i < n; i++) {
            int p1=sc.nextInt();
            int p2=sc.nextInt();
            int h = sc.nextInt();
            if(h>=0){
                if(p1-p2>=p2){
                    happy+=h;
                    x=x+p1-2*p2;
                }
                else {
                    in[num][0]=p1;
                    in[num][1]=p2;
                    in[num][2]=h;
                    num++;

                }
            }

        }
        int[] dp = new int[x+1];
        for (int i = 0; i <num ; i++) {
            for (int j =x;j>=in[i][1];j--){
                dp[j]=Math.max(dp[j],dp[j-in[i][1]+in[i][0]-in[i][1]]+in[i][2]);
            }

        }
        System.out.println(dp[x]+happy);
    }
}
