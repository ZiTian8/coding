/**
 * @ClassName Test1
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/8 18:17
 */
package exam.xiecheng;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Node{
    String val;
    Node next;
    Node(String x ){
        this.val=x;
    }
}
public class Test1 {
    //判断链表中有没有环,返回值为null，则没有换，不是null，则为环中的一个节点
    private Node isCycle(Node head){
        if(head==null){
            return null;
        }
        Node fast=head.next;
        Node low=head;
        while(fast!=low){
            if(fast==null||fast.next==null){
                return null;
            }
            fast=fast.next.next;
            low=low.next;
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
        String[] str11=str1.split(",");
        List<String> l1= new ArrayList();
        Node list1=null;
        Node temp1=new Node("a");


        for(int i=0;i<str11.length;i++){

            temp1.next=new Node(str11[i]);
            if(list1==null&&temp1.next!=null){
                list1=temp1.next;
            }

            temp1=temp1.next;
        }

        Test1 tl=new Test1();
        Node res=tl.isCycle(list1);
        System.out.println(res);

    }

}
