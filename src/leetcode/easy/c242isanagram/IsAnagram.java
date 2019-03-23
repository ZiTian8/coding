/**
 * @ClassName IsAnagram
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/3/18 16:28
 */
package leetcode.easy.c242isanagram;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    class Solution {
        public boolean isAnagram(String s, String t) {
            if(s.length()!=t.length()){
                return false;
            }
            Map<Character, Integer> map1= new HashMap();
            Map<Character, Integer> map2=new HashMap();
            for(int i =0;i<s.length();i++){
                if(map1.containsKey(s.charAt(i))){
                    map1.put(s.charAt(i),(int)map1.get(s.charAt(i))+1);

                }
                map1.put(s.charAt(i),1);
                if(map2.containsKey(t.charAt(i))){
                    map2.put(t.charAt(i),(int)map2.get(t.charAt(i))+1);

                }
                map2.put(t.charAt(i),1);
            }
            for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
                if(entry.getValue()!=map2.get(entry.getKey())){
                    return false;
                }

            }
            return true;

        }
    }
}
