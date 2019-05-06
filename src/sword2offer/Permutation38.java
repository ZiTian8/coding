/**
 * @ClassName Permutation38
 * @Description 字符串的排列
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/5/5 14:58
 */
package sword2offer;

import java.util.*;

public class Permutation38 {
    //比较难懂
    public ArrayList<String> getPermutation(String A) {
        ArrayList<String> res=new ArrayList();
        if(A.length()<=1){
            res.add(A);
        }else{
            for (int i = 0; i <A.length() ; i++) {
                String s=A.substring(i,i+1);

                List list=getPermutation(A.substring(0,i)+A.substring(i+1));
                for (int j = 0; j <list.size() ; j++) {
                    res.add(s+list.get(j));
                }
            }
        }
        return res;

    }

    public ArrayList<String> getPermutation1(String A) {
        if(A==null){
            return null;
        }
        char[] in=A.toCharArray();
        ArrayList<String> res=new ArrayList<>();

        getPermutation2(0,in.length,in,res);
        Collections.sort(res);
        Collections.reverse(res);
        return res;

    }

    private void getPermutation2(int start, int end, char[] in, ArrayList<String> res) {
        if(start==end){
            for (char i : in) {
                System.out.print(i);
            }
            System.out.println();
//            System.out.println(in.toString());
            //System.out.println(new String(in));
            //System.out.println(Arrays.toString(in));
            res.add(String.valueOf(in));
            return ;
        }else{
            for (int i=start;i<end;++i){
                swap(in,start,i);
                getPermutation2(start+1,end,in,res);
                swap(in,start,i);
            }

        }

    }

    private void swap(char[] in, int start, int i) {
        char temp=in[start];
        in[start]=in[i];
        in[i]=temp;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String A =sc.nextLine();
        ArrayList<String> res=new Permutation38().getPermutation1(A);
        for (String i:res) {
            System.out.println(i);
        }


        System.out.println("=========");
        char[] b={'a','b'};
        System.out.println(b);
        System.out.println(b.toString());
        String d=b.toString();
        System.out.println(d);
        System.out.println(d.charAt(0));
        System.out.println("=========");
        String c=new String(b);
        System.out.println(c);

    }

}
