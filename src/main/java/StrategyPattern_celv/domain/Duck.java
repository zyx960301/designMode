package StrategyPattern_celv.domain;

import StrategyPattern_celv.behavior.interfaceBehavior.FlyBehavior;
import StrategyPattern_celv.behavior.interfaceBehavior.QuackBehavior;

public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void Swim(){
        System.out.println("swim");
    }
    public void display(){
        System.out.println("display");
    }
}
