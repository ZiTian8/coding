/**
 * @ClassName T1
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/10/10 18:43
 */
package bishi.mihayou;

import java.util.Arrays;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        int max = nums[n-1];
        int[] num = new int[max];
        int zer0=0;
        boolean flag= false;
        Arrays.fill(num,-1);
        int m =0;
        for (int i = 0; i <n ; i++) {
            m = nums[i];
            if(m==0) zer0++;
            else if(num[m-1]==-1) num[m-1]=1;
            else if(num[m-1]==1) flag=true;
        }
        if(flag) System.out.println("NO+"+zer0);
        else{
            boolean f = false;
            int zre0s=0;
            int out =0;
            for (int i : num) {
                if(!f&&i==1) f=true;
                if(f){
                    if(i==-1) zre0s++;
                    out++;
                }
                if(out==n) break;

            }
            if(zer0>=zre0s) System.out.println("YES+"+zer0);
            else System.out.println("NO+"+zer0);
        }
    }
}
