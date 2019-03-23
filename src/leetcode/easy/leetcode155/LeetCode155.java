/**
 * @ClassName LeetCode155
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019-03-02 15:57
 */
package leetcode.easy.leetcode155;

/**最小栈
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 * 示例:
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.getMin();   --> 返回 -2.
 */

class MinStack {

    /** initialize your data structure here. */
    private class Node{
        int item;
        Node next;
    }
    private Node first;
    public MinStack() {

    }

    public void push(int x) {
        Node oldfirst = first;
        first = new Node();
        first.item=x;
        first.next = oldfirst;

    }

    public void pop() {
        first=first.next;

    }

    public int top() {
        return first.item;
    }

    public int getMin() {
        Node temp=first;
        int min=temp.item;
        while(temp!=null){
            if(temp.item<min){
                min=temp.item;
            }
            temp=temp.next;
        }
        return min;
    }
}


//class MinStack {
//
//    /** initialize your data structure here. */
//    private class Node{
//        int item;
//        Node next;
//    }
//    private Node first;
//    public MinStack() {
//
//    }
//
//    public void push(int x) {
//
//        Node oldfirst = first;
//        int min;
//        if(oldfirst==null){
//            min=x;
//        }else{
//            min = oldfirst.item;
//        }
//
//
//        if(x<min){
//            min=x;
//        }
//
//        oldfirst.item=x;
//
//        first = new Node();
//        first.item=min;
//        first.next = oldfirst;
//
//    }
//
//    public void pop() {
//        first=first.next;
//
//    }
//
//    public int top() {
//        return first.item;
//    }
//
//    public int getMin() {
//        Node temp=first;
//        int min=temp.item;
//        while(temp!=null){
//            if(temp.item<min){
//                min=temp.item;
//            }
//            temp=temp.next;
//        }
//        return min;
//    }
//}