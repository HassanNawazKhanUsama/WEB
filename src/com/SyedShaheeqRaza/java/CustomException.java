public class CustomException {
    public static void validate(int age){
        if(age < 18){
            throw new ArithmeticException("Person is not eligible for vote");
        }else{
            System.out.println("Person is eligible for vote");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("HASSAN KHAN");
        System.out.println("21-ARID-717");
    
        validate(13);
    }
}