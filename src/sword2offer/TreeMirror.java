/**
 * @ClassName TreeMirror
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/9 14:12
 */
package sword2offer;

public class TreeMirror {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    public void Mirror(TreeNode root) {
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            return;
        }else if(root.right!=null&&root.left==null){
            root.left=root.right;
            root.right=null;
            Mirror(root.left);
        }else if(root.left!=null&&root.right==null){
            root.right=root.left;
            root.left=null;
            Mirror(root.right);
        }else{
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
            Mirror(root.right);
            Mirror(root.left);
        }
    }

}

