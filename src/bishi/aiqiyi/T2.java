/**
 * @ClassName T2
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/9/18 20:39
 */
package bishi.aiqiyi;

import java.util.Arrays;
import java.util.Scanner;

public class T2 {
    

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = 1 << n;
            int[] A = new int[k];
            for (int i = 0; i < k; i++) {
                A[i] = sc.nextInt();
            }

            for (int i = 0; i < m; i++) {
                int j = sc.nextInt();
                int newValue = sc.nextInt();
                A[j - 1] = newValue;

                System.out.println(help(Arrays.copyOf(A, k), k));
            }
        }

        private static int help(int[] arr, int end) {
            while(end>1){
                for (int i = 0; i < end / 2; i++) {
                    arr[i] = arr[i * 2] | arr[i * 2 + 1];
                }

                for (int i = 0; i < end / 4; i++) {
                    arr[i] = arr[i * 2] ^ arr[i * 2 + 1];
                }
                end /= 4;
            }

            return arr[0];



        }
    
}
