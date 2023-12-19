public class RoomDimension {
    private double length;  // Length of the room in feet
    private double width;   // Width of the room in feet
    private double costPerSquareFoot;  // Price per square foot of carpet

    // Constructor to initialize the dimensions and cost per square foot
    public RoomDimension(double length, double width, double costPerSquareFoot) {
        this.length = length;
        this.width = width;
        this.costPerSquareFoot = costPerSquareFoot;
    }

    // Calculate the area of the room
    public double calculateArea() {
        return length * width;
    }

    // Calculate the total cost for carpeting the room
    public double calculateTotalCost() {
        return calculateArea() * costPerSquareFoot;
    }

    // Print the area of the room and total carpet price
    public void printRoomInfo() {
        System.out.println("Room Area: " + calculateArea() + " square feet");
        System.out.println("Total Carpet Price: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        // Create an instance of RoomDimension
        RoomDimension room1 = new RoomDimension(12.0, 10.0, 8.0);

        // Calculate and print room information
        room1.printRoomInfo();
    }
}
