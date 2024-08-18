package CoffeShop.Impl;

import CoffeShop.Coffee;

public class BasicCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public double cost() {
        return 0.5;
    }
}
