///**
// * @ClassName LeetCode160
// * @Description
// * @Author HAHA
// * @Version V1.0.0
// * @Date 2019-03-04 14:47
// */
//package leetcode226.easy.leetcode160;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int x) {
//         val = x;
//         next = null;
//     }
// }
//
//class Solution {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        ListNode a=null;
//
//        ListNode nodea=headA;
//        ListNode nodeb=headB;
//        while(nodea!=null){
//
//            while(nodeb!=null){
//                if(nodea.val==nodeb.val&&a!=null){
//                    a=nodea;
//                }
//                if(nodea.val!=nodeb.val&&nodea.next!=null&nodeb.next!=null){
//                    a= null;
//                }
//
//
//                nodeb=nodeb.next;
//            }
//
//
//            nodea=nodea.next;
//        }
//        return a;
//    }
//}
//
//
//public class LeetCode160 {
//    public static int[] stringToIntegerArray(String input) {
//        input = input.trim();
//        input = input.substring(1, input.length() - 1);
//        if (input.length() == 0) {
//            return new int[0];
//        }
//
//        String[] parts = input.split(",");
//        int[] output = new int[parts.length];
//        for(int index = 0; index < parts.length; index++) {
//            String part = parts[index].trim();
//            output[index] = Integer.parseInt(part);
//        }
//        return output;
//    }
//
//    public static ListNode stringToListNode(String input) {
//        // Generate array from the input
//        int[] nodeValues = stringToIntegerArray(input);
//
//        // Now convert that list into linked list
//        ListNode dummyRoot = new ListNode(0);
//        ListNode ptr = dummyRoot;
//        for(int item : nodeValues) {
//            ptr.next = new ListNode(item);
//            ptr = ptr.next;
//        }
//        return dummyRoot.next;
//    }
//
//    public static String listNodeToString(ListNode node) {
//        if (node == null) {
//            return "[]";
//        }
//
//        String result = "";
//        while (node != null) {
//            result += Integer.toString(node.val) + ", ";
//            node = node.next;
//        }
//        return "[" + result.substring(0, result.length() - 2) + "]";
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String line;
//        while ((line = in.readLine()) != null) {
//            int intersectVal = Integer.parseInt(line);
//            line = in.readLine();
//            ListNode listA = stringToListNode(line);
//            line = in.readLine();
//            ListNode listB = stringToListNode(line);
//            line = in.readLine();
//            int skipA = Integer.parseInt(line);
//            line = in.readLine();
//            int skipB = Integer.parseInt(line);
//
//            ListNode ret = new Solution().getIntersectionNode(intersectVal, listA, listB, skipA, skipB);
//
//            String out = listNodeToString(ret);
//
//            System.out.print(out);
//        }
//    }
//}