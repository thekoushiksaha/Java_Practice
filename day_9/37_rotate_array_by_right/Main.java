public class Main {
    public static void printArray(int[] arr) {
        System.out.println("Array: ");
        for (int e : arr) {
            System.out.print(e + ", ");
        }
        System.out.println();
    }

    public static void rotateArray(int[] arr) {
        if (arr.length == 0)
            throw new IllegalArgumentException("Invalid Array");
        int lastElement = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;
        System.out.println("->  Array Roated Successfully!");
    }

    public static void main(String[] args) {
        System.out.println("= Rotate Array by Right =");
        int[] arr = { 3, 6, 2, 9 };
        printArray(arr);
        rotateArray(arr);
        printArray(arr);
    }
}