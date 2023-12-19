public class Point {
    private int x; // X-axis value
    private int y; // Y-axis value

    // Default constructor to initialize X and Y to 0
    public Point() {
        x = 0;
        y = 0;
    }

    // Parametric constructor to accept X and Y as arguments
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter method for X
    public int getX() {
        return x;
    }

    // Setter method for X
    public void setX(int x) {
        this.x = x;
    }

    // Getter method for Y
    public int getY() {
        return y;
    }

    // Setter method for Y
    public void setY(int y) {
        this.y = y;
    }

    // Add method to sum up the values of X and Y and return the result
    public int add() {
        return x + y;
    }

    // Print method to display the values of X, Y, and their sum
    public void print() {
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("Sum of X and Y: " + add());
    }

    public static void main(String[] args) {
        // Create an instance of the Point class using the default constructor
        Point point1 = new Point();

        // Create another instance of the Point class using the parametric constructor
        Point point2 = new Point(5, 3);

        // Print the values and sum for point1
        System.out.println("Point 1:");
        point1.print();

        // Print the values and sum for point2
        System.out.println("Point 2:");
        point2.print();
    }
}
