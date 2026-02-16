public class Main {

    public Main() {
        System.out.println("Reverse an Array");
    }

    public void printArray(int[] arr) {
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public int[] reverseArray(int[] arr) {
        int[] revArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            revArray[arr.length - 1 - i] = arr[i];
        }
        return revArray;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        int[] arr1 = { 3, 9, 10, 5, 4 };
        obj.printArray(arr1);
        arr1 = obj.reverseArray(arr1);
        obj.printArray(arr1);
    }
}