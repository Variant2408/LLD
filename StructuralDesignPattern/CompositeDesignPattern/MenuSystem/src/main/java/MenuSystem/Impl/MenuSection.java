package MenuSystem.Impl;

import MenuSystem.MenuSystemComponet;

import java.util.*;

public class MenuSection implements MenuSystemComponet {

    String name;
    List<MenuSystemComponet> menuSystemComponetList=new ArrayList<>();

    public MenuSection(String name){
        this.name=name;
    }

    public void addComponent(MenuSystemComponet componet){
        menuSystemComponetList.add(componet);
    }

    @Override
    public void display() {
        for(MenuSystemComponet componet: menuSystemComponetList){
            componet.display();
        }
    }
}
