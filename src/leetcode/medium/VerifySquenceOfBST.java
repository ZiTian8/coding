/**
 * @ClassName VerifySquenceOfBST
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/16 18:41
 */
package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val=0;
    TreeNode left=null;
    TreeNode right=null;
    public TreeNode(int val){
        this.val=val;
    }

}
public class VerifySquenceOfBST {
    //前序遍历二叉树
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if (root == null) {
            return res;
        }
        return fun1(root, res);

    }
    private List<Integer> fun1(TreeNode root, List<Integer> res) {

        res.add(root.val);
        if (root.left != null) {
            fun1(root.left,res);
        }
        if (root.right != null) {
            fun1(root.right,res);
        }
        return res;
    }
    //中序遍历
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if (root == null) {
            return res;
        }
        return fun2(root, res);

    }
    private List<Integer> fun2(TreeNode root, List<Integer> res) {


        if (root.left!=null){
            fun2(root.left,res);
        }
        res.add(root.val);

        if(root.right!=null){
            fun2(root.right,res);
        }
        return res;

    }

    //后序遍历
    public List<Integer>  postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if (root == null) {
            return res;
        }
        return fun3(root, res);

    }
    private List<Integer> fun3(TreeNode root, List<Integer> res) {
        if (root.left!=null){
            fun3(root.left,res);
        }
        if(root.right!=null){
            fun3(root.right,res);
        }
        else{
            res.add(root.val);
            return res;
        }

        res.add(root.val);
        return res;
    }

    public static void main(String[] args) {
        TreeNode head=new TreeNode(3);
        head.left=new TreeNode(1);

        List res=new ArrayList();
        VerifySquenceOfBST vs =new VerifySquenceOfBST();
        res=vs.inorderTraversal(head);
        for (int i = 0; i <res.size() ; i++) {
            System.out.println(res.get(i));
        }
    }


}
