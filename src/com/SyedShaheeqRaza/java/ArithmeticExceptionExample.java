public class ArithmeticExceptionExample {

    public static void main(String[] args) {
        System.out.println("HASSAN KHAN");
        System.out.println("21-ARID-717");
        // TODO code application logic her
        try {
            //code that may raise exception  
            int totalNumbers = 60;
            int numbers = 75;
            if(numbers > totalNumbers){
                throw new ArithmeticException("Greater than total Numbers");
            }else{
                double percentage = (numbers / totalNumbers)*100;
                System.out.println("Your percentage: " + percentage);
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        } 
        System.out.println("Program execution continues....");
    }
}