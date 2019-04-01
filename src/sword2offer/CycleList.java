/**
 * @ClassName CycleList
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/1 16:46
 */
package sword2offer;

import java.util.Scanner;

public class CycleList {
    private static class Node{
        int val;
        Node next;
        Node(int x ){
            this.val=x;

        }

    }
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
    //判断环中有几个节点,传入isCycle的返回值
    private int theNumOfNodeInCycle(Node node){
        int num=1;
        Node tem=node.next;
        while(tem!=node){
            ++num;
            tem=tem.next;
        }
        return num;
    }
    //寻找环入口节点
    private Node findTheEntry(Node head,int num){
        Node fast=head;
        Node low=head;
        for(int i=0;i<num;++i){
            fast=fast.next;
        }
        while(fast!=low){
            fast=fast.next;
            low=low.next;
        }
        return fast;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Node node = new Node(sc.nextInt());
        Node tem=node;
        Node cycle = null;

        for(int i =0;i<n;++i){

            tem.next=new Node(sc.nextInt());
            if(i==3){
                cycle=tem;

            }


            if(i==(n-1)){
                tem.next=cycle;
            }else{
                tem=tem.next;
            }


        }
        System.out.println(node);
        CycleList cl=new CycleList();
        Node in=cl.isCycle(node);
//        System.out.println(cl.isCycle(node));
        int num=cl.theNumOfNodeInCycle(in);
        Node res =cl.findTheEntry(node,num);
        System.out.println(cl.theNumOfNodeInCycle(in));
        System.out.println(res);





    }
}
