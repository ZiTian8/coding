/**
 * @ClassName CountDownLatchTest
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/17 11:14
 */
package learn;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    public static void main(String[] args) {
        CountDownLatch begin = new CountDownLatch(1);
        CountDownLatch end = new CountDownLatch(3);

        for(int i=0; i<3; i++){
            Thread thread = new Thread(new Player(begin,end));
            thread.start();
        }

        try{
            System.out.println("the race begin");
            //2.main线程运行到这里，使得begin中的Count-1变为0，使得所有被begin.await阻塞的程序往下运行
            begin.countDown();
            //3.main线程运行到这里会被阻塞，直到end中的Count变为0，才能继续往下执行
            end.await();
            System.out.println("the race end");
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}

class Player implements Runnable{

    private CountDownLatch begin;

    private CountDownLatch end;

    Player(CountDownLatch begin,CountDownLatch end){
        this.begin = begin;
        this.end = end;
    }

    public void run() {

        try {
            //1.每个线程运行到这里都会被阻塞，直到main线程中的begin.countDown()使得begin中的Count-1=0，才能继续往下运行
            begin.await();
            System.out.println(Thread.currentThread().getName() + " arrived !");
            //4.每个线程运行到这里都会使end中的Count减一，当所有线程都运行到这里，则Count变为0，被end.await阻塞的main线程可以继续往下执行
            end.countDown();
//            System.out.println(Thread.currentThread().getName() + end.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
