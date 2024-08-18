package FoodOrderState.impl;

import FoodOrderState.FoodOrderState;
import FoodOrder.FoodOrder;

public class OrderPlacedState implements FoodOrderState {

    @Override
    public void transicationToNext(FoodOrder order) {
        order.setState(new FoodPreparationState());
    }

    @Override
    public void showStatus() {
        System.out.println("Order placed, waiting for the food to be started preparing.");
    }
}
