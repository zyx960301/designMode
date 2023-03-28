package zen.MediatorPattern;

import java.util.Random;

//销售管理
public class Sale extends AbstractColleague {
    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    //销售IBM电脑
    public void sellIBMComputer(int number){
       //访问库存
//        Stock stock = new Stock();
//        //访问采购
//        Purchase purchase = new Purchase();
        //库存量不够销售
        super.mediator.execute("sale.sell",number);
//        if(stock.getStockNumber() < number){
//            purchase.buyIBMcomputer(number);
//        }
        System.out.println("销售IBM电脑"+number+"台");
//        stock.decrease(number);
    }
    //反馈销售情况，0-100之间变化 0没人买，100代表畅销出一个卖一个
    public int getSaleStatus(){
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        System.out.println("IBM电脑的畅销情况为："+saleStatus);
        return saleStatus;
    }
    //折价处理
    public void offSale(){
        //库房有多少卖多少
        super.mediator.execute("sale.offsell");
//        System.out.println("折价销售IBM电脑"+stock.getStockNumber()+"台");
    }
}
