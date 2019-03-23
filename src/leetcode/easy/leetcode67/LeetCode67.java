/**
 * @ClassName LeetCode67
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/2/20 20:04
 */
package leetcode.easy.leetcode67;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public String addBinary(String a, String b) {
        int maxLen=Math.max(a.length(),b.length());
        StringBuilder sb=new StringBuilder();
        int carry=0;
        for(int i =0;i<=maxLen;i++){
            int tempA=a.length()>i ? a.charAt(a.length()-i-1)-'0':0 ;
            int tempB=b.length()>i ? b.charAt(b.length()-i-1)-'0':0 ;
            sb.insert(0,(tempA+tempB+carry)%2);
            carry=tempA+tempB+carry>1?1:0;
        }
        if(carry==1){
            sb.insert(0,1);
        }
        return sb.toString();
    }
}

public class LeetCode67 {
    public static String stringToString(String input) {
        if (input == null) {
            return "null";
        }
        return input.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String a = stringToString(line);
            line = in.readLine();
            String b = stringToString(line);

            String ret = new Solution().addBinary(a, b);

            String out = (ret);

            System.out.print(out);
        }
    }
}