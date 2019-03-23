/**
 * @ClassName LeetCode117
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019-03-01 12:24
 */
package leetcode.easy.leetcode119;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Solution1 {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> listlast=new ArrayList<>();
        List<Integer> listcurrent=new ArrayList<>();

        for(int i=1;i<=rowIndex+1;i++){
            for(int j=0;j<i;j++){
                if(j==0||j==i-1){
                    listcurrent.add(1);
                }else{
                    listcurrent.add(listlast.get(j-1)+listlast.get(j));
                }
            }
            listlast=listcurrent;
            listcurrent=new ArrayList<>();
        }
        return listlast;

    }
}

public class LeetCode119 {
    public static String integerArrayListToString(List<Integer> nums, int length) {
        if (length == 0) {
            return "[]";
        }

        String result = "";
        for(int index = 0; index < length; index++) {
            Integer number = nums.get(index);
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String integerArrayListToString(List<Integer> nums) {
        return integerArrayListToString(nums, nums.size());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int rowIndex = Integer.parseInt(line);

            List<Integer> ret = new Solution1().getRow(rowIndex);

            String out = integerArrayListToString(ret);

            System.out.print(out);
        }
    }
}