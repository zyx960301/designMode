package DecoratorPattern_zsz;

import DecoratorPattern_zsz.domain.Beverage;
import DecoratorPattern_zsz.domain.drinks.DarkRoast;
import DecoratorPattern_zsz.domain.drinks.Espresso;
import DecoratorPattern_zsz.domain.drinks.HouseBlend;
import DecoratorPattern_zsz.domain.flavour.Mocha;
import DecoratorPattern_zsz.domain.flavour.Soy;
import DecoratorPattern_zsz.domain.flavour.Whip;

import java.sql.SQLOutput;

//订单
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$" + beverage.cost());
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() +"$" + beverage1.cost());
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + "$" + beverage2.cost());
    }
}
