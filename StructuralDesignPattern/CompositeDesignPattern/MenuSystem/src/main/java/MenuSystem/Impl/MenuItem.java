package MenuSystem.Impl;

import MenuSystem.MenuSystemComponet;

public class MenuItem implements MenuSystemComponet {

    String name;
    Double price;

    public MenuItem(String name, Double price){
        this.name=name;
        this.price=price;
    }

    @Override
    public void display() {
        System.out.println(this.name+" $"+this.price);
    }
}
