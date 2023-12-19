public class ThrowAndThrows {

    public static void main(String[] args) {
        System.out.println("HASSAN KHAN");
        System.out.println("21-ARID-717");
        // TODO code application logic here
        try {
            int[] numbers = {1, 2, 3};
            int index = 4;
            int result = getElementAtIndex(numbers, index);
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
    
    public static int getElementAtIndex(int[] arr, int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("Index is out of bounds");
        }
        return arr[index];
    }
}