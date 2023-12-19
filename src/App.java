public class App {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("MPL_Class");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
