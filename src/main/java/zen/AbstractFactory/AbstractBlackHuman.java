package zen.AbstractFactory;

public abstract class AbstractBlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑色人种皮肤是黑色的");
    }
    @Override
    public void talk() {
        System.out.println("黑色人种会说话，一般说的都是单字节");
    }
}
