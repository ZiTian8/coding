/**
 * @ClassName LeetCode202
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019-03-08 12:06
 */
package leetcode.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {

        if(n<1){
            return false;
        }
        HashSet set=new HashSet();

        int temp;
        int newN;
        while(n!=1&&!set.contains(n)){
            set.add(n);
            newN=0;
            while(n>0){
                temp=n%10;
                n/=10;
                newN+=temp*temp;
            }
            n=newN;
        }
        return n==1;


    }
}

public class LeetCode202 {
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);

            boolean ret = new Solution().isHappy(n);

            String out = booleanToString(ret);

            System.out.print(out);
        }
    }
}
