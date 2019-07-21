/**
 * @ClassName JdTest2
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/15 8:25
 */
package exam;


import java.util.Scanner;

/*class ComparatorByLength implements Comparator {   //定义比较器
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String)o1;
        String s2 = (String)o2;

        int temp = s1.length()-s2.length();

        return temp==0? s1.compareTo(s2):temp;
    }

}*/

public class JdTest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //System.out.println("aabcs".contains("aa"));
        while (input.hasNext()) {
            int n = input.nextInt();
            String[] ss = new String[n];

            input.nextLine();
            for (int j = 0; j < n; j++) {
                ss[j] = input.nextLine();
            }

            String T = input.nextLine();
            int[] dp = new int[T.length()];
            // int last = 0;
            String lastString = "";
            int result = 0;
            for (int j = 0; j < T.length(); j++) {
                char tmpChar = T.charAt(j);

                if (con(ss, "" + tmpChar)) {
                    String tmpString = "" + tmpChar;
                    String lasttmpString = lastString + tmpChar;

                    if (equ(ss, tmpString)) {
                        result++;
                        lastString = "";
                    } else if (equ(ss, lasttmpString)) {
                        result++;
                        lastString = "";
                    } else if (con(ss, lasttmpString)) {
                        lastString = lasttmpString;
                    } else {
                        lastString = "" + tmpChar;
                    }
                } else {
                    lastString = "";
                }
            }

            System.out.println(result);
        }


    }

    public static boolean con(String[] s, String str) {
        boolean re = false;
        for (int i = 0; i < s.length; i++) {
            if (s[i].contains(str)) {
                re = true;
                break;
            }
        }
        return re;
    }

    public static boolean equ(String[] s, String str) {
        boolean re = false;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(str)) {
                re = true;
                break;
            }
        }
        return re;
    }
}