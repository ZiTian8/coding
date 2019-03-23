///**
// * @ClassName LeetCode141
// * @Description
// * @Author HAHA
// * @Version V1.0.0
// * @Date 2019-03-01 22:33
// */
//package leetcode226.easy.leetcode141;
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
//    public boolean hasCycle(ListNode head) {
//
//    }
//}
//
//public class LeetCode141 {
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
//    public static String booleanToString(boolean input) {
//        return input ? "True" : "False";
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String line;
//        while ((line = in.readLine()) != null) {
//            ListNode head = stringToListNode(line);
//            line = in.readLine();
//            int pos = Integer.parseInt(line);
//
//            boolean ret = new Solution().hasCycle(head, pos);
//
//            String out = booleanToString(ret);
//
//            System.out.print(out);
//        }
//    }
//}
