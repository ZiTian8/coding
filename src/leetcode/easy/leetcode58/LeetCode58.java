/**
 * @ClassName LeetCode58
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/2/20 19:47
 */

//没写
package leetcode.easy.leetcode58;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public int lengthOfLastWord(String s) {
        return 1;
    }
}


public class LeetCode58 {
    public static String stringToString(String input) {
        if (input == null) {
            return "null";
        }
        return input.toString();
//        return input.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);

            int ret = new Solution().lengthOfLastWord(s);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}
