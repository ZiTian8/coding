/**
 * @ClassName LeetCode226
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/3/13 12:30
 */
package leetcode.easy.leetcode226;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**翻转一棵二叉树。
 */

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
class Solution {
    public TreeNode invertTree3(TreeNode root) {
        TreeNode nodehead=root;
        if(root!=null){
            exchange(root);
        }

        return nodehead;

    }
    private void exchange(TreeNode root){
        if(root.left==null&&root.right==null){
            return;
        }
        if(root.left!=null&&root.right==null){
            root.right=root.left;
            root.left=null;
            exchange(root.right);
        }
        else if(root.left==null&&root.right!=null){

            root.left=root.right;
            root.right.val= Integer.parseInt(null);
            exchange(root.left);
        }
        else if(root.left!=null&&root.right!=null){
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
            exchange(root.left);
            exchange(root.right);
        }
    }
    //非递归
    public TreeNode invertTree2(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return root;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.pop();
            TreeNode left = node.left;
            node.left = node.right;
            node.right = left;
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return root;
    }
    //递归
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
}
public class LeetCode226 {
    public static TreeNode stringToTreeNode(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return null;
        }

        String[] parts = input.split(",");
        String item = parts[0];
        TreeNode root = new TreeNode(Integer.parseInt(item));
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        int index = 1;
        while(!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();

            if (index == parts.length) {
                break;
            }

            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int leftNumber = Integer.parseInt(item);
                node.left = new TreeNode(leftNumber);
                nodeQueue.add(node.left);
            }

            if (index == parts.length) {
                break;
            }

            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int rightNumber = Integer.parseInt(item);
                node.right = new TreeNode(rightNumber);
                nodeQueue.add(node.right);
            }
        }
        return root;
    }

    public static String treeNodeToString(TreeNode root) {
        if (root == null) {
            return "[]";
        }

        String output = "";
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while(!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();

            if (node == null) {
                output += "null, ";
                continue;
            }

            output += String.valueOf(node.val) + ", ";
            nodeQueue.add(node.left);
            nodeQueue.add(node.right);
        }
        return "[" + output.substring(0, output.length() - 2) + "]";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            TreeNode root = stringToTreeNode(line);

            TreeNode ret = new Solution().invertTree3(root);

            String out = treeNodeToString(ret);

            System.out.print(out);
        }
    }
}