/**
 * @ClassName LengthOfLongestSubstring
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/6/28 19:52
 */
package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
         int len = s.length();
         int max=0;
         int temp=0;
         HashMap<Character,Integer> map = new HashMap(len);
         for (int i=0;i<len;i++){
             if(!map.containsKey(s.charAt(i))) {
                 map.put(s.charAt(i),i);

             }else{

                 int haved = map.get(s.charAt(i));

                 for(int j=temp;j<=haved;j++){
                     map.remove(s.charAt(j),j);

                 }
                 temp=haved+1;
                 map.put(s.charAt(i),i);
             }
             max=max>map.size()?max:map.size();
         }
         return max;
    }

    public static int lengthOfLongestSubstring1(String s) {

        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;

    }

    public static void main(String[] args) {
        String s = "aaaa";
        int result=lengthOfLongestSubstring(s);
        int result1=lengthOfLongestSubstring1(s);

        System.out.println(result);
        System.out.println(result1);

    }

}
