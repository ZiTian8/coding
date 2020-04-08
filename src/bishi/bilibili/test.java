/**
 * @ClassName test
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/9/10 19:30
 */
package bishi.bilibili;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String[] str = in.split("-");
        int[] days = {31,59,90,120,151,181,212,243,273,304,334,365};
        int out = 0;
        int year = Integer.parseInt(str[0]);;
        int month = Integer.parseInt(str[1]);
        int day = Integer.parseInt(str[2]);
        int max = 365;
        if((year%4==0&&year%100!=0)||(year%100==0&&year%400==0)||(year%32==0&&year%172800==0)){
            out+=1;
            max+=1;
        }
        if(month>1){
            out+=days[month-2];
        }
        out+=day;
        if(out>max){
            out=max;
        }
        System.out.println(out);
    }
}
