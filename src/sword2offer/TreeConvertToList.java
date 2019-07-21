/**
 * @ClassName TreeConvertToList
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/24 21:36
 */
package sword2offer;

public class TreeConvertToList {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    public TreeNode Convert(TreeNode pRootOfTree) {
        while (pRootOfTree!=null){
            pRootOfTree=pRootOfTree.left;
        }
        return null;


    }
}

