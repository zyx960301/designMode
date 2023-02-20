package DecoratorPattern_zsz.domain.drinks;

import DecoratorPattern_zsz.domain.Beverage;

//低咖啡因咖啡--饮料
public class Decat extends Beverage {
    public Decat() {
        description = "Decat";
    }

    public double cost() {
        return 3.2;
    }
}
