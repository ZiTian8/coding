/**
 * @ClassName ReConstructBinaryTree
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/3/28 16:53
 */
package sword2offer;

import java.util.ArrayList;

public class ReConstructBinaryTree {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if(pre.length!=in.length||pre==null||in==null){
            return null;
        }
        return construct(pre,0,pre.length-1,in,0,in.length-1);
    }

    private static TreeNode construct(int[] pre, int i, int prelength, int[] in, int j, int inlength) {
        //出口
        if(i>prelength){
            return null;
        }
        //取前序遍历的第一个数字，作为跟节点
        int value=pre[i];
        int index=j;
        while(index<=inlength&&value!=in[index]){
            index++;
        }

        TreeNode node = new TreeNode(value);
        node.left=construct(pre,i+1,i+index-j,in,j,index-1);
        node.right=construct(pre,i+index-j+1,prelength,in,1+index,inlength);

        return node;
    }

    public static void main(String[] args) {
        int[] pre= {1,2,3,4,5,6,7};
        int[] in= {3,2,4,1,6,5,7};
        System.out.println(reConstructBinaryTree(pre,in));

    }


}
