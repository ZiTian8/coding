/**
 * @ClassName LeetCode203
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019-03-08 12:13
 */
package leetcode.easy.leetcode203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 删除链表中等于给定值 val 的所有节点。
 *
 * 示例:
 *
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode root = new ListNode(1);
        root.next = head;
        // 调于记录要处理的元素的前驱结点
        ListNode prev = root;

        // prev.next表示要处理的结点
        while (prev.next != null) {
            // 要处理的结点是要删除的结点
            if (prev.next.val == val) {
                // 对结点进行删除操作
                prev.next = prev.next.next;
            }
            // 当前处理的节点不需要删除，prev移动到下一个结点
            else {
                prev = prev.next;
            }
        }

// 返回新的根结点
        return root.next;
    }
}
public class LeetCode203 {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);

        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }

    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }

        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            ListNode head = stringToListNode(line);
            line = in.readLine();
            int val = Integer.parseInt(line);

            ListNode ret = new Solution().removeElements(head, val);

            String out = listNodeToString(ret);

            System.out.print(out);
        }
    }
}