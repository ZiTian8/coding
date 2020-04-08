/**
 * @ClassName T1
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/10/17 15:08
 */
package bishi.duoduoji;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        int max=0;
        int dp[] = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
                max= Math.max(max, dp[i]);
            }
            else if(s.charAt(i) == ']'){
                if (s.charAt(i - 1) == '[') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '[') {
                    dp[i] = dp[i - 1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
                max= Math.max(max, dp[i]);
            }
        }
        System.out.println(max);


    }
}
