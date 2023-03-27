package FactoryPattern_gc.pizzafm;

import FactoryPattern_gc.pizzas.Pizza;

/**
 * Created by Gavin on 2017/3/9.
 */
public class ChicagoPizzaStore extends PizzaStore {
    Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
//                return new ChicagoStyleCheesePizza();
            case "veggie":
//                return new ChicagoStyleVeggiePizza();
            case "clam":
//                return new ChicagoStyleClamPizza();
            case "pepperoni":
//                return new ChicagoStylePepperoniPizza();
            default:
                return null;
        }
    }
}
