/**
 * @ClassName BinaryTreePaths
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/3/18 18:52
 */
package leetcode.easy.c257binaryTreePaths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution
//{
//    public List<String> resultList = new ArrayList<String>();
//    public List<String> binaryTreePaths(TreeNode root) {
//
//    if (root == null) {
//        return resultList;
//    }
//    List<String> singleResult = new ArrayList<>();
//
//    getTreePath(root, singleResult);
//    return resultList;
//    }
//    private void getTreePath(TreeNode node, List<String> singleResult) {
//        singleResult.add(node.val + "");
//        if (node.left == null && node.right == null) {
//            resultList.add(singleResult);
//        }
//        if (node.left != null) {
//            getTreePath(node.left, new ArrayList<>(singleResult));
//        }
//        if (node.right != null) {
//            getTreePath(node.right, new ArrayList<>(singleResult));
//        }
//    }
//
//}



 {
    StringBuilder sb=new StringBuilder();
    List<String> list = new ArrayList();
    public List<String> binaryTreePaths(TreeNode root) {
        getTreePath(root,sb);
        return list;



    }
     private void getTreePath(TreeNode root, StringBuilder s) {
        s.append(root.val);
        s.append("->");

         if(root.left!=null){
             getTreePath(root.left,new StringBuilder(s));
         }
         if(root.right!=null){
             getTreePath(root.right,new StringBuilder(s));

         }else if(root.left==null&&root.right==null){
             s.delete(s.length()-2,s.length());
             list.add(s+"");

         }


     }
}
public class BinaryTreePaths {
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

    public static String stringListToString(List<String> stringList) {
        StringBuilder sb = new StringBuilder("[");
        for (String item : stringList) {
            sb.append(item);
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

            List<String> ret = new Solution().binaryTreePaths(root);

            String out = stringListToString(ret);

            System.out.print(out);
        }
    }
}