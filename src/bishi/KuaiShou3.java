///**
// * @ClassName KuaiShou3
// * @Description
// * @Author HAHA
// * @Version V1.0.0
// * @Date 2019/8/25 17:59
// */
//package bishi;
//
//import java.util.*;
//
//public class KuaiShou3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        char[] c = s.toCharArray();
//        HashMap<Character,Integer> map = new HashMap<>();
//        for (char c1 : c) {
//            if(map.containsKey(c1)){
//                int num = map.get(c1)+1;
//                map.put(c1,num);
//            }else {
//                map.put(c1,1);
//            }
//        }
//        HashMap<Integer,String> map1 = new HashMap<>(map.size());
//        List<Integer> list = new ArrayList<>();
//        for (Character character : map.keySet()) {
//
//            if(map1.containsKey())
//            map1.put(map.get(character),character);
//            list.add(map.get(character));
//        }
//        StringBuilder out =new StringBuilder();
//        Collections.sort(list);9080[]\
//                for (int i = list.size() - 1; i >= 0; i--) {
//            char cc=map1.get(list.get(i));
//            out.append(cc);
//            out.append(':');
//            out.append(map.get(cc));
//            if(i!=0){
//                out.append(',');
//            }
//
//        }
//        System.out.println(out.toString());
//
//
//    }
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//+-
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
