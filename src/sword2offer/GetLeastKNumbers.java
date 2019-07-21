/**
 * @ClassName GetLeastKNumbers
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/6/12 15:19
 */
package sword2offer;

import java.util.ArrayList;

public class GetLeastKNumbers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        int length=input.length;
        int start=0;
        int end=length-1;
        while(start<k){
            if (input[start]<input[k]) {
                start++;
            }
            if (input[end]>input[k]) {
                end--;
            }
            int temp=input[start];
            input[start]=input[end];
            input[end]=temp;
            start++;
            end++;
        }
        return null;


    }

}
