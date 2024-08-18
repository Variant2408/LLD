package CoffeShop.Decorator;

import CoffeShop.Coffee;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;
    public CoffeeDecorator(Coffee coffee){
        this.coffee=coffee;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription();
    }

    @Override
    public double cost() {
        return this.coffee.cost();
    }
}
