public class ArrayIndexExceptionHandling {

   
    public static void main(String[] args) {
        System.out.println("HASSAN KHAN ");
        System.out.println("21-ARID-717");
      
        String [] stringArray = {"Muhammad Ahsan", "Hassan Nawaz Khan Usama", "Rana Haseeb ur Rehman", "Abdul Subhan", "Muneeb Ahmed", "Huzaifa Bin Shahzad"};
        try{
            for(int i=0; i <= stringArray.length; i++){
            System.out.println(stringArray[i]);
       }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index not Found");
        }
        
    }
}