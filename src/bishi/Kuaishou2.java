/**
 * @ClassName Kuaishou2
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/8/25 17:40
 */
package bishi;


import java.util.Scanner;

public class Kuaishou2 {

    public static void printAllFolds(int N) {
        printProcess(1, N, false);
    }

    //i表示当前层数
    public static void printProcess(int i, int N, boolean down) {
        if (i > N) {
            return;
        }
        printProcess(i + 1, N, true);
        System.out.println(down ? "up " : "down ");
        printProcess(i + 1, N, false);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printAllFolds(n);
    }
}

