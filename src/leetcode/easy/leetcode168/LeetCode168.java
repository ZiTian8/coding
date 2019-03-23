/**
 * @ClassName LeetCode168
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019-03-05 19:30
 */
package leetcode.easy.leetcode168;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称。
 *
 * 例如，
 *
 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB
 *     ...
 */
class Solution {
    public String convertToTitle(int n) {
        String s="";
        while(n!=0){
            int temp =(n-1)%26;
            System.out.println('A');
            System.out.println('A'+temp);
            System.out.println((char)('A'+temp));
            s=(char)('A' +temp) +s;
            n=(n-1)/26;
        }
        return s;

    }
}
public class LeetCode168 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);

            String ret = new Solution().convertToTitle(n);

            String out = (ret);

            System.out.print(out);
        }
    }
}