/**
 * @ClassName HashMapPutNullTest
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/26 9:30
 */
package learn.hashmaptest;

import java.util.HashMap;

public class HashMapPutNullTest {
    public static void main(String[] args) {
        HashMap hashMap=new HashMap(10);
        hashMap.put(null,1);
        System.out.println(hashMap.get(null));
        System.out.println(hashMap.put(null,2));
        System.out.println(hashMap.get(null));
    }
}
