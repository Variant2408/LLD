package Pizza.ToppingDecorator.Impl;

import Pizza.BasePizza;
import Pizza.ToppingDecorator.ToppingDecorator;

public class ExtraCheese extends ToppingDecorator {

    public ExtraCheese(BasePizza basePizza){
        this.basePizza=basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+35;
    }
}
