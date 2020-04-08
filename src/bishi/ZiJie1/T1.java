/**
 * @ClassName T1
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/9/15 16:03
 */
package bishi.ZiJie1;

import java.util.Arrays;
import java.util.Scanner;

public class T1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        Arrays.sort(arr);
        int out = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]+arr[j]>=k) break;
                for (int l = j+1; l <arr.length ; l++) {
                    if(arr[i]+arr[j]+arr[l]<k){
                        out++;
                    }
                    else{
                        break;
                    }

                }

            }
        }
        System.out.println(out);

    }
}
