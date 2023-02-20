package DecoratorPattern_zsz.domain.flavour;

import DecoratorPattern_zsz.domain.Beverage;
import DecoratorPattern_zsz.domain.CondimentDecorator;

//奶泡 --调料
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return beverage.cost() + .21;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
