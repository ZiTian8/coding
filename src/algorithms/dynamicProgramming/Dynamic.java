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

public class Dynamic {

    public int cut(int[]p,int n){
        int[]r =new int[n+1];
        for(int i =0;i<r.length;i++){
            r[i]=-1;
        }
        return cutMem(p,n,r);

    }

    private int cutMem(int[] p, int n, int[] r) {
        if (r[n]>=0){
            return r[n];
        }
        int q=-1;
        if (n==0){
            q=0;
        }else {
            for(int i =0;i<=n-1;i++){
                q=Math.max(q,p[i]+cutMem(p,n-i-1,r));
            }
        }
        r[n]=q;
        return q;
    }

    public static void main(String[] args) {
        int[] p={1,5,8,9,10,17,17,20,24,30};
        int a=3;
        int b = new Dynamic().cut(p,a);
        System.out.println(b);

    }
}
