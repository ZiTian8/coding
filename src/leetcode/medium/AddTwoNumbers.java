/**
 * @ClassName AddTwoNumbers
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/6/25 14:30
 */
package leetcode.medium;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }



public class AddTwoNumbers {
    //链表反转
    public static ListNode reverseList(ListNode list){

        if(list!=null&&list.next!=null){
            ListNode temp = list.next;
            ListNode temp1 = null;
            list.next=null;
            while(temp!=null){
                temp1=temp.next;
                temp.next=list;
                list=temp;
                temp=temp1;
            }
        }
        return list;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int add=0;
        int temp=0;
        ListNode node1=l1;
        ListNode node2=l2;
        ListNode result;

        while(true){

            temp=node1.val+node2.val;
            if(add>0){
                temp=temp+add;
                add=0;
            }
            if(temp>9){
                add=1;
                temp=temp-10;
            }
            node1.val=temp;
            node2.val=temp;

            if(node1.next==null||node2.next==null){

                result=(node1.next!=null)?l1:l2;

                while(add==1){
                    if(node1.next!=null){
                        node1=node1.next;
                        node1.val+=1;
                        if(node1.val>9){
                            node1.val-=10;
                        }else{
                            add=0;
                        }
                        continue;
                    }
                    if(node2.next!=null){
                        node2=node2.next;
                        node2.val+=1;
                        if(node2.val>9){
                            node2.val-=10;
                        }else{
                            add=0;
                        }
                        continue;
                    }
                    if(node1.next==null&&node2.next==null){
                        node1.next= new ListNode(1);
                        node2.next=new ListNode(1);
                        add=0;
                        break;
                    }



                }

                break;

            }
            node1=node1.next;
            node2=node2.next;
        }
        return result;


    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(5);
//        l1.next=new ListNode(4);
//        l1.next.next=new ListNode((3));

        ListNode l2 = new ListNode(5);
//        l2.next=new ListNode(6);
//        l2.next.next=new ListNode(4);

        ListNode result = addTwoNumbers(l1,l2);
    }
}
