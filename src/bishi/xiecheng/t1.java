/**
 * @ClassName t1
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/10/14 11:06
 */
package bishi.xiecheng;

import java.util.HashSet;
import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[]a =new int[n];
        HashSet<Integer> set = new HashSet(m);
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int[][]p=new int[m][n];

        for (int i = 0; i < m; i++) {
            set.add(i);
            for (int j = 0; j < n; j++) {
                p[i][j]=sc.nextInt();
            }
        }
        int res=0;


        for (int i = 0; i < m; i++) {
            int[] arr=help(p,set);
            if(a[arr[1]]!=0){
                a[arr[1]]=a[arr[1]]-1;
                if(a[arr[1]]==0){
                    set.remove(arr[1]);
                }
                res+=arr[2];
                for (int i1 = 0; i1 < p[arr[0]].length; i1++) {
                    p[arr[0]][i1]=-1;
                }
            }
        }
        System.out.println(res);



    }
    private static int[] help(int[][] num,HashSet set){
        int m =0;
        int n =0;
        int max=0;
        for (int i = 0; i <num.length ; i++) {
            if(num[i][0]==-1) continue;
            for (int j = 0; j < num[0].length; j++) {

                if(num[i][j]>max&&set.contains(j)){
                    max=num[i][j];
                    m=i;
                    n=j;
                }

            }

        }
        int[] out= new int[3];
        out[0]=m;
        out[1]=n;
        out[2]=max;
        return out;
    }
}
