/**
 * @ClassName StringPermutation
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/20 22:04
 */
package learn;
//排列
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringPermutation {
    private static List getPermutation2(String str){
        List<String> res=new ArrayList();
        if(str.length()<=1){
            res.add(str);
        }else{
            for (int i = 0; i <str.length() ; i++) {
                String s=str.substring(i,i+1);

                List list=getPermutation2(str.substring(0,i)+str.substring(i+1));
                for (int j = 0; j <list.size() ; j++) {
                    res.add(s+list.get(j));
                }
            }
        }
        return res;

    }
    public static ArrayList<String> getPermutation1(String A) {
        ArrayList<String> res=new ArrayList<>();
        fullSort(res,A.toCharArray(),0);
        Collections.sort(res);
        Collections.reverse(res);
        return res;

    }



    private static void fullSort(ArrayList<String> res, char[] array, int start) {
        if(start==array.length){
            res.add(new String(array));
            return;
        }
        for(int i=start;i<array.length;++i){
            swap(array,i,start);
            fullSort(res,array,start+1);
            swap(array,i,start);
        }
    }

    private static void swap(char[] array, int i, int j) {
        if(i!=j){
            char temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        }
        }

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        ArrayList<String> list=getPermutation1(A);
        List<String> list1=getPermutation2(A);
        Collections.sort(list1);
        Collections.reverse(list1);
        for (String i:list1
        ) {
        System.out.println(i);

        }
        }


        }
