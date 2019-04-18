/**
 * @ClassName Demo3
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/17 16:18
 */
package learn.synchronizedtest;

/**
 * @ClassName Demo3
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/17 16:12
 */


public class Demo3 implements Runnable{
    private Account account;
    public Demo3(Account account) {
        this.account = account;
    }

    public void run() {
        synchronized (account) {
            account.deposit(500);
            account.withdraw(500);
            System.out.println(Thread.currentThread().getName() + ":" + account.getBalance());
        }
    }

    public static void main(String[] args) {
        Account account = new Account("zhang san", 10000.0f);
        Demo3 accountOperator = new Demo3(account);

        final int THREAD_NUM = 5;
        Thread threads[] = new Thread[THREAD_NUM];
        for (int i = 0; i < THREAD_NUM; i ++) {
            threads[i] = new Thread(accountOperator, "Thread" + i);
            threads[i].start();
        }
    }
}
/**

 - 银行账户类
 */
class Account {
    String name;
    float amount;
    public Account(String name, float amount) {
        this.name = name;
        this.amount = amount;
    }
    //存钱
    public  void deposit(float amt) {
        amount += amt;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //取钱
    public  void withdraw(float amt) {
        amount -= amt;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public float getBalance(){
        return amount;
    }
}

