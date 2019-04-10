/**
 * @ClassName ClockwisePrint
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/9 15:01
 */
package sword2offer;

import java.util.ArrayList;
import java.util.List;

public class ClockwisePrint {
    /**
     *
     * @param mat
     * @param n 列数
     * @param m 行数
     * @return
     */
    public int[] clockwisePrint(int[][] mat, int m,int n ) {
        if(mat==null||n==0||m==0){
            return null;
        }
        int start =0;
        List res =new ArrayList(n*m);
        while(n>start*2&&m>start*2){
            PrintNum(mat,n,m,start,res);
            ++start;
        }
        int[] result =new int[n*m];
        for (int i = 0; i <res.size() ; i++) {
            result[i]= (int) res.get(i);
        }
        return result;

    }

    private void PrintNum(int[][] mat, int n, int m, int start,List res) {
        int endX=n-start-1;
        int endY=m-start-1;
        for (int i = start; i <=endX; i++) {
            res.add(mat[start][i]);
        }
        if(start<endY){
            for (int i = start+1; i <=endY ; i++) {
                res.add(mat[i][endX]);

            }
        }if(start<endY&&start<endX){
            for (int i = endX-1; i >=start; --i) {
                res.add(mat[endY][i]);
            }
        }
        if (start<endX&&start<endY-1) {
            for (int i = endY - 1; i >= start + 1; --i) {
                res.add(mat[i][start]);

            }
        }
    }




    public static void main(String[] args) {
        int[][] mat=
                {{57,50,59,18,31,13},{67,86,93,86,4,9},{38,98,83,56,82,90},{66,50,67,11,7,69},{20,58,55,24,66,10},{43,26,65,0,64,28},{62,86,38,19,37,98}};
        int m=7;
        int n =6;
        ClockwisePrint cp=new ClockwisePrint();
        int[] res=cp.clockwisePrint(mat,m,n);
        System.out.println(res);
    }


}
