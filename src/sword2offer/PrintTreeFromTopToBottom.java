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
import java.util.List;
import java.util.Stack;

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
        if (root != null) {
            linkedList.add(root);
        }
        while (!linkedList.isEmpty()) {
            TreeNode tem = (TreeNode) linkedList.poll();//pool取出并删除
            list.add(tem.val);
            if (tem.left != null) {
                linkedList.offer(tem.left);//尾部添加
            }
            if (tem.right != null) {
                linkedList.offer(tem.right);//尾部添加
            }
        }
        return list;


    }

    //分层打印
    public ArrayList<ArrayList<Integer>> PrintFromTopToBottom2(TreeNode root) {
        ArrayList<ArrayList<Integer>> list = new ArrayList();
        ArrayList<Integer> clist = new ArrayList<>();

        LinkedList linkedList = new LinkedList();//
        if (root != null) {
            linkedList.add(root);

        }
        int num = 0;//下一层有几个
        int toBeprint = 1;//当前层还有几个
        while (!linkedList.isEmpty()) {
            TreeNode tem = (TreeNode) linkedList.poll();

            if (tem.left != null) {
                linkedList.offer(tem.left);
                num++;

            }
            if (tem.right != null) {
                linkedList.offer(tem.right);
                num++;
            }
            clist.add(tem.val);
            --toBeprint;
            //当前层没了
            if (toBeprint == 0) {
                list.add(clist);
                clist = new ArrayList<>();

                toBeprint = num;//把下一层的个数复制给当前层
                num = 0;//下一层格式为0
            }
        }
        return list;


    }
    //之字型打印1
    public ArrayList<ArrayList<Integer>> PrintFromTopToBottom3(TreeNode root) {

        ArrayList<ArrayList<Integer>> list = new ArrayList();
        ArrayList<Integer> clist = new ArrayList<>();

        LinkedList linkedList = new LinkedList();//
        LinkedList linkedList2 = new LinkedList();//
        if (root != null) {
            linkedList.add(root);
            linkedList2.add(root);
        }

        int cen = 2;
        int num = 0;//下一层有几个
        int toBeprint = 1;//当前层还有几个
        while (!linkedList.isEmpty()) {
            TreeNode tem = (TreeNode) linkedList.poll();
            TreeNode tem1 = (TreeNode) linkedList2.poll();


            if (cen % 2 == 0) {
                if (tem.left != null) {
                    linkedList.offer(tem.left);
                    num++;

                }
                if (tem.right != null) {
                    linkedList.offer(tem.right);

                    num++;
                }
                if (tem1.right != null) {
                    linkedList2.offer(tem1.right);
                }
                if (tem1.left != null) {
                    linkedList2.offer(tem1.left);
                }
            } else {
                if (tem.right != null) {
                    linkedList.offer(tem.right);
                    num++;
                }
                if (tem.left != null) {
                    linkedList.offer(tem.left);

                    num++;
                }
                if (tem1.left != null) {
                    linkedList2.offer(tem1.left);
                }
                if (tem1.right != null) {
                    linkedList2.offer(tem1.right);
                }
            }

            clist.add(tem.val);
            --toBeprint;
            //当前层没了


            if (toBeprint == 0) {
                cen++;
                list.add(clist);
                clist = new ArrayList<>();
                toBeprint = num;//把下一层的个数复制给当前层
                num = 0;//下一层格式为0
                LinkedList temp = new LinkedList();
                temp = linkedList;
                linkedList = linkedList2;
                linkedList2 = temp;
            }
        }
        return list;

    }
    //之字型打印2
    public ArrayList<ArrayList<Integer>> PrintFromTopToBottom4(TreeNode root) {
        ArrayList<ArrayList<Integer>> list = new ArrayList();
        ArrayList<Integer> clist = new ArrayList<>();

        LinkedList linkedList = new LinkedList();//
        int cen=0;

        if (root != null) {
            linkedList.add(root);

        }
        int num = 0;//下一层有几个
        int toBeprint = 1;//当前层还有几个
        while (!linkedList.isEmpty()) {
            TreeNode tem = (TreeNode) linkedList.poll();

            if (tem.left != null) {
                linkedList.offer(tem.left);
                num++;

            }
            if (tem.right != null) {
                linkedList.offer(tem.right);
                num++;
            }
            clist.add(tem.val);
            --toBeprint;
            //当前层没了
            if (toBeprint == 0) {
                cen++;
                //当层数是2的倍数时，将clist反转一下
                if(cen%2==0){
                    ArrayList<Integer> temp=new ArrayList();
                    for (int i = clist.size()-1; i >= 0; --i) {
                        temp.add(clist.get(i));
                    }
                    clist=temp;

                }
                list.add(clist);
                clist = new ArrayList<>();

                toBeprint = num;//把下一层的个数复制给当前层
                num = 0;//下一层格式为0
            }
        }
        return list;


    }



}
