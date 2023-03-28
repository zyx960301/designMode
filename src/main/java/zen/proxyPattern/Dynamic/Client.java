package zen.proxyPattern.Dynamic;

public class Client {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
//        MyInvocationHandler handler = new MyInvocationHandler(realSubject);
//        Subject proxy = DynamicProxy.newProxyInstance(realSubject.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), handler);
        Subject proxy = SubjectDynamicProxy.newProxyInstance(realSubject);
        proxy.doSomething("Finish");
    }
}
