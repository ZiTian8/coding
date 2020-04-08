///**
// * @ClassName T2
// * @Description
// * @Author HAHA
// * @Version V1.0.0
// * @Date 2019/10/10 20:52
// */
//package bishi.pingan;
//
//import org.omg.PortableInterceptor.INACTIVE;
//
//import java.util.Scanner;
//
//public class T2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            String [] ip1 = sc.next().split("\\.");
//            String [] ip2 = sc.next().split("\\.");
//            int n =Integer.valueOf(sc.next());
//            int ip=0xFFFFFFFF<<(32-n);
//            String binaryStr = Integer.toBinaryString(ip);
//            StringBuffer buffer = new StringBuffer();
//            for (int j = 0; j < 4; j++) {
//                int beginIndex = j*8;
//                buffer.append(Integer.parseInt(beginIndex,beginIndex+8),2).append(".")
//
//            }
//            String maxk0=buffer.substring(0,buffer.length()-1);
//            System.out.println(maxk0);
//            String[] mask = maxk0.split("\\.");
//            for (int i = 0; i < mask.length; i++) {
//                if(Integer.valueOf((mask[i])&Integer.valueOf(ip1[i]))==(INACTIVE.value(mask[i]&))
//
//            }
//        }
//
//    }
//}
