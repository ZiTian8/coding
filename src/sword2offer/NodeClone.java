/**
 * @ClassName NodeClone
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/23 15:00
 */
package sword2offer;

class Node {
    public int val;
    public Node next;
    public Node random;

    public Node(int val) {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
}
public class NodeClone {
    public static Node Clone(Node head) {
//        CloneNode(head);
//        CloneRandomNext(head);
//        return GetResult(head);
        if(head==null){
            return null;
        }
        Node copy=null;
        Node cur=head;
        while(cur!=null){
            copy=new Node(cur.val);
            copy.next=cur.next;
            cur.next=copy;
            cur=copy.next;
        }

        cur=head;

        while (cur!=null){
            if(cur.random!=null){
                cur.next.random=cur.random.next;
            }
            cur=cur.next.next;
        }


        copy=head.next;
        cur=copy;
        while (head!=null){
            head.next=cur.next;
            head=head.next;
            if(head!=null){
                cur.next=head.next;
                cur=cur.next;

            }
        }
        return copy;


        
        
        



    }
    private static void CloneNode(Node head){
        while(head!=null){
            Node temp=new Node(head.val);
            temp.next=head.next;
            head.next=temp;
            head=temp.next;
        }
    }
    private static void CloneRandomNext(Node head){
        while(head!=null){
            Node randomNext=head.random;
            if(randomNext!=null){
                head.next.random=randomNext.next;
            }
            head=head.next.next;

        }
    }
    //拆分时要还原原来的链表
    private static Node GetResult(Node head){
        Node res=new Node(0);
        if(head==null){
            return null;
        }
        res.next=head.next;
        head=head.next;
        while(head.next!=null){
            head.next=head.next.next;
            head=head.next;
        }
        return res.next;
    }

    public static void main(String[] args) {
        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        Node node5=new Node(5);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;


        node2.random=node5;
        node3.random=node1;
        Node res=NodeClone.Clone(node1);
        System.out.println(res);

    }
}
