package StrategyPattern_celv.behavior.classBehavior.quack;

import StrategyPattern_celv.behavior.interfaceBehavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        //吱吱叫
        System.out.println("Squeak");
    }
}
