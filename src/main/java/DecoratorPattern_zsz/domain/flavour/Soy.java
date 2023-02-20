package DecoratorPattern_zsz.domain.flavour;

import DecoratorPattern_zsz.domain.Beverage;
import DecoratorPattern_zsz.domain.CondimentDecorator;
//豆浆--调料
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return .20 + beverage.cost();
    }
    public String getDescription() {
        return beverage.getDescription() + ",Soy";
    }
}
