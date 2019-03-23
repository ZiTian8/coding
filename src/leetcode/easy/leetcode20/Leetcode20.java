/**
 * @ClassName Leetcode20
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/1/3 21:19
 */
package leetcode.easy.leetcode20;
/**
 * 判断是不是偶数
 *(len&1) != 1
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leetcode20 {

    public boolean isValid(String s) {
        int len= s.length();
        if(len<0||(len&1) == 1)
            return false;
        else{

        }


        return true;

    }
}
class MainClass {
    public static String stringToString(String input) {
        if (input == null) {
            return "null";
        }
        return input.toString();
    }

    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);

            boolean ret = new Leetcode20().isValid(s);

            String out = booleanToString(ret);

            System.out.print(out);
        }
    }
}