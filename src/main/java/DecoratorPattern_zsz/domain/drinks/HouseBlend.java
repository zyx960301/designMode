package DecoratorPattern_zsz.domain.drinks;

import DecoratorPattern_zsz.domain.Beverage;

//星巴克独家调配咖啡--饮料
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend coffee";
    }

    public double cost() {
        return .89;
    }
}
