/**
 * @ClassName testJdkProxy
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/2/21 16:14
 */
package test.test1;

public class testJdkProxy {
    public static void main(String[] args) {
        JdkProxyExample jdk=new JdkProxyExample();
        HelloWord proxy= (HelloWord) jdk.bind(new HelloWordImpl());

        proxy.sayHelloWord();
    }
}
