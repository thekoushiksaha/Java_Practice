public class Main {
    public Main() {
        System.out.println("= Rotate Array By Left =");
    }

    public static void rotateArray(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Invalid Array Passed");
        }
        int firstElement = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = firstElement;
        System.out.println("-> Array rotated successfully!");
    }

    public static void printArray(int[] arr) {
        System.out.println("Array: ");
        for (int e : arr) {
            System.out.print(e + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Main obj = new Main();
        // int[] arr = { 3, 5, 7, 2, 7 };
        int[] arr = {};
        printArray(arr);
        rotateArray(arr);
        printArray(arr);
    }
}