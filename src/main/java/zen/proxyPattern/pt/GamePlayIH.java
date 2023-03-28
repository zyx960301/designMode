package zen.proxyPattern.pt;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler {
    //被代理者
    Class cls = null;
    //被代理的实例
    Object obj = null;
    //我要代理谁
    public GamePlayIH(Object obj){
        this.obj = obj;
    }
    @Override
    //调用被代理的方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        if(method.getName().equalsIgnoreCase("login")){
            System.out.println("有人再用我账号登录！");
        }
        return result;
    }
}
