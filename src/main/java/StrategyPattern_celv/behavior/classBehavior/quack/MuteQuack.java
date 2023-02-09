package StrategyPattern_celv.behavior.classBehavior.quack;

import StrategyPattern_celv.behavior.interfaceBehavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        //沉默
        System.out.println("<<Silence>>");
    }
}
