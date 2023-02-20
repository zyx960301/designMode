package DecoratorPattern_zsz.domain.drinks;

import DecoratorPattern_zsz.domain.Beverage;

//焦炒咖啡--饮料
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    public double cost() {
        return 2.12;
    }
}
