package zen.proxyPattern;

public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        System.out.println("开始时间是: 2009-8-25 10:45" );
        player.login("zhangsan","password");
        player.killBoss();
        player.upgrade();
        System.out.println("j结束时间是：2009-8-26 03：40");
    }
}
