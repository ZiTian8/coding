/**
 * @ClassName HashMapTest
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/21 12:33
 */
package learn.hashmaptest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
    static class User{
        private String name;
        public User(String name){
            this.name=name;
        }

        @Override
        public int hashCode() {
            return 2;
        }
    }
    public static void main(String[] args) {
        HashMap<String,String> hashmap =new HashMap();
        System.out.println(hashmap.put("1","v1"));
        System.out.println(hashmap.put("2","v2"));
        System.out.println(hashmap.put("3","v2"));
        System.out.println(hashmap.put("4","v2"));

        //测试怎么判断key是否重复
        HashMap<User,String> hashmap1 =new HashMap();
        User use1=new User("tom");
        User use2=new User("haha");
        //hashcode一样，
        System.out.println(hashmap1.put(use1,"v1"));
        System.out.println(hashmap1.put(use2,"v2"));

        for (Map.Entry<User,String> entry:hashmap1.entrySet()
             ) {
            System.out.println(entry.getKey()+":"+entry.getValue());

        }
        //测试遍历时删除
        //正确方法
        Iterator it=hashmap.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry entry= (Map.Entry) it.next();
            if(entry.getKey()=="1"){
                it.remove();
            }
        }



        //报错：ConcurrentModificationException
//        for (Map.Entry<String,String> entry:hashmap.entrySet()) {
//            if(entry.getKey()=="1"){
//                hashmap.remove(entry.getKey());
//            }
//        }





        //遍历
        //第一种：普通使用，二次取值
        System.out.println("\n通过Map.keySet遍历key和value：");
        for(String key: hashmap.keySet())
        {
            System.out.println("Key: "+key+" Value: "+ hashmap.get(key));
        }

        //第二种
        System.out.println("\n通过Map.entrySet使用iterator遍历key和value: ");
        Iterator hashmap1it= hashmap.entrySet().iterator();
        while( hashmap1it.hasNext())
        {
            Map.Entry<String, String> entry=(Map.Entry<String, String>)  hashmap1it.next();
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }

        //第三种：推荐，尤其是容量大时  
        System.out.println("\n通过Map.entrySet遍历key和value");
        for(Map.Entry<String, String> entry:  hashmap.entrySet())
        {
            System.out.println("Key: "+ entry.getKey()+ " Value: "+entry.getValue());
        }

        //第四种  
        System.out.println("\n通过Map.values()遍历所有的value，但不能遍历key");
        for(String v: hashmap.values())
        {
            System.out.println("The value is "+v);
        }

    }
}
