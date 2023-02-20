package DecoratorPattern_zsz.domain;
//基类星巴克
public abstract class Beverage {
    public String description = "Unknown Beverage";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
