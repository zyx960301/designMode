package zen.MediatorPattern;
//库存管理
public class Stock extends AbstractColleague {
    //刚开始又100台电脑
    private static int COMPUTER_NUMBER=100;

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    //库存增加
    public void increase(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("库存数量为："+COMPUTER_NUMBER);
    }
    public void decrease(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER -number;
        System.out.println("库存数量为："+COMPUTER_NUMBER);
    }
    //获取库存数量
    public int getStockNumber(){
        return COMPUTER_NUMBER;
    }
    //存货压力大了，通知采购人员不要采购，销售人员要尽快销售
    public void clearStock(){
//        Purchase purchase = new Purchase();
//        Sale sale = new Sale();
        System.out.println("清理存货数量为："+ COMPUTER_NUMBER);
//        //要请求折价销售
//        sale.offSale();
//        //要去采购人员不要采购
//        purchase.refuseBuyIBM();
        super.mediator.execute("stock.clear");
    }
}
