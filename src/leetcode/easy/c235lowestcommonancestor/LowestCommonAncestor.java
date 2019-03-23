/**
 * @ClassName LeetCode235
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/3/15 22:32
 */
package leetcode.easy.c235lowestcommonancestor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 *
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 *
 * 例如，给定如下二叉搜索树:  root = [6,2,8,0,4,7,9,null,null,3,5]
 *
 *
 *
 *
 *
 * 示例 1:
 *
 * 输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
 * 输出: 6
 * 解释: 节点 2 和节点 8 的最近公共祖先是 6。
 * 示例 2:
 *
 * 输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
 * 输出: 2
 * 解释: 节点 2 和节点 4 的最近公共祖先是 2, 因为根据定义最近公共祖先节点可以为节点本身。
 *
 */
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root.val==p.val){
            TreeNode node =root;
            return node;
        }
        else if(root.val==q.val){
            TreeNode node =root;
            return node;
        }
        else if(root.val>p.val&&root.val>q.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        else if(root.val<p.val&&root.val<q.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        else{
            TreeNode node =root;
            return node;
        }


    }
}
//public class LowestCommonAncestor {
//    public static TreeNode stringToTreeNode(String input) {
//        input = input.trim();
//        input = input.substring(1, input.length() - 1);
//        if (input.length() == 0) {
//            return null;
//        }
//
//        String[] parts = input.split(",");
//        String item = parts[0];
//        TreeNode root = new TreeNode(Integer.parseInt(item));
//        Queue<TreeNode> nodeQueue = new LinkedList<>();
//        nodeQueue.add(root);
//
//        int index = 1;
//        while(!nodeQueue.isEmpty()) {
//            TreeNode node = nodeQueue.remove();
//
//            if (index == parts.length) {
//                break;
//            }
//
//            item = parts[index++];
//            item = item.trim();
//            if (!item.equals("null")) {
//                int leftNumber = Integer.parseInt(item);
//                node.left = new TreeNode(leftNumber);
//                nodeQueue.add(node.left);
//            }
//
//            if (index == parts.length) {
//                break;
//            }
//
//            item = parts[index++];
//            item = item.trim();
//            if (!item.equals("null")) {
//                int rightNumber = Integer.parseInt(item);
//                node.right = new TreeNode(rightNumber);
//                nodeQueue.add(node.right);
//            }
//        }
//        return root;
//    }
//
//    public static String treeNodeToString(TreeNode root) {
//        if (root == null) {
//            return "[]";
//        }
//
//        String output = "";
//        Queue<TreeNode> nodeQueue = new LinkedList<>();
//        nodeQueue.add(root);
//        while(!nodeQueue.isEmpty()) {
//            TreeNode node = nodeQueue.remove();
//
//            if (node == null) {
//                output += "null, ";
//                continue;
//            }
//
//            output += String.valueOf(node.val) + ", ";
//            nodeQueue.add(node.left);
//            nodeQueue.add(node.right);
//        }
//        return "[" + output.substring(0, output.length() - 2) + "]";
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String line;
//        while ((line = in.readLine()) != null) {
//            TreeNode root = stringToTreeNode(line);
//            line = in.readLine();
//            int p = Integer.parseInt(line);
//            line = in.readLine();
//            int q = Integer.parseInt(line);
//
//            TreeNode ret = new Solution().lowestCommonAncestor(root, p, q);
//
//            String out = treeNodeToString(ret);
//
//            System.out.print(out);
//        }
//    }
//}