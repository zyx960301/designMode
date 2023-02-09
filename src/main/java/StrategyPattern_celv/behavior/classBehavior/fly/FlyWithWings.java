package StrategyPattern_celv.behavior.classBehavior.fly;

import StrategyPattern_celv.behavior.interfaceBehavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying !!");
    }
}
