package DecoratorPattern_zsz.domain.drinks;

import DecoratorPattern_zsz.domain.Beverage;

//浓缩咖啡--饮料
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
