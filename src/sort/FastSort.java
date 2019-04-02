/**
 * @ClassName FastSort
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019-03-04 21:01
 */
package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

//快速排序
public class FastSort {
    public static void sort(int[] a,int lo,int hi){
        ;
        if(hi<=lo ){
            return;
        }
        int j=partition(a,lo,hi);//切分
        sort(a,lo,j-1);//对左半部分排序
        sort(a,j+1,hi);//对右半部风排序
    }

    private static int partition(int[] a, int lo, int hi) {
        int i=lo;
        int j=hi+1;
        int v =a[lo];
        while(true){
            while(a[++i]<v){
                if(i==hi){
                    break;
                }
            }

//            while((a[++i]<v)&&(i!=hi)){
//            }
            while(a[--j]>v){
                if(j==lo){
                    break;
                }
            }
            if(i>=j){
                break;
            }
            //交换i，j
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
        //交换lo，j
        int t=a[lo];
        a[lo]=a[j];
        a[j]=t;
        return j;

    }

    public static void main(String[] args) {
        int[] nums={4,1,5,2,3,8,7,9,6};
        sort(nums,0,8);
        for (int a:nums) {
            System.out.println(a);
        }
    }
}
