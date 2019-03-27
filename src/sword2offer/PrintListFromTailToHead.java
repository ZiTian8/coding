/**
 * @ClassName PrintListFromTailToHead
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/3/27 17:09
 */
package sword2offer;

import java.util.ArrayList;
import java.util.Stack;



public class PrintListFromTailToHead {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    //使用栈
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();



        while(listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;

    }
    //递归
    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
        if(listNode!=null){
            if(listNode.next!=null){
                printListFromTailToHead1(listNode.next);
            }

            list.add(listNode.val);

        }
        return list;

    }
}
