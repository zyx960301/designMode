package zen.MediatorPattern;
//采购管理
public class Purchase extends AbstractColleague {
    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    //采购IBM电脑
    public void buyIBMcomputer(int number){
        super.mediator.execute("purchase.buy",number);
//        //访问库存
//        Stock stock = new Stock();
//        //访问销售
//        Sale sale = new Sale();
//        //电脑销售情况
//        int saleStatus = stock.getStockNumber();
//        if(saleStatus > 80){
//            System.out.println("采购IBM电脑："+number+"台");
//        }else {
//            //销售情况不好
//            int buyNumber = number/2;
//            System.out.println("采购IBM电脑:"+buyNumber+"台");
//        }
    }
    //不采购IBM电脑
    public void refuseBuyIBM(){
        System.out.println("不采购IBM电脑");
    }
}
