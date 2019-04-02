/**
 * @ClassName Test
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/3/28 21:12
 */
package learn;

import java.util.Random;

public class Shuffle {
    //private static Random random;
//    private static long seed;        // pseudo-random number generator seed
//
//    // static initializer
//    static {
//        // this is how the seed was set in Java 1.4
//        seed = System.currentTimeMillis();
//        random = new Random(seed);
//    }
//    public static int uniform(int n) {
//        long seed = System.currentTimeMillis();
//        Random random = new Random(seed);
//        if (n <= 0) throw new IllegalArgumentException("argument must be positive: " + n);
//        return random.nextInt(n);
//    }
//    public static void shuffle(int[] a) {
//
//        int n = a.length;
//        for (int i = 0; i < n; i++) {
//            int r = i + uniform(n-i);     // between i and n-1
//            System.out.println("r:"+r);
//            int temp = a[i];
//            a[i] = a[r];
//            a[r] = temp;
//        }
//    }
    public static void shuffle(int[] a) {
        Random random = new Random();
        int n = a.length;
        for(int i=n-1;i>0;i--){
            int r = random.nextInt(i);
            System.out.println("r:"+r);
            int tem=a[i];
            a[i]=a[r];
            a[r]=tem;
        }
    }

    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6};
        Shuffle t=new Shuffle();
        t.shuffle(a);
        for (int i:a) {
            System.out.println(i);
        }
    }
}
