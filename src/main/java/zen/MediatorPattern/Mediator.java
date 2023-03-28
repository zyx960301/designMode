package zen.MediatorPattern;

public class Mediator extends AbstractMediator{
    public Mediator(Purchase purchase, Sale sale, Stock stock) {
        super(purchase, sale, stock);
    }

    @Override
    public void execute(String str, Object... objects) {
        if (str.equals("purchase.buy")){
            //采购电脑
            this.buyComputer((Integer)objects[0]);
        }else if (str.equals("sale.sell")){
            //销售电脑
            this.sellIBMComputer((Integer)objects[0]);
        }else if (str.equals("sale.offsell")){
            //折价销售
            this.offSell();
        }else if (str.equals("stock.clear")){
            //清仓
            this.clearStock();
        }
    }
    private void buyComputer(int number){
        int saleStatus = super.sale.getSaleStatus();
        if(saleStatus > 80){
            System.out.println("采购IBM电脑："+number+"台");
            super.stock.increase(number);
        }else {
            //销售情况不好
            int buyNumber = number/2;
            System.out.println("采购IBM电脑:"+buyNumber+"台");
        }
    }
    public void sellIBMComputer(int number){
        //库存量不够销售
        if(stock.getStockNumber() < number){
            super.purchase.buyIBMcomputer(number);
        }
        System.out.println("销售IBM电脑"+number+"台");
        super.stock.decrease(number);
    }
    //折价处理
    public void offSell(){
        //库房有多少卖多少
//        Stock stock = new Stock();
        System.out.println("折价销售IBM电脑"+stock.getStockNumber()+"台");
    }
    //存货压力大了，通知采购人员不要采购，销售人员要尽快销售
    public void clearStock(){
        //要请求折价销售
        super.sale.offSale();
        //要去采购人员不要采购
        purchase.refuseBuyIBM();
    }
}
