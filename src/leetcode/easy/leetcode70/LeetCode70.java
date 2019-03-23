/**
 * @ClassName LeetCode70
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/2/22 11:05
 */
package leetcode.easy.leetcode70;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 */

class Solution {
    public int climbStairs(int n) {

        if(n<3){
            return n;
        }
        int[]s=new int[n+1];
        if(n>2){

            s[0]=0;
            s[1]=1;
            s[2]=2;
            for(int i =3;i<=n;i++){
                s[i]=s[i-1]+s[i-2];
            }
        }
        return s[n];
    }
    public int climbStairs2(int n) {

        if(n<3){
            return n;
        }
        int a=1;
        int b=2;
        if(n>2){

            for(int i =3;i<=n;i++){
                int tem=a;
                a=b;
                b=tem+a;
            }
        }
        return b;
    }
}

public class LeetCode70 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);

            int ret = new Solution().climbStairs2(n);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}
