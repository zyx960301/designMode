package DecoratorPattern_zsz.domain.flavour;

import DecoratorPattern_zsz.domain.Beverage;
import DecoratorPattern_zsz.domain.CondimentDecorator;

//摩卡--调料
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return .20 + beverage.cost();
    }
    public String getDescription() {
        return beverage.getDescription() +",Mocha";
    }
}
