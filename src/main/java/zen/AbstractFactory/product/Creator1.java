package zen.AbstractFactory.product;
//产品等级1
public class Creator1 extends AbstractCreator{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
