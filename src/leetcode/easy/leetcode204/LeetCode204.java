/**
 * @ClassName LeetCode204
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019-03-09 19:43
 */
package leetcode.easy.leetcode204;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**统计所有小于非负整数 n 的质数的数量。
 示例:
 输入: 10
 输出: 4
 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 *
 */


class Solution {
    public int countPrimes(int n) {
        int count =0;
        boolean[] val=new boolean[n];
        for(int i=2;i*i<n;i++){
            //这个判断条件，是应为开始i=2，所以val中下标为偶数的全部已经判为true，当后面i再为偶数，
            // 即val[i]为true时，第二for循环中j*i的值也为偶数，即第二个for循环也是再判断偶数下表，而这再第一步i=2时已经判断过了，因此后面
            // i再为偶数时就不用进第二个for循环了
            if(!val[i]){
                for(int j=i;j*i<n;j++){
                    val[i*j]=true;
                }
            }
        }
        for(int i=2; i<n; i++) {
            if(val[i] == false){
                ++count;
            }
        }
        return count;



    }
}
public class LeetCode204 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);

            int ret = new Solution().countPrimes(n);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}