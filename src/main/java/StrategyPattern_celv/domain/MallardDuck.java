package StrategyPattern_celv.domain;

import StrategyPattern_celv.behavior.classBehavior.fly.FlyNoWay;
import StrategyPattern_celv.behavior.classBehavior.quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }
    public void display(){
        System.out.println("I'm a real Mallard duck");
    }

}
