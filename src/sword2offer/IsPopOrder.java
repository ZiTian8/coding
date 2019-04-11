/**
 * @ClassName IsPopOrder
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/11 20:35
 */
package sword2offer;

import java.util.Stack;

public class IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(popA.length!=pushA.length){
            return false;
        }
        Stack<Integer> stack = new Stack();
        int i=0;
        for (int j = 0; j <popA.length ; j++) {
            stack.push(pushA[j]);
            while(i<popA.length&&stack.peek()==popA[i]){
                stack.pop();
                i++;
            }
        }
        if(stack.size()==0){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        IsPopOrder ip=new IsPopOrder();
        int [] pushA={1,2,3,4,5};
        int [] popA={4,5,3,2,1};
        System.out.println(ip.IsPopOrder( pushA,popA));
    }
}
