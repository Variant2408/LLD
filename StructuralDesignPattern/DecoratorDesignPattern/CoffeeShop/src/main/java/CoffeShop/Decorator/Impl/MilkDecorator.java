package CoffeShop.Decorator.Impl;

import CoffeShop.Coffee;
import CoffeShop.Decorator.CoffeeDecorator;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", Milk";
    }

    @Override
    public double cost() {
        return super.cost()+0.3;
    }
}
