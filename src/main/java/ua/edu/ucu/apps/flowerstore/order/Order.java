package ua.edu.ucu.apps.flowerstore.order;

import java.util.LinkedList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.flowerstore.delivery.Delivery;
import ua.edu.ucu.apps.flowerstore.payment.Payment;

@Getter @Setter @AllArgsConstructor
public class Order {
    private LinkedList<Item> itemsList;
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment paymentt) {
        this.payment = paymentt;
    }

    public void setDeliveryStrategy(Delivery deliverry) {
        this.delivery = deliverry;
    }

    public void addItem(Item item) {
        itemsList.add(item);
    }

    public void removeItem(Item item) {
        itemsList.remove(item);
    }

    public double calculateTotalPrice() {
        double total = 0.0;
        for (Item bucket : itemsList) {
            total += bucket.getPrice();
        }
        return total;
    }

    public void processOrder() {
        double totalPrice = calculateTotalPrice();
        payment.pay(totalPrice);
        delivery.deliver(itemsList);
    }
}
