package zen.AbstractFactory;

public interface HumanFactory {
    //创造黄色人种
    public Human createYellowHuman();
    //创造白色人种
    public Human createWhiteHuman();
    //创造黑色人种
    public Human createBlackHuman();
}
