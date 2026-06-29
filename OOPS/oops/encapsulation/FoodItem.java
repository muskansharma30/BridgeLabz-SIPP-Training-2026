package oops.encapsulation;

public abstract class FoodItem {

    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    abstract double calculateTotalPrice();

    public void displayItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public static void main(String[] args) {

        VegItem veg = new VegItem("Paneer Tikka", 200, 2);
        NonVegItem nonVeg = new NonVegItem("Chicken Biryani", 300, 2);

        System.out.println("Veg Item");
        veg.displayItemDetails();
        System.out.println("Total Price = " + veg.calculateTotalPrice());

        System.out.println();

        System.out.println("Non Veg Item");
        nonVeg.displayItemDetails();
        System.out.println("Total Price = " + nonVeg.calculateTotalPrice());
    }
}

class VegItem extends FoodItem {

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}

class NonVegItem extends FoodItem {

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50;
    }
}
