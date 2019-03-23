/**
 * @ClassName leetcode9
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/1/2 19:37
 */
package leetcode.easy.leetcode9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */

class leetcode9 {
    //232ms
    public boolean isPalindrome1(int x) {
        if (x < 0) return false;
        String s = String.valueOf(x); //将数字转为为字符串
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;

    }public boolean isPalindrome2(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);


    }
}

class MainClass {
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);

            boolean ret = new leetcode9().isPalindrome2(x);

            String out = booleanToString(ret);

            System.out.print(out);
        }
    }
}