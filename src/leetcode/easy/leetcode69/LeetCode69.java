/**
 * @ClassName LeetCode69
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/2/21 20:02
 */
package leetcode.easy.leetcode69;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *实现 int sqrt(int x) 函数。
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 */
class Solution {
    public int mySqrt(int x) {

        if (x <= 1) {
            return x;
        }
        int r = x;
        while (r > x / r) {
            r = Math.abs((r + x / r)/ 2);
        }
        return (int) r;

    }
}

public class LeetCode69 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);

            int ret = new Solution().mySqrt(x);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}

