/**
 * @ClassName IncludeMinStack
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/10 16:28
 */
package sword2offer;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class IncludeMinStack {

    Stack stack=new Stack();
    Stack min=new Stack();

    public void push(int node) {
        stack.push(node);
        int tem=node;

        if(min.size()!=0&&(int)min.peek()<tem){
            tem=(int)min.peek();
        }

        min.push(tem);


    }

    public void pop() {
        stack.pop();
        min.pop();

    }

    public int top() {
        return (int) stack.peek();

    }

    public int min() {
        return (int) min.peek();

    }

    public static void main(String[] args) {
        IncludeMinStack includeMinStack = new IncludeMinStack();
        includeMinStack.push(3);
        int num =includeMinStack.min();
        System.out.println(num);
    }
}
