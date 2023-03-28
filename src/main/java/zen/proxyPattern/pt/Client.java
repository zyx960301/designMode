package zen.proxyPattern.pt;

import zen.proxyPattern.GamePlayer;
import zen.proxyPattern.IGamePlayer;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        IGamePlayer player  = new GamePlayer("张三");
        GamePlayIH gamePlayIH = new GamePlayIH(player);
//        IGamePlayer proxy = new GamePlayerProxy("张三");
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(player.getClass().getClassLoader(), new Class[]{IGamePlayer.class}, gamePlayIH);
        System.out.println("开始时间是: 2009-8-25 10:45" );
        proxy.login("zhangsan","password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("j结束时间是：2009-8-26 03：40");
    }
}
