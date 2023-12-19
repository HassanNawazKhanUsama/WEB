

public class lab3e4 {
    public static void main(String[] args) {
        String ptr=null;
        try {
            if(ptr.equals("gfg"))
            System.out.println("same");
            else
            System.out.println("not same");
        } catch (NullPointerException e) {
            // TODO: handle exception
            System.out.println("NullPointerException caught");
        }
    }
    
}
