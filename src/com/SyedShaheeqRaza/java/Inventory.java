public class Inventory {
    private int itemNumber;
    private int quantity;
    private double cost;
    private double totalCost;

    // Default Constructor
    public Inventory() {
        itemNumber = 0;
        quantity = 0;
        cost = 0.0;
        setTotalCost();
    }

    // Constructor #2
    public Inventory(int itemNumber, int quantity, double cost) {
        this.itemNumber = itemNumber;
        this.quantity = quantity;
        this.cost = cost;
        setTotalCost();
    }

    // Setter methods
    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        setTotalCost();
    }

    public void setCost(double cost) {
        this.cost = cost;
        setTotalCost();
    }

    private void setTotalCost() {
        totalCost = quantity * cost;
    }

    // Getter methods
    public int getItemNumber() {
        return itemNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public static void main(String[] args) {
        // Create an instance of Inventory using Constructor #2
        Inventory item1 = new Inventory(101, 50, 5.0);

        // Display item information
        System.out.println("Item Number: " + item1.getItemNumber());
        System.out.println("Quantity: " + item1.getQuantity());
        System.out.println("Cost: $" + item1.getCost());
        System.out.println("Total Cost: $" + item1.getTotalCost());

        // Update quantity and cost
        item1.setQuantity(75);
        item1.setCost(6.5);

        // Display updated information
        System.out.println("Updated Quantity: " + item1.getQuantity());
        System.out.println("Updated Cost: $" + item1.getCost());
        System.out.println("Updated Total Cost: $" + item1.getTotalCost());
    }
}
