package zen.proxyPattern;
//游戏者接口
public interface IGamePlayer {
    //登录游戏
    public void login(String user,String password);
   //杀怪
    public void killBoss();
    //升级
    public void upgrade();
}
