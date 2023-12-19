public class lab3e3 {

    public static void main(String[] args) {
        try {
            int n=5/0;
            System.out.println("rest of the code in try block");
        } catch (ArithmeticException e) {
            // TODO: handle exception
           System.out.println("ArithmeticException => " +e.getMessage() );
        }
    }
}
