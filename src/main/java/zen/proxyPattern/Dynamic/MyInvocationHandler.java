package zen.proxyPattern.Dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
//动态代理Handler类
public class MyInvocationHandler implements InvocationHandler {
    private Object target = null;

    public MyInvocationHandler(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //执行被代理的方法
        return method.invoke(this.target,args);
    }
}
