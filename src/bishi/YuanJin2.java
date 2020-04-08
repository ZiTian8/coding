/**
 * @ClassName YuanJin2
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/9/12 20:15
 */
package bishi;

import java.util.Scanner;

public class YuanJin2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String[] str1=s1.split(",");
        int m = Integer.valueOf(str1[0]);
        int n = Integer.valueOf(str1[1]);
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            String s2 = sc.nextLine();
            String[] str2 = s2.split(",");
            for (int i1 = 0; i1 < str2.length; i1++) {
                arr[i][i1]=Integer.valueOf(str2[i1]);
            }

        }
        int output = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] ==1){
                    int num = help(arr,i,j);
                    output = Math.max(num,output);
                }

            }

        }
        System.out.println(output);




    }
    private static int help(int[][] arr,int i, int j){
        if(i>=0&&i<arr.length&&j>=0&&j<arr[0].length&&arr[i][j]==1){
            arr[i][j]=0;
            int num =1+help(arr,i-1,j)+help(arr,i+1,j)+help(arr,i,j-1)+help(arr,i,j+1);
            return num;
        }else return 0;
    }
}
