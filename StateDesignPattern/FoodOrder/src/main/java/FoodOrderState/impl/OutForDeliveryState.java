package FoodOrderState.impl;

import FoodOrderState.FoodOrderState;
import FoodOrder.FoodOrder;

public class OutForDeliveryState implements FoodOrderState {

    @Override
    public void transicationToNext(FoodOrder order) {
        order.setState(new DeliverdState());
    }

    @Override
    public void showStatus() {
        System.out.println("Food picked and out for delivery, waiting for food to be delivered.");
    }
}
