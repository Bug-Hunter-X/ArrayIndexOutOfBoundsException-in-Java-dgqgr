public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            System.out.println(arr[5]); //This will still throw exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array index out of bounds: " + e.getMessage());
        }
        try{
            int index = 2;
            if(index >= 0 && index < arr.length){
                System.out.println(arr[index]);
            }else{
                System.err.println("Index out of bound");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Array index out of bounds: " + e.getMessage());
        }
    }
}