package FactoryPattern_gc.pizzafm;

import FactoryPattern_gc.pizzas.Pizza;
import FactoryPattern_gc.pizzas.SimplePizzaFactory;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    abstract Pizza createPizza(String type);
}
