/**
 * @ClassName MoreThanHalfNum39
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/5/5 18:49
 */
package sword2offer;

public class MoreThanHalfNum39 {
    public int MoreThanHalfNum_Solution(int [] array) {
        int len = array.length;
        int res=array[0];
        int num=1;
        for (int i = 1; i < len; i++) {
            if(array[i]==res){
                num++;
            }else{
                if(num==0){
                    res=array[i];
                    num=1;
                }else{
                    num--;
                }
            }

        }
        res=Check(res,array);
        return res;
    }
    //检查是否超过一半
    private static int Check(int num,int[] array){
        int time=0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]==num){
                time++;
            }

        }
        if(time<=array.length>>1){
            num=0;
        }
        return num;
    }
}
