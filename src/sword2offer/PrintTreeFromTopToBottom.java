/**
 * @ClassName PrintTreeFromTopToBottom
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/1 9:28
 */
package sword2offer;

import java.util.ArrayList;
import java.util.LinkedList;

public class PrintTreeFromTopToBottom {
    private class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }


    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList list = new ArrayList();

        LinkedList linkedList = new LinkedList();
        if(root!=null){
            linkedList.add(root);
        }
        while(!linkedList.isEmpty()) {
            TreeNode tem=(TreeNode) linkedList.poll();
            list.add(tem.val);
            if(tem.left!=null){
                linkedList.offer(tem.left);
            }
            if(tem.right!=null){
                linkedList.offer(tem.right);
            }
        }
        return list;


    }
    //分层打印
    public ArrayList<Integer> PrintFromTopToBottom2(TreeNode root) {
        ArrayList list = new ArrayList();
        ArrayList list2 = new ArrayList();

        LinkedList linkedList = new LinkedList();
        if(root!=null){
            linkedList.add(root);
            list2.add(1);
        }
        int num=0;//下一层有几个
        int toBeprint=1;//当前层还有几个
        while(!linkedList.isEmpty()) {
            TreeNode tem=(TreeNode) linkedList.poll();

            if(tem.left!=null){
                linkedList.offer(tem.left);
                num++;

            }
            if(tem.right!=null){
                linkedList.offer(tem.right);
                num++;
            }
            list.add(tem.val);
            --toBeprint;
            //当前层没了
            if(toBeprint==0){
                list2.add(num);
                toBeprint=num;//把下一层的个数复制给当前层
                num=0;//下一层格式为0
            }
        }
        return list;


    }



}
