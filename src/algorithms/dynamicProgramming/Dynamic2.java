/**
 * @ClassName Dynamic
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/2/22 9:41
 */
package algorithms.dynamicProgramming;

//动态规划算法，
//钢条切割问题：算法导论15章

public class Dynamic2 {

    public int cut(int[]p,int n){
        int[]r =new int[n+1];
        r[0]=0;

        for(int j =1;j<=n;j++){
            int q=-1;
            for(int i =1;i<=j;i++){
                q=Math.max(q,p[i]+r[j-i]);
            }
            r[j]=q;
        }
        return r[n];


    }

    public static void main(String[] args) {
        int[] p={0,1,5,8,9,10,17,17,20,24,30};
        int a=4;
        int b = new Dynamic2().cut(p,a);
        System.out.println(b);

    }
}
