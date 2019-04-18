/**
 * @ClassName Demo5
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/17 16:03
 */
package learn.synchronizedtest;
//修饰静态方法
class Demo5 implements Runnable {
    private static int count;

    public Demo5() {
        count = 0;
    }

    public synchronized static void method() {
        for (int i = 0; i < 5; i ++) {
            try {
                System.out.println(Thread.currentThread().getName() + ":" + (count++));
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void run() {
        method();
    }

    public static void main(String[] args) {
        Demo5 syncThread1 = new Demo5();
        Demo5 syncThread2 = new Demo5();
        Thread thread1 = new Thread(syncThread1, "SyncThread1");
        Thread thread2 = new Thread(syncThread2, "SyncThread2");
        thread1.start();
        thread2.start();
    }
}