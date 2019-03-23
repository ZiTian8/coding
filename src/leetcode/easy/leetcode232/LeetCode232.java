/**
 * @ClassName LeetCode232
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/3/15 21:37
 */
package leetcode.easy.leetcode232;

import java.util.ArrayList;
import java.util.List;

/**使用栈实现队列的下列操作：

 push(x) -- 将一个元素放入队列的尾部。
 pop() -- 从队列首部移除元素。
 peek() -- 返回队列首部的元素。
 empty() -- 返回队列是否为空。
 示例:

 MyQueue queue = new MyQueue();

 queue.push(1);
 queue.push(2);
 queue.peek();  // 返回 1
 queue.pop();   // 返回 1
 queue.empty(); // 返回 false
 *
 */

class MyQueue {

    List<Integer> list = new ArrayList();
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        list.add(x);

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return list.remove(0);

    }

    /** Get the front element. */
    public int peek() {
        return list.get(0);

    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return list.isEmpty();

    }
}
public class LeetCode232 {
}
