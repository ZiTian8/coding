/**
 * @ClassName T1
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/10/10 20:52
 */
package bishi.pingan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c1=s.split(" ")[0].toCharArray();
        char[] c2=s.split(" ")[1].toCharArray();
        int[][] dp = new int[c1.length][c2.length];
        int max=0;
        ArrayList<String> array=new ArrayList<>();
        for (int i = 0; i < c1.length; i++) {
            for (int j = 0; j < c2.length; j++) {
                if(c1[i]==c2[j]){
                    if(i>0&&j>0) dp[i][j]=dp[i-1][j-1]+1;
                    else dp[i][j]=1;

                    max = Math.max(max,dp[i][j]);
                }
                else dp[i][j]=0;
            }

        }
        for (int i = 0; i < c1.length; i++) {
            for (int j = 0; j < c2.length; j++) {
                if(dp[i][j]==max){
                    int index=max-1;
                    int tempi=i;
                    char[] tempc = new char[max];
                    while(tempi>=0&&index>=0){
                        tempc[index]=c1[tempi];
                        tempi--;
                        index--;
                    }
                    array.add(String.valueOf(tempc));

                }
            }
        }
        Collections.sort(array);
        for (String s1 : array) {
            System.out.println(s1);
        }
    }
}
