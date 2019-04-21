/**
 * @ClassName TestStaticProxy
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/21 11:37
 */
package learn.StaticProxy;

public class TestStaticProxy {
    public static void main(String[] args) {
        HelloWord helloWord =new StaticProxyExample( new HelloWorldImpl());
        helloWord.sayHelloWord();
    }
}
