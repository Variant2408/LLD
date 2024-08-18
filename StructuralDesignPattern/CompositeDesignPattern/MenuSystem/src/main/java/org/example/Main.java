package org.example;

import MenuSystem.Impl.MenuItem;

import MenuSystem.Impl.MenuSection;
import MenuSystem.MenuSystemComponet;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        MenuSystemComponet burger = new MenuItem("Burger", 8.99);
        MenuSystemComponet fries = new MenuItem("Fries", 3.49);
        MenuSystemComponet drink = new MenuItem("Drink", 1.99);

        MenuSection lunchMenu = new MenuSection("Lunch Menu");
        lunchMenu.addComponent(burger);
        lunchMenu.addComponent(fries);
        lunchMenu.addComponent(drink);

        MenuSystemComponet pizza = new MenuItem("Pizza", 12.99);
        MenuSystemComponet pasta = new MenuItem("Pasta", 11.49);

        MenuSection dinnerMenu = new MenuSection("Dinner Menu");
        dinnerMenu.addComponent(pizza);
        dinnerMenu.addComponent(pasta);
        dinnerMenu.addComponent(lunchMenu);

        dinnerMenu.display();
    }

}