package zen.AbstractFactory;

public class nvwa {
    public static void main(String[] args) {
        MaleFactory maleFactory = new MaleFactory();
        FemaleFactory femaleFactory = new FemaleFactory();
        Human maleYellowHuman = maleFactory.createYellowHuman();
        Human femaleYellowHuman = femaleFactory.createYellowHuman();
        System.out.println("----生产黄色女性---");
    }
}
