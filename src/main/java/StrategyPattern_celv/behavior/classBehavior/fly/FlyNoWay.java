package StrategyPattern_celv.behavior.classBehavior.fly;

import StrategyPattern_celv.behavior.interfaceBehavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }

}
