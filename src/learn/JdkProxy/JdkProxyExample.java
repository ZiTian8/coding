/**
 * @ClassName JdkProxyExample
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/2/21 16:10
 */
package learn.JdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyExample implements InvocationHandler {
    //真实对象
    private Object target =null;

    /**
     * 建立代理对象和真实对象的代理关系，并返回代理对象，名字不一定是bind
     * @param target 真实对象
     * @return
     */
    public Object bind(Object target){
        this.target=target;

        /**
         * 三个参数
         * 1、target.getClass().getClassLoader()：类加载器，采用target本身的类加载器
         * 2、target.getClass().getInterfaces()：是把生成的动态代理对象下挂在哪些接口，这里就是放在target实现的接口下：
         * 3、this：定义实现方法逻辑的代理类，this表示当前对象，它必须实现InvocationHandler接口的invoke方法，他就是代理逻辑方法的现实方法
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    /**
     *
     * @param proxy 代理对象，就是bind方法生成的对象
     * @param method  当前调度方法
     * @param args  当前方法参数
     * @return  代理结果返回
     * @throws Throwable
     */

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入代理逻辑方法");
        System.out.println("在调度真实对象之前的服务");
        //调度真实对象的方法，通过反射实现
        Object obj=method.invoke(target,args);
        System.out.println("在调度真实对象之后的服务");


        return obj;
    }
}
