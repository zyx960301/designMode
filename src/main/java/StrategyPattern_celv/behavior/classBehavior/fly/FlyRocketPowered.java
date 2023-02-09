package StrategyPattern_celv.behavior.classBehavior.fly;

import StrategyPattern_celv.behavior.interfaceBehavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm fly with a rocket!");
    }
}
