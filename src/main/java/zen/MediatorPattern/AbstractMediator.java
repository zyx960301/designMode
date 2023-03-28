package zen.MediatorPattern;
//抽象中介者
public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator(Purchase purchase, Sale sale, Stock stock) {
        this.purchase = purchase;
        this.sale = sale;
        this.stock = stock;
    }
    public abstract void execute(String str,Object...objects);
}
