/**
 * @ClassName LeetCode
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019-03-09 20:14
 */
package leetcode.easy.leetcode205;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map=new HashMap(s.length());
        int ss= s.length();
        for(int i=0;i<s.length();i++){

            if(map.containsKey(s.charAt(i))){
                if(!map.get(s.charAt(i)).equals(t.charAt(i))){
                    return false;
                }
            }
            else if(map.containsValue(t.charAt(i))){
                return false;
            }
            map.put(s.charAt(i), t.charAt(i));
        }
        return true;
    }
}
public class LeetCode {
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
            line = in.readLine();
            String t = stringToString(line);

            boolean ret = new Solution().isIsomorphic(s, t);

            String out = booleanToString(ret);

            System.out.print(out);
        }
    }
}