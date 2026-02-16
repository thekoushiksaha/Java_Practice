public class Main {

    public Main() {
        System.out.println("Find Largest Element in Array");
    }

    public void printArray(int[] arr) {
        int largeElement = 0;
        System.out.println("Array List: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
            if (arr[i] > largeElement) {
                largeElement = arr[i];
            }
        }
        System.out.println("\nLarge Element: " + largeElement);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        int[] arr1 = { 3, 9, 10, 5, 4 };
        int[] arr2 = { 6, 18, 30, 20, 7 };
        obj.printArray(arr1);
        obj.printArray(arr2);
    }
}