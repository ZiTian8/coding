/**
 * @ClassName MergeList
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/4 22:10
 */
package sword2offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeList {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode head =null;
        if(list1.val<=list2.val){
            head =list1;
            head.next=Merge(list1.next,list2);
        }else{
            head =list2;
            head.next=Merge(list1,list2.next);
        }
        return head;

    }
    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String[] str11=str1.split(" ");
        String[] str22=str2.split(" ");
        List<Integer> l1= new ArrayList();
        List<Integer> l2= new ArrayList();
        ListNode list1=null;
        ListNode temp1=new ListNode(0);
        ListNode list2=null;
        ListNode temp2=new ListNode(0);

        for(int i=0;i<str11.length;i++){

            temp1.next=new ListNode(Integer.parseInt(str11[i]));
            if(list1==null&&temp1.next!=null){
                list1=temp1.next;

            }

            temp1=temp1.next;
        }
        for(int i=0;i<str22.length;i++){
            temp2.next=new ListNode(Integer.parseInt(str22[i]));
            if(list2==null&&temp2.next!=null){
                list2=temp2.next;

            }

            temp2=temp2.next;
        }
        MergeList ml=new MergeList();
        ListNode node=ml.Merge(list1,list2);
        while(node!=null){
            System.out.println(node.val+" ");
            node=node.next;
        }
    }
}
