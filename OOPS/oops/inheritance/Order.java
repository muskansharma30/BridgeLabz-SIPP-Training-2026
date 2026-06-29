package oops.inheritance;

public class Order {

    int orderId;
    String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }

    public static void main(String[] args) {

        DeliveredOrder order = new DeliveredOrder(
                101,
                "23-06-2026",
                "TRK12345",
                "25-06-2026"
        );

        System.out.println("Order ID: " + order.orderId);
        System.out.println("Order Date: " + order.orderDate);
        System.out.println("Tracking Number: " + order.trackingNumber);
        System.out.println("Delivery Date: " + order.deliveryDate);
        System.out.println("Status: " + order.getOrderStatus());
    }
}

class ShippedOrder extends Order {

    String trackingNumber;

    public ShippedOrder(int orderId, String orderDate,
                        String trackingNumber) {

        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {

    String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate,
                          String trackingNumber,
                          String deliveryDate) {

        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }
}
