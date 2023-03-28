package zen.proxyPattern.pt;

import zen.proxyPattern.IGamePlayer;
import zen.proxyPattern.qz.IProxy;

public class GamePlayerProxy implements IGamePlayer, IProxy {
    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(String name) {
        try {
            gamePlayer = new GamePlayer(name);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user,password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    @Override
    public void count() {
        System.out.println("升级总费用是：150元");
    }
}
