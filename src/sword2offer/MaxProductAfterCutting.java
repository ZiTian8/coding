/**
 * @ClassName MaxProductAfterCutting
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/3/29 14:17
 */
package sword2offer;

public class MaxProductAfterCutting {
    public int maxProductAfterCutting(int n ){
        if(n<2){
            return 0;
        }
        if(n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }
        int[] max=new int[n+1];
        max[0]=0;
        max[1]=1;
        max[2]=2;
        max[3]=3;
        int m=0;

        for(int i =4;i<=n;i++){
            m=0;
            for(int j =1;j<=i;j++){
                int tem=max[j]*max[i-j];
                if(m<tem){
                    m=tem;
                }
                max[i]=m;
            }
        }
        return max[n];
    }

    public static void main(String[] args) {
        MaxProductAfterCutting max=new MaxProductAfterCutting();
        System.out.println(max.maxProductAfterCutting(8));
    }
}
