/**
 * @ClassName T2
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/9/14 16:00
 */
package bishi.XiaoHongShu;

/**
 * 薯队长写了一篇笔记草稿，请你帮忙输出最后内容。
 * <p>
 * 1.输入字符包括英文字符，"(" , ")" 和 "<"。
 * <p>
 * 2.英文字符表示笔记内容。
 * <p>
 * 3. (  ) 之间表示注释内容，任何字符都无效。 括号保证成对出现。
 * <p>
 * 4. "<" 表示退格, 删去前面一个笔记内容字符。 括号不受 "<" 影响 。
 * <p>
 * 输入
 * 输入一行字符串。长度 <= 10000.
 * <p>
 * 输出
 * 输出一行字符串，表示最终的笔记内容。
 * <p>
 * <p>
 * 样例输入
 * a<<b((c)<)
 * 样例输出
 * b
 * <p>
 * 提示
 * a退格删除掉了， 括号里面的c不要,  最后一个< 无效
 */

import java.util.Scanner;

public class T2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder res = new StringBuilder();
        int flag = 0, len = s.length();
        char[] carry = s.toCharArray();
        for (char c : carry) {
            if (c == '(') {
                flag++;
            } else if (c == ')') {
                flag--;
            } else if (c == '<') {
                if (res.length() > 0 && flag == 0 && res.charAt(res.length() - 1) != ')') {
                    res.deleteCharAt(res.length() - 1);

                }
            } else if (flag == 0) {
                res .append(c);
            }
        }

        System.out.println(res);
    }
    
}
