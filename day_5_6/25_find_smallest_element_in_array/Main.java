public class Main {

    public Main() {
        System.out.println("Find Smallest Element in Array");
    }

    public void printArray(int[] arr) {
        int smallestElement = 1234567890;
        System.out.println("Array List: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
            if (arr[i] < smallestElement) {
                smallestElement = arr[i];
            }
        }
        System.out.println("\nSmallest Element: " + smallestElement);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        int[] arr1 = { 3, 9, 10, 5, 4 };
        int[] arr2 = { 6, 18, 30, 20, 7 };
        obj.printArray(arr1);
        obj.printArray(arr2);
    }
}