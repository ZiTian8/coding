/**
 * @ClassName JumpFloor
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/3/28 19:51
 */
package sword2offer;

public class JumpFloor {
    //递归
    public int JumpFloor(int target) {
        if(target==1){
            return 1;
        }
        if(target==2){
            return 2;
        }
        return JumpFloor(target-1)+JumpFloor(target-2);
    }
    //非递归

    public static void main(String[] args) {
        JumpFloor j=new JumpFloor();
        System.out.println(j.JumpFloor(4));
    }
}
