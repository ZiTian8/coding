/**
 * @ClassName Test
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/3/23 9:40
 */
package learn;
//字符串去重
public class RemoveCompeatStr {
    //去除字符串中相邻重复的字符
    public static String  removeMethod(String s) {

        if (s == null) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        int i = 0;
        int len = s.length();
        while (i < len) {
            char c = s.charAt(i);
            sb.append(c);
            i++;
            while (i < len && s.charAt(i) == c) {//这个是如果这两个值相等，就让i+1取下一个元素
                i++;
            }
        }
        return sb.toString();
    }



    //去除重复，只留下第一次出现的的字符
    public static String  removeStr(String str){
    StringBuffer sb = new StringBuffer();
    int len = str.length();

    for(int i = 0; i < len; i++){
        char c = str.charAt(i);
        //如果该字符第一次出现的index和最后一次出现的index相等，这说明该字符没有重复
        if(str.indexOf(c) == str.lastIndexOf(c)){
            sb.append(c);
        }
        else{
            //如果不相等，则有重复，判断是否是第一次出现。
            if(str.indexOf(c) == i){
                sb.append(c);
            }
        }
    }
    return sb.toString();
    }

    public static void main(String[] args) {
        String s = "aaabbbcccaaaa";
        System.out.println(removeMethod(s));
    }
}
