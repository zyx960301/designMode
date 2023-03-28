package zen.proxyPattern.Dynamic;

public class SubjectDynamicProxy extends DynamicProxy{
    public static <T> T newProxyInstance(Subject subject){
        //获得ClassLoader
        ClassLoader loader = subject.getClass().getClassLoader();
        //获得接口数组
        Class<?>[] classes = subject.getClass().getInterfaces();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(subject);
        return newProxyInstance(loader,classes,myInvocationHandler);
    }
}
