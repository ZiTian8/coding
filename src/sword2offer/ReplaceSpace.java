/**
 * @ClassName ReplaceSpace
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/3/26 12:21
 */
package sword2offer;

import java.util.Scanner;

public class ReplaceSpace {
    public static String replaceSpace(StringBuffer str) {
        int l = str.length();

//        if(l<=1){
//            return String.valueOf(str);
//        }
        int numberOfBlank=0;
        int lengthNew=0;
        for(int i =0;i<l;i++){
            if(str.charAt(i)==' '){
                numberOfBlank++;
            }
        }


        lengthNew=l+numberOfBlank*2-1;
        str.setLength(lengthNew+1);
        l=l-1;
        while(numberOfBlank!=0){
            if(str.charAt(l)!=' '){
                str.setCharAt(lengthNew,str.charAt(l));
                l--;
                lengthNew--;
            }else{
                str.setCharAt(lengthNew--,'0');
                str.setCharAt(lengthNew--,'2');
                str.setCharAt(lengthNew--,'%');
                numberOfBlank--;
                l--;

            }

        }
        return String.valueOf(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        StringBuffer str = new StringBuffer(s);
        System.out.println(replaceSpace(str));

    }
}
