public class FinallyKeyWord {

    
    public static void main(String[] args) {
        System.out.println("HASSAN KHAN");
        System.out.println("21-ARID-717");
   
        try{
            int [] numbers = {1,2,3,4};
            System.out.println(numbers[10]);
        } catch(Exception e){
            assert System.out != null;
            System.out.println("Something went wrong");
        } finally{
            System.out.println("Try-Catch execution Finished");        
        }     
    }
}