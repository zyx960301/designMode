package zen.proxyPattern.Dynamic;

public class BeforeAdvice implements IAdvice{
    public void exec() {
        System.out.println("前置通知，被执行了");
    }
}
