/**
 * @ClassName FindNumberIn2DArray
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/3/26 10:41
 */
package sword2offer;

import java.util.Scanner;

public class FindNumberIn2DArray {
    public static boolean Find(int target, int[][] array) {
        boolean flag=false;
//        if(array.length==0){
//            return false;
//        }
        int row=array.length;
        int col=array[0].length;
        int m=0;
        int n=col-1;
        while(m<row&&n>=0){
            if(array[m][n]==target){
                flag=true;
                break;
            }else if(array[m][n]>target){
                --n;
            }else{
                ++m;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m =sc.nextInt();
        int n = sc.nextInt();
        int[][] array= new int[m][n];
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println(Find(0,array));
    }

}
