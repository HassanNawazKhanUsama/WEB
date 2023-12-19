public class CatchMultipleExceptions {

   
    public static void main(String[] args) {
         System.out.println("HASSAN KHAN");
        System.out.println("21-ARID-717");
        // TODO code application logic here
        try{
            int array[] = new int[5];
            array[5] = 2/0;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception Exception");
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }catch(Exception e){
            System.out.println("Generic Exception");
        }
        
         System.out.println("Rest of Code");

    }
}