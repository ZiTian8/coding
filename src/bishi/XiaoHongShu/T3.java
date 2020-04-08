/**
 * @ClassName T3
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/9/14 15:46
 */
package bishi.XiaoHongShu;

import java.util.Scanner;
public class T3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = in.nextInt();
            }

            int[] res = solution(n, arr);
            System.out.printf("%d %d\n",res[0],res[1]);
        }
    }

    static int[] solution(int n, int[] arr){
        int[] res = new int[2];

        int[] dp = new int[n];
        int[] num = new int[n];
        num[0] = 1;
        num[1] = 1;
        dp[0] = arr[0];

        int index = 0;
        for(int k=1; k<n; k++){
            for(int i = k; i>=0; i--){
                int temp  = arr[i] + ((i-2)<0? 0:dp[i-2]);
                if(dp[k]<=temp){
                    num[k] = 1 + ((i-2)<0? 0:num[i-2]);
                    dp[k] = temp;
                    index = i;
                }
            }
        }

        res[0] = dp[n-1];
        res[1] = num[n-1];
        // res[1] = (index+2)/2;
        return res;
    }
}
