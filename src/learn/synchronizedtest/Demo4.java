/**
 * @ClassName Demo4
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/17 16:15
 */
package learn.synchronizedtest;
/**
 * @ClassName Demo1
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/17 15:44
 */

//修饰方法
public class Demo4 implements Runnable{
    private static int count;

    public Demo4() {
        count = 0;
    }

    public synchronized void run() {
        for (int i = 0; i < 5; i ++) {
            try {
                System.out.println(Thread.currentThread().getName() + ":" + (count++));
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Demo4 syncThread = new Demo4();
        Demo4 syncThread1 = new Demo4();
        Thread thread1 = new Thread(syncThread, "SyncThread1");
        Thread thread2 = new Thread(syncThread, "SyncThread2");
        thread1.start();
        thread2.start();
    }
}

