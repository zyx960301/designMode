package zen.TemplateMethodPattern.Abstract;
//抽象模板类
public abstract class AbstractClass {
    protected abstract void doSomething();
    protected abstract void doAnything();
    public void templateMethod(){
        this.doAnything();
        this.doSomething();
    }
}
