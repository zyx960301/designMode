package StrategyPattern_celv.domain;

import StrategyPattern_celv.behavior.classBehavior.fly.FlyNoWay;
import StrategyPattern_celv.behavior.classBehavior.quack.Quack;
import StrategyPattern_celv.behavior.interfaceBehavior.FlyBehavior;
import StrategyPattern_celv.behavior.interfaceBehavior.QuackBehavior;

public class ModelDuck extends Duck{
    public ModelDuck() {
//        flyBehavior = new FlyNoWay();
//        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
