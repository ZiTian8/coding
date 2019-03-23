/**
 * @ClassName LeetCode107
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019-02-27 19:31
 */
package leetcode.easy.leetcode107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其自底向上的层次遍历为：
 *
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(Integer x) { val = x; }
}
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        //创建要返回的列表存放所有节点值
        List<List<Integer>> list = new LinkedList<>();
        if (root == null) {
            return null;
        }
        //创建一个栈存放各层全部的节点值,为什么用栈，因为最先获得的根节点的值是最后输出的，而栈先进后出，能满足要求
        Stack<List<Integer>> slist = new Stack<>();
        //创建一个栈存放一层的节点，为什么这里用LinkedList，因为每一层的value是按照从左到右的顺序输出，
        Queue<TreeNode> currentLevel = new LinkedList<>();
        //先把根节点压入栈中
        currentLevel.add(root);
        while(!currentLevel.isEmpty()){
            int size=currentLevel.size();
            //循环一次相当于获得一层的值，
            //每一个新的循环都会重新new currentList，用来保存当前层的值
            List<Integer> currentList=new LinkedList<>();
            //遍历一层的节点，把节点弹出用currentNode接收（弹出后，如果同层还有节点，下一次循环就会弹出下一个），把currentNode的value放到currentList，
            // 同时判断currentNode是否有子节点，有的话把子节点放入到currentLevel，
            for(int i=0;i<size;i++){
                TreeNode currentNode=currentLevel.poll();
                currentList.add(currentNode.val);

                if(currentNode.left!=null){
                    currentLevel.add(currentNode.left);
                }
                if(currentNode.right!=null){
                    currentLevel.add(currentNode.right);
                }
            }
            //一层的节点全部遍历并获得currentList，这里面是当前层的所有节点的值，在下一次循环时currentList会被重新new
            //将currentList压入slist中
            slist.push(currentList);
        }
        while(!slist.isEmpty()){
            list.add(slist.pop());
        }
        return list;


    }
}
public class LeetCode107 {
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

    public static String integerArrayListToString(List<Integer> nums, int length) {
        if (length == 0) {
            return "[]";
        }

        String result = "";
        for(int index = 0; index < length; index++) {
            Integer number = nums.get(index);
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String integerArrayListToString(List<Integer> nums) {
        return integerArrayListToString(nums, nums.size());
    }

    public static String int2dListToString(List<List<Integer>> nums) {
        StringBuilder sb = new StringBuilder("[");
        for (List<Integer> list: nums) {
            sb.append(integerArrayListToString(list));
            sb.append(",");
        }

        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            TreeNode root = stringToTreeNode(line);

            List<List<Integer>> ret = new Solution().levelOrderBottom(root);

            String out = int2dListToString(ret);

            System.out.print(out);
        }
    }
}