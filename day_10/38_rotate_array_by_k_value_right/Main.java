public class Main {

    public static void printArray(int[] arr) {
        System.out.println("Array: ");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void rotateArrayByKValue(int[] arr, int k) {
        k = k % arr.length;
        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, arr.length - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        System.out.println("= Rotate Array by K Value (Clock wise - right to left) =");
        int[] arr = { 2, 5, 1, 6 };
        printArray(arr);
        rotateArrayByKValue(arr, 2);
        printArray(arr);
    }
}