/**
 * @ClassName T1
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/9/14 15:18
 */
package bishi.XiaoHongShu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class T1 {
    
    static int output = 0;
    static int[][] help;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] num = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j>i){
                    num[i][j]=sc.nextInt();
                }

            }
        }
        System.out.println(getnum(num));
    }

    public static int getnum(int[][] num) {
        int m = num.length;
        if (m == 0) return 0;
        int n = num[0].length;
        HashMap<Integer, ArrayList> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(num[i][j]==1){
                    if(map.containsKey(i)){
                        ArrayList list=map.get(i);
                        list.add(j);
                        map.put(i,list);
                    }
                }

            }
        }








        help = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (help[i][j] == 0 && num[i][j] == 1) {
                    output++;
                    back(num, i, j, m, n);
                }

            }
        }
        return output;
    }

    public static void back(int[][] num, int i, int j, int m, int n) {

        if (num[i][j] == 1 && help[i][j] == 0) help[i][j] = 1;
        else return;
        if (i + 1 < m) back(num, i + 1, j, m, n);
        if (j + 1 < n) back(num, i, j + 1, m, n);
        if (i - 1 >= 0) back(num, i - 1, j, m, n);
        if (j - 1 >= 0) back(num, i, j - 1, m, n);

        return;
    }
}
