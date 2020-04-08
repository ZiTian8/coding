/**
 * @ClassName T2
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/9/15 16:18
 */
package bishi.ZiJie1;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] in = new int[n][2];
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            map.put(sc.nextInt(),sc.nextInt());
            in[i][0]=sc.nextInt();
            in[i][1]=sc.nextInt();
        }

        int max = 0;
        int curnum=0;
        int lasttime=1;
        for (Map.Entry entry : map.entrySet()) {
            if(curnum-((int)entry.getKey()-lasttime)>0){
                curnum=curnum-((int)entry.getKey()-lasttime)+(int)entry.getValue();
            }else{
                curnum=(int)entry.getValue();
            }
            max = max>curnum?max:curnum;
            lasttime = (int)entry.getKey();

        }
        int time=lasttime+curnum;
        System.out.print(time+" ");
        System.out.print(max);
    }
}
