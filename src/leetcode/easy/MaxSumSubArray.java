/**
 * @ClassName MaxSumSubArray
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/5/6 15:04
 */
package leetcode.easy;

public class MaxSumSubArray {
    public static int getMax(int[] array){
        int temp=array[0];
        int max=temp;
        int len=array.length;
        for (int i = 1; i <len ; i++) {
            temp=Math.max(temp+array[i],array[i]);
            max=Math.max(temp,max);
        }
        return max;


    }

    public static void main(String[] args) {
        int[] array={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(getMax(array));
    }




}
