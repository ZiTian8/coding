/**
 * @ClassName Combine
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/10/16 9:51
 */
package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Combine {
    private static List<List<Integer>> out = new ArrayList();
    public static List<List<Integer>> combine(int n, int k) {
        help(new ArrayList<Integer>(),1,0,n,k);
        return out;
    }
    public static void help(List<Integer> temp,int cur,int number,int n,int k){
        if(number==k){
            out.add(new ArrayList(temp));
            cur=10;
            return;
        }
        if(cur>n){
            return;
        }
        int[] a = new int[2];

        temp.add(cur);
        help(temp,++cur,++number,n,k);
        number--;
        cur--;
        temp.remove(number);

        help(temp,++cur,number,n,k);
        return;
    }

    public static void main(String[] args) {
        System.out.println(combine(4,2));
    }
}
