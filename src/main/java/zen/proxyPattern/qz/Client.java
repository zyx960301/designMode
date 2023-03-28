package zen.proxyPattern.qz;


public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
//        IGamePlayer proxy = new GamePlayerProxy(player);
        IGamePlayer proxy = player.getProxy();
        System.out.println("开始时间是: 2009-8-25 10:45" );
        proxy.login("zhangsan","password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("j结束时间是：2009-8-26 03：40");
    }
}
