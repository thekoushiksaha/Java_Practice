public class Main {

    public static void printArray(int[] arr) {
        System.out.println("Array: ");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void moveZerosToLeft(int[] arr) {
        int slow = 0;
        for (int fast = 0; fast < arr.length - 1; fast++) {
            if (arr[fast] != 0) {
                arr[slow] = arr[fast];
                slow++;
            }
        }

        while (slow < arr.length) {
            arr[slow] = 0;
            slow++;
        }
    }

    public static void main(String[] args) {
        System.out.println("= Move All Zeros to Right =");
        int[] arr = { 3, 5, 0, 5, 8, 0, 2, 0, 3 };
        printArray(arr);
        moveZerosToLeft(arr);
        printArray(arr);
    }
}