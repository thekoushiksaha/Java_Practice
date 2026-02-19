public class Main {

    public Main() {
        System.out.println("= Reverse Array in Same Array =");
    }

    public void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("-> Array reversed successfully!");
    }

    public void printArray(int[] arr) {
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Main obj = new Main();
        int[] arr = { 3, 9, 1, 6, 4, 8 };
        obj.printArray(arr);
        obj.reverseArray(arr);
        obj.printArray(arr);
    }
}