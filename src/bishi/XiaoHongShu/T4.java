/**
 * @ClassName T4
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/9/14 15:59
 */
package bishi.XiaoHongShu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] input = new int[n][2];
        for (int i = 0; i < n; i++) {
            input[i][0] = sc.nextInt();
            input[i][1] = sc.nextInt();
        }
        int len = input.length;
        if (len < 2) {
            System.out.println(len);
        }

        Arrays.sort(input, new Comparator<int[]>() {
            @Override
            public int compare(int[] input1, int[] input2) {
                if (input1[0] != input2[0]) {
                    return input1[0] - input2[0];
                }
                return input2[1] - input1[1];
            }
        });


        int[] tail = new int[len];
        tail[0] = input[0][1];

        // end 表示有序数组 tail 的最后一个已经赋值元素的索引
        int end = 0;

        for (int i = 1; i < len; i++) {
            int target = input[i][1];
            if (target > tail[end]) {
                end++;
                tail[end] = target;
            } else {
                int left = 0;
                int right = end;

                while (left < right) {
                    int mid = (left + right) >>> 1;
                    if (tail[mid] < target) {
                        left = mid + 1;
                    } else {
                        right = mid;
                    }
                }
                tail[left] = target;
            }
        }
        System.out.println(end + 1);
    }

}
            

        



