package StrategyPattern_celv;

import StrategyPattern_celv.behavior.classBehavior.fly.FlyRocketPowered;
import StrategyPattern_celv.behavior.classBehavior.quack.Quack;
import StrategyPattern_celv.domain.MallardDuck;
import StrategyPattern_celv.domain.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.setQuackBehavior(new Quack());
        modelDuck.performFly();
        modelDuck.performQuack();

    }
}
