/**
 * @ClassName T3
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/9/15 16:38
 */
package bishi.ZiJie1;

import java.util.ArrayList;
import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

    }
}
