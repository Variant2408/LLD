package FoodOrderState.impl;

import FoodOrderState.FoodOrderState;
import FoodOrder.FoodOrder;

public class DeliverdState implements FoodOrderState {

    @Override
    public void transicationToNext(FoodOrder order) {
        System.out.println("Food is already delivered to the respective customer");
    }

    @Override
    public void showStatus() {
        System.out.println("Food delivered to the Customer.");
    }
}
