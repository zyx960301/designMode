package zen.AbstractFactory.product;

public class Client {
    public static void main(String[] args) {
        Creator1 creator1 = new Creator1();
        Creator2 creator2 = new Creator2();
        AbstractProductA productA = creator1.createProductA();
    }
}
