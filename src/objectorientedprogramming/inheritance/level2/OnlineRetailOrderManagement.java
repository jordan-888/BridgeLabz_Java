
package objectorientedprogramming.inheritance.level2;
// Multilevel Inheritance: Order → ShippedOrder → DeliveredOrder
class Order {
    String orderId;
    String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }

    public void displayOrderInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Shipped";
    }

    @Override
    public void displayOrderInfo() {
        super.displayOrderInfo();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Delivered";
    }

    @Override
    public void displayOrderInfo() {
        super.displayOrderInfo();
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println("------------------------");
    }
}

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        System.out.println("=== Online Retail Order Management (Multilevel Inheritance) ===\n");

        // Create orders at different stages
        Order order1 = new Order("ORD001", "2024-01-10");
        ShippedOrder order2 = new ShippedOrder("ORD002", "2024-01-08", "TRK123456");
        DeliveredOrder order3 = new DeliveredOrder("ORD003", "2024-01-05", "TRK789012", "2024-01-12");

        // Display order information
        System.out.println("=== Order 1 ===");
        order1.displayOrderInfo();
        System.out.println();

        System.out.println("=== Order 2 ===");
        order2.displayOrderInfo();
        System.out.println();

        System.out.println("=== Order 3 ===");
        order3.displayOrderInfo();
    }
}
