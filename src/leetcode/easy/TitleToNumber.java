/**
 * @ClassName TitleToNumber
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/9 12:32
 */
package leetcode.easy;

import java.util.Scanner;

public class TitleToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        int n= str.length();
        int res=0;
        for(int i=0;i<n;++i){
            res=res*26+(str.charAt(i))-64;
        }
        System.out.println(res);


    }
}
