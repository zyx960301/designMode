package StrategyPattern_celv.behavior.classBehavior.quack;

import StrategyPattern_celv.behavior.interfaceBehavior.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack() {
        //大喊
        System.out.println("Quack");
    }
}
