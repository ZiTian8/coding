/**
 * @ClassName Demo1
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/17 15:44
 */
package learn.synchronizedtest;
//修饰代码块
public class Demo1 implements Runnable{
    private static int count;

    public Demo1() {
        count = 0;
    }

    public void run() {
        synchronized(this) {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }



    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Demo1 syncThread = new Demo1();
        Demo1 syncThread1 = new Demo1();
        Thread thread1 = new Thread(syncThread, "SyncThread1");
        Thread thread2 = new Thread(syncThread1, "SyncThread2");
        thread1.start();
        thread2.start();
    }
}

