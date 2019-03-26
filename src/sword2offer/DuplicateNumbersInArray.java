/**
 * @ClassName DuplicateNumbersInArray
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/3/25 17:31
 */
package sword2offer;
/**
 * sword2offer.DuplicateNumbersInArray
 */

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNumbersInArray {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public static boolean duplicate(int numbers[], int length, int[] duplication) {
        if(length==0){
            return false;
        }
        else{Arrays.sort(numbers);
            int flag=0;
            for(int i=1;i<length;i++){

                if(numbers[i]==numbers[i-1]){
                    duplication[0]=numbers[i];
                    flag=1;
                    break;

                }

            }
            if(flag==0){
                return false;
            }else{
                return true;
            }
        }


    }
    //不另外使用空间
    public static boolean duplicate1(int numbers[], int length, int[] duplication) {
        if(length<=1){
            return false;
        }
        for(int i =0;i<length;i++){
            while(numbers[i]!=i){
                if(numbers[i]!=numbers[numbers[i]]){
                    int tem = numbers[numbers[i]];
                    numbers[numbers[i]]=numbers[i];
                    numbers[i]=tem;
                }else{
                    duplication[0]=numbers[i];
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int[] numbers= new int[length];
        int[] duplication=new int[1];
        duplication[0]=-1;
        for(int i =0;i<length;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println(duplicate1(numbers,length,duplication));
        System.out.println(duplication[0]);
    }
}
