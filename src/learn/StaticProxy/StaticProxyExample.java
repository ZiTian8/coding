/**
 * @ClassName StaticProxyExample
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/21 11:35
 */
package learn.StaticProxy;

public class StaticProxyExample implements HelloWord {
    // 目标对象
    private HelloWord helloWord;
    // 通过构造方法传入目标对象
    public StaticProxyExample(HelloWord helloWord){
        this.helloWord=helloWord;
    }

    @Override
    public void sayHelloWord() {
        System.out.println("进入代理逻辑方法");
        System.out.println("在调度真实对象之前的服务");

        helloWord.sayHelloWord();
        System.out.println("在调度真实对象之后的服务");

    }
}
