/**
 * @ClassName t1
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/9/26 20:21
 */
package bishi.t360;

import java.util.HashMap;
import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        double[] num = new double[n];
        double temp=0;
        for (int i = 0; i <n ; i++) {
            num[i]=sc.nextInt();
            if(i<m) temp+=num[i];
        }

        int number=m;
        int last=0;
        double max=temp/m;
        double out=0;
        int templast=0;
        for (int i = m; i <n ; i++) {
//            temp+=num[i];
//            temp-=num[i-m];
            temp=0;
            number=m-1;
            for (int j = i; j >=i-m+2 ; j--) {
                temp+=num[j];
            }
            max=0;
            for (int j = i-m+1; j >=last; j--) {
                temp+=num[j];
                number++;
                if(max<=temp/number){
                    max=temp/number;
                    templast=j;
                }

            }
            last=templast;
            if(max>out) out=max;
        }
        System.out.println(out);
        HashMap map= new HashMap();
//        ConcurrentHashMap


    }
}
