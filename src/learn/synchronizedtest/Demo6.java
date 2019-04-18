/**
 * @ClassName Demo6
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/17 16:06
 */
package learn.synchronizedtest;
//修饰类
class Demo6 implements Runnable {
    private static int count;

    public Demo6() {
        count = 0;
    }

    public static void method() {
        synchronized(Demo6.class) {
            for (int i = 0; i < 5; i ++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void run() {
        method();
    }

    public static void main(String[] args) {
        Demo6 syncThread1 = new Demo6();
        Demo6 syncThread2 = new Demo6();
        Thread thread1 = new Thread(syncThread1, "SyncThread1");
        Thread thread2 = new Thread(syncThread2, "SyncThread2");
        thread1.start();
        thread2.start();
    }
}
