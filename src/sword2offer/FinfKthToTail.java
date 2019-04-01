/**
 * @ClassName LastK
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/1 15:50
 */
package sword2offer;

import java.util.Scanner;

public class FinfKthToTail {
    private static class Node{
        int val;
        Node next ;
        Node(int x) { val = x; }
    }
    public int FinfKthToTail(Node node,int k){
        Node fast=node;
        Node low = node;
        for(int i=0;i<k;++i){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            low=low.next;
        }
        return low.val;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Node node = new Node(sc.nextInt());
        Node tem=node;

        for(int i =0;i<n-1;++i){

            tem.next=new Node(sc.nextInt());
            tem=tem.next;

        }
        FinfKthToTail f= new FinfKthToTail();
        System.out.println(f.FinfKthToTail(node,3));

    }
}
