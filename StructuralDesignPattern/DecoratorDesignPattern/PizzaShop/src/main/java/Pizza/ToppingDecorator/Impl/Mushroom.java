package Pizza.ToppingDecorator.Impl;

import Pizza.BasePizza;
import Pizza.ToppingDecorator.ToppingDecorator;

public class Mushroom extends ToppingDecorator {

    public Mushroom(BasePizza basePizza){
        this.basePizza=basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+55;
    }
}
