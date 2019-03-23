/**
 * @ClassName LeetCode234
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/3/15 21:42
 */
package leetcode.easy.leetcode234;

/**请判断一个链表是否为回文链表。

 示例 1:

 输入: 1->2
 输出: false
 示例 2:

 输入: 1->2->2->1
 输出: true
 进阶：
 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 *
 */
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        slow=reverse(slow.next);
        while(slow!=null){
            if(slow.val==head.val){
                slow=slow.next;
                head=head.next;

            }else{
                return false;
            }
        }
        return true;


    }

    private ListNode reverse(ListNode head) {
        if(head.next==null){
            return head;
        }
        ListNode newhead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
}
public class LeetCode234 {

}
