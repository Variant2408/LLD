package CoffeShop.Decorator.Impl;

import CoffeShop.Coffee;
import CoffeShop.Decorator.CoffeeDecorator;

public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", Sugar";
    }

    @Override
    public double cost() {
        return super.cost()+0.2;
    }
}
