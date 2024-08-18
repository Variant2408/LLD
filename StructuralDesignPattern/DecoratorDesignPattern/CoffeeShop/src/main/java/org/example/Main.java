package org.example;

import CoffeShop.Coffee;
import CoffeShop.Impl.BasicCoffee;
import CoffeShop.Decorator.Impl.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        Coffee basicCoffee = new BasicCoffee();
        System.out.println(basicCoffee.getDescription() + " $" + basicCoffee.cost());

        Coffee milkCoffee = new MilkDecorator(basicCoffee);
        System.out.println(milkCoffee.getDescription() + " $" + milkCoffee.cost());

        Coffee milkSugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println(milkSugarCoffee.getDescription() + " $" + milkSugarCoffee.cost());

    }
}