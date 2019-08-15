/**
 * @ClassName IsMatch10
 * @Description
 * 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
 *
 * '.' 匹配任意单个字符
 * '*' 匹配零个或多个前面的那一个元素
 * 所谓匹配，是要涵盖 整个 字符串 s的，而不是部分字符串。
 *
 * 说明:
 *
 * s 可能为空，且只包含从 a-z 的小写字母。
 * p 可能为空，且只包含从 a-z 的小写字母，以及字符 . 和 *。

 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/8/15 13:09
 */
package leetcode.hard;

public class IsMatch10 {
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();
        boolean first_match = (!s.isEmpty()&&(p.charAt(0)==s.charAt(0)||p.charAt(0)=='.'));

        if(p.length()>=2&&p.charAt(1)=='*'){
            return (isMatch(s,p.substring(2))||(first_match&&isMatch(s.substring(1),p)));
        }
        else{
            return first_match&&isMatch(s.substring(1),p.substring(1));
        }



    }
    //动态规划
    public boolean isMatch1(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[s.length()][p.length()] = true;

        for (int i = s.length(); i >= 0; i--){
            for (int j = p.length() - 1; j >= 0; j--){
                boolean first_match = (i < s.length() &&
                        (p.charAt(j) == s.charAt(i) ||
                                p.charAt(j) == '.'));
                if (j + 1 < p.length() && p.charAt(j+1) == '*'){
                    dp[i][j] = dp[i][j+2] || first_match && dp[i+1][j];
                } else {
                    dp[i][j] = first_match && dp[i+1][j+1];
                }
            }
        }
        return dp[0][0];



    }
}
