/**
 * @ClassName FindPathInTree
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/18 20:11
 */
package sword2offer;

import java.util.ArrayList;


public class FindPathFromTree {
    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>>res =new ArrayList<>();
        ArrayList list=new ArrayList();
        if(root!=null){
            return Fun(root,target,res,0,list);
        }
        return list;
    }

    public ArrayList<ArrayList<Integer>> Fun(TreeNode root, int target, ArrayList res, int sum,ArrayList list){


        list.add(root.val);
        sum+=root.val;
        if(root.left!=null){
            Fun(root.left,target,res,sum,list);
            list.remove(list.size()-1);
            //sum-=root.left.val;
        }
        if(root.right!=null){
            Fun(root.right,target,res,sum,list);
            list.remove(list.size()-1);
            //sum-=root.right.val;
        }
        if(root.left==null&&root.right==null&&sum==target){
            ArrayList temp=new ArrayList();
            temp.addAll(list);
            res.add(temp);
        }

        return res;


    }

    public static void main(String[] args) {
        TreeNode node1=new TreeNode(10);
        TreeNode node2=new TreeNode(5);
        TreeNode node3=new TreeNode(12);
        TreeNode node4=new TreeNode(4);
        TreeNode node5=new TreeNode(7);
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
        FindPathFromTree findPathFromTree=new FindPathFromTree();
        ArrayList list=null;
        list=findPathFromTree.FindPath(node1,22);
        System.out.println(list);

    }

}
