/**
 * @ClassName T2
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/10/17 15:37
 */
package bishi.duoduoji;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n][2];
        for (int i = 0; i < n; i++) {
            nums[i][0]=sc.nextInt();
            nums[i][1]=sc.nextInt();
        }
        int[] out = new int[n];

        for (int i = 0; i < nums.length; i++) {
            int opt=1;
            if(nums[i][0]<0&&nums[i][1]<0){
                nums[i][0]=-nums[i][0];
                nums[i][1]=-nums[i][1];
                opt=-1;
            }
            if(nums[i][0]==nums[i][1]) out[i]=1;
            else if(nums[i][0]>nums[i][1]) out[i]=0;
            else{
                int[] num = new int[nums[i][1]+1];
                num[nums[i][0]]=1;

                out[i]=help(num,nums[i][0],opt)[nums[i][1]];
            }

        }
        for (int i : out) {
            System.out.println(i-1);
        }

    }

    private static int[] help(int[] num,int i ,int opt) {
        if(2*i<num.length) {
            num[2*i]=num[i]+1;
            help(num,2*i,opt);
        }
        if(10*i+opt<num.length){
            num[10*i+opt]=num[i]+1;
            help(num,10*i+opt,opt);
        }
        return num;
    }
}
